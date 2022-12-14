package account;

import java.io.Serializable;

public class UserInfor implements Serializable {
    private String nameUser;
    private String phonenumberUser;
    private String addressUser;
    private String emailUser;

    public UserInfor(String nameUser, String phonenumberUser, String addressUser, String emailUser) {
        this.nameUser = nameUser;
        this.phonenumberUser = phonenumberUser;
        this.addressUser = addressUser;
        this.emailUser = emailUser;
    }

    public UserInfor() {
    }

    public String getEmailUser() {
        return emailUser;
    }

    public void setEmailUser(String emailUser) {
        this.emailUser = emailUser;
    }

    public String getNameUser() {
        return nameUser;
    }

    public void setNameUser(String nameUser) {
        this.nameUser = nameUser;
    }

    public String  getPhonenumberUser() {
        return phonenumberUser;
    }

    public void setPhonenumberUser(String phonenumberUser) {
        this.phonenumberUser = phonenumberUser;
    }

    public String getAddressUser() {
        return addressUser;
    }

    public void setAddressUser(String addressUser) {
        this.addressUser = addressUser;
    }


    public String toString() {
        System.out.println(nameUser + "  -  "+ phonenumberUser + "  -  "+  emailUser + "  -  "+  addressUser );
        return null;
    }
}
