package account;

import storage.ReadWriteFile;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class AccountUserManager {
    private ArrayList<AccountUser> accountUserList;

    private final ReadWriteFile readWriteFile = new ReadWriteFile();

    private final String PATH_NAME_OF_USER_ACCOUNT = "FileData/userAccount";

    public AccountUserManager(){
        if (!new File(PATH_NAME_OF_USER_ACCOUNT).exists()){
            try{
                new File(PATH_NAME_OF_USER_ACCOUNT).createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        if (new File(PATH_NAME_OF_USER_ACCOUNT).length() == 0){
            this.accountUserList =new ArrayList<>();
        }else {
            this.accountUserList = readWriteFile.readData(PATH_NAME_OF_USER_ACCOUNT);
        }
    }

    public ArrayList<AccountUser> getUserAccounts() {
        return accountUserList;
    }

    public void addAccount(AccountUser accountUser){
        accountUserList.add(accountUser);
        readWriteFile.writeData(accountUserList, PATH_NAME_OF_USER_ACCOUNT);
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
}
