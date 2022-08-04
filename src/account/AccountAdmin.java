package account;

import java.io.Serializable;
import java.util.ArrayList;

public class AccountAdmin implements Serializable {
    private String adminName;
    private String adminPassword;
    private final ArrayList<AccountAdmin> accountsAdminList = new ArrayList<AccountAdmin>();

    public AccountAdmin(String adminName, String adminPassword) {
        this.adminName = adminName;
        this.adminPassword = adminPassword;
    }
    public AccountAdmin(){
        accountsAdminList.add(new AccountAdmin("Admin1","111111"));
        accountsAdminList.add(new AccountAdmin("Admin2","222222"));
        accountsAdminList.add(new AccountAdmin("Admin3","333333"));
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
