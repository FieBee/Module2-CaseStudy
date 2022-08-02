package account;

import java.util.ArrayList;

public class AccountAdmin {
    private String adminName;
    private String adminPassword;
    private final ArrayList<AccountAdmin> accountsAdminList = new ArrayList<AccountAdmin>();

    public AccountAdmin(String adminName, String adminPassword) {
        this.adminName = adminName;
        this.adminPassword = adminPassword;
    }
    public AccountAdmin(){
        accountsAdminList.add(new AccountAdmin("Admin1","123456"));
        accountsAdminList.add(new AccountAdmin("Admin2","123456"));
        accountsAdminList.add(new AccountAdmin("Admin3","123456"));
    }

    public ArrayList<AccountAdmin> getAccountsAdminList() {
        return accountsAdminList;
    }

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    public String getAdminPassword() {
        return adminPassword;
    }

    public void setAdminPassword(String adminPassword) {
        this.adminPassword = adminPassword;
    }

    @Override
    public String toString() {
        return "AdminAccount: " + "adminAcc = '" + adminName + '\'' + ", adminPass = '" + adminPassword + '\'';
    }
}
