package account;

import storage.ReadWriteFile;

import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;

public class UserManager implements Serializable {
    private ArrayList<UserInfor> userInforArrayList;
    private ReadWriteFile readWriteFile = ReadWriteFile.getInstance();
    public static final String INFOR_OF_USER = "FileData/userinfor.abc";

    public UserManager(){
        if (!new File(INFOR_OF_USER).exists()){
            try{
                new File(INFOR_OF_USER).createNewFile();
            } catch (IOException e) {
                e.getMessage();
            }
        }
        if (new File(INFOR_OF_USER).length() == 0){
            userInforArrayList = new ArrayList<>();
        }else {
            userInforArrayList =readWriteFile.readData(INFOR_OF_USER);
        }
    }

    public ArrayList<UserInfor> getUserInforArrayList() {
        userInforArrayList = readWriteFile.readData(INFOR_OF_USER);
        return userInforArrayList;
    }

    public void addUserInfor(UserInfor userInfor){
        if (!new File(INFOR_OF_USER).exists()){
            try{
                new File(INFOR_OF_USER).createNewFile();
            } catch (IOException e) {
                e.getMessage();
            }
        }
        if (new File(INFOR_OF_USER).length() == 0){
            userInforArrayList = new ArrayList<>();
        }else {
            userInforArrayList = readWriteFile.readData(INFOR_OF_USER);
        }
        userInforArrayList.add(userInfor);
        readWriteFile.writeData(userInforArrayList,INFOR_OF_USER);
    }

    public void displayUserInfor(){
        userInforArrayList = readWriteFile.readData(INFOR_OF_USER);
        if (userInforArrayList.isEmpty()){
            System.out.println("Chưa có thông tin người dùng nào đăng kí!!");
            System.out.println("-------------------------------------------");
        }else {
            System.out.println("    nameUser  -  phonenumberUser  -  emailUser  -  addressUser");
            userInforArrayList.forEach(System.out::println);
            System.out.println("--------------------------------------------");
        }

    }
}
