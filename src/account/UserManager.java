package account;

import storage.ReadWriteFile;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class UserManager {
    private ArrayList<UserInfor> userInforArrayList;
    private ReadWriteFile readWriteFile =new ReadWriteFile();
    private final String PATH_NAME_OF_USER = "FileData/userinfor";

    public UserManager(){
        if (!new File(PATH_NAME_OF_USER).exists()){
            try{
                new File(PATH_NAME_OF_USER).createNewFile();
            } catch (IOException e) {
                e.getMessage();
            }
        }
        if (new File(PATH_NAME_OF_USER).length() == 0){
            userInforArrayList = new ArrayList<>();
        }else {
            userInforArrayList =readWriteFile.readData(PATH_NAME_OF_USER);
        }
    }

    public ArrayList<UserInfor> getUserInforArrayList() {
        return userInforArrayList;
    }

    public void addUserInfor(UserInfor userInfor){
        userInforArrayList.add(userInfor);
    }
}
