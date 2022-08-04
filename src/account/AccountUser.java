package account;

import java.io.Serializable;
import java.util.ArrayList;

public class AccountUser implements Serializable {
//    private static final long serialVersionUID = 6128016096756071380L;
    private String userName;
    private String userPassword;

    private ArrayList<AccountUser> accountUserArrayList = new ArrayList<>();

    public AccountUser(String userName, String userPassword) {
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
