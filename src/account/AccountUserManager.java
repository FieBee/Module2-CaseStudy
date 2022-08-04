package account;

import storage.ReadWriteFile;

import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;

public class AccountUserManager implements Serializable {

    UserInfor userInfor  = new UserInfor();
    private ArrayList<AccountUser> accountUserList;

    private final ReadWriteFile readWriteFile = new ReadWriteFile();

    public static final String PATH_NAME_OF_USER_ACCOUNT = "FileData/userAccount.abc";

    public AccountUserManager(){
        try{
            if (!new File(PATH_NAME_OF_USER_ACCOUNT).exists()){
                new File(PATH_NAME_OF_USER_ACCOUNT).createNewFile();
            }
            if (new File(PATH_NAME_OF_USER_ACCOUNT).length() == 0){
                this.accountUserList =new ArrayList<>();
            }else {

                this.accountUserList = readWriteFile.readData(PATH_NAME_OF_USER_ACCOUNT);
            }
        } catch (IOException e) {
            e.getMessage();
        }

    }

    public ArrayList<AccountUser> getUserAccounts() {
        return accountUserList;
    }

    public void addAccount(AccountUser accountUser){
        try{
            if (!new File(PATH_NAME_OF_USER_ACCOUNT).exists()){
                new File(PATH_NAME_OF_USER_ACCOUNT).createNewFile();
            }
            if (new File(PATH_NAME_OF_USER_ACCOUNT).length() == 0){
                this.accountUserList =new ArrayList<>();
            }else {
                this.accountUserList = readWriteFile.readData(PATH_NAME_OF_USER_ACCOUNT);
            }
            accountUserList.add(accountUser);
            readWriteFile.writeData(accountUserList, PATH_NAME_OF_USER_ACCOUNT);
        } catch (IOException e) {
            e.getMessage();
        }

    }


//    removeIf(): loại bỏ phần tử của colection thỏa mãn điều kiện đã cho
    public void deleteAccount(String userAccount){
        boolean check = accountUserList.removeIf(a -> a.getUserName().equalsIgnoreCase(userAccount));
        if (check){
            System.out.println("[\uD83D\uDC4C] Xóa tài khoản " + userAccount + " thành công ");
            System.out.println("-----------------------------------------------------");
        } else {
        System.out.println("[❌] Không tìm thấy tài khoản trên");
        System.out.println("------------------------------------------------");
        readWriteFile.readData(PATH_NAME_OF_USER_ACCOUNT);

    }

    }

    public void displayUserAccount(){
        int number = 1;
        accountUserList = readWriteFile.readData(PATH_NAME_OF_USER_ACCOUNT);
        if (accountUserList.isEmpty()){
            System.out.println("[❌] Chưa có tài khoản nào đăng ký !!!");
            System.out.println("----------------------------------------------");
        }
        else {
            System.err.printf("         Tài khoản khách hàng (Account-Password)    ");
            System.err.printf("\n");
            for (AccountUser account: accountUserList
                 ) {
                System.out.println(number+". " + account);
                number++;
            }
            System.out.println("");
            System.out.println("");
        }
    }

    public String getPATH_NAME_OF_USER_ACCOUNT() {
        return PATH_NAME_OF_USER_ACCOUNT;
    }
}
