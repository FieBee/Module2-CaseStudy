package account;

import java.io.Serializable;
import java.util.ArrayList;

public class AccountUser implements Serializable {
//    public static int numCart = 0;
    private String userName;
    private String userPassword;
//    public static ArrayList<Products> cart = new ArrayList<>();

    private ArrayList<AccountUser> accountUserArrayList = new ArrayList<>();

    public AccountUser(String userName, String userPassword) {
//        cart = new ArrayList<>();
        this.userName = userName;
        this.userPassword = userPassword;
    }

    public AccountUser(){}

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public ArrayList<AccountUser> getAccountUserArrayList() {
        return accountUserArrayList;
    }

    public void setAccountUserArrayList(ArrayList<AccountUser> users) {
        this.accountUserArrayList = users;
    }


    @Override
    public String toString() {
        return String.format("║ %-15s ║ %-15s ║",userName,userPassword);
    }

}
