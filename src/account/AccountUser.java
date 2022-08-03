package account;

import java.util.ArrayList;

public class AccountUser {

    private String userName;
    private String userPassword;

    private final ArrayList<AccountUser> accountUserArrayList = new ArrayList<>();

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

    @Override
    public String toString() {
        return String.format("║ %-15s ║ %-15s ║",userName,userPassword);
    }

}
