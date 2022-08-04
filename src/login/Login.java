package login;

import account.*;
import storage.ReadWriteFile;
import system.RunByAdmin;
import system.RunByUser;
import validate.Validate;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Login {

    private ReadWriteFile readWriteFile = new ReadWriteFile();
    private AccountUserManager accountUserManager = new AccountUserManager();
    private UserManager userManager = new UserManager();
    private UserInfor userInfor = new UserInfor();
    private Validate validate = new Validate();
    private RunByUser runByUser = new RunByUser();
    private RunByAdmin runByAdmin = new RunByAdmin();
    private AccountUser accountUser = new AccountUser();
    private AccountAdmin accountAdmin = new AccountAdmin();

    public static String accountName = "";

//    private NewAccount newAccount = new NewAccount();

//    AccountUserManager accountUserManager = new AccountUserManager();

    Scanner scanner = new Scanner(System.in);
    public Login() {
    }

    public void menuLogin() {
        do {
            System.out.println("╔============================================╗");
            System.out.println("║   ▂ ▃ ▅ ▆ █     EIYOU SHOP    █ ▆ ▅ ▃ ▂    ║");
            System.out.println("╠============================================╣");
            System.out.println("║>[1]. Đăng nhập                             ║");
            System.out.println("║>[2]. Đăng ký tài khoản                     ║");
            System.out.println("║>[0]. Thoát                                 ║");
            System.out.println("╚============================================╝");
            System.out.print("[\uD83D\uDC4B] Nhập lựa chọn: ");
            System.out.println("");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    loginManager();
                    break;
                case 2:
                    creatAccount();
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("[❌] Lựa chọn không tồn tại, mời bạn nhập lại !!!");
                    break;
            }
        } while (true);
    }
    public void loginManager(){
        try{
            System.out.println("┎──────────────[ĐĂNG NHẬP]──────────────┒");
            System.out.print("┠ ▹ Nhập tài khoản: ");
            String account = scanner.nextLine();

            Login.accountName = account;

            System.out.print("┠ ▹ Nhập mật khẩu: ");
            String password = scanner.nextLine();
            System.out.println("┖───────────────────────────────────────┚");
            System.out.println("");
            checkAccount(account,password);
        } catch (Exception e) {
            e.getMessage();
        }
    }



    public void checkAccount(String account, String password){
        try {
            if (checkAccountAdmin(account,password)){
                System.out.println("[\uD83D\uDD13] Đặng nhập hệ thống bởi ADMIN thành công !!!");
                System.out.println("------------------------------------------------------------");
                runByAdmin.menuManager();
            } else if (checkAccountUser(account, password)) {
                System.out.println("[\uD83D\uDD13] Đăng nhập hệ thống bởi USER thành công !!!");
                System.out.println("----------------------------------------------------------");
//                runByUser.displayShop();
                runByUser.menuUser();
            }else {
                System.err.println("");
                System.out.println("--- Tên đăng nhập hoặc mật khẩu không đúng! Mời nhập lại: ---");
                System.out.println("-------------------------------------------------------------");
                loginManager();
            }
        } catch (InputMismatchException e) {
            e.getMessage();
        }

    }

    public boolean checkAccountAdmin(String name, String password){
            for (AccountAdmin accAdmin : accountAdmin.getAccountsAdminList()){
                boolean check = name.equals(accAdmin.getAdminName()) && password.equals(accAdmin.getAdminPassword());
                if (check){
                    return true;
                }
            }
            return false;
    }

    public boolean checkAccountUser(String name, String password){

        String file = accountUserManager.getPATH_NAME_OF_USER_ACCOUNT();
        accountUser.setAccountUserArrayList(readWriteFile.readData(file) );
        for (AccountUser accUser : accountUser.getAccountUserArrayList()){
            boolean check = name.equals(accUser.getUserName()) && password.equals(accUser.getUserPassword());
            if (check){
                return true;
            }


        }return false;
    }


    public void creatAccount(){
        Scanner input = new Scanner(System.in);
        System.out.println("┎──────────────[ĐĂNG KÝ]──────────────┒");
        System.out.println("[\uD83D\uDD11] Mời bạn nhập thông tin:");
        System.out.println("--------------------------------------");
        String accountName = checkAccountName();
        String accountPassword = checkPassword();
        System.out.print("┠ ▹ Nhập tên: ");
        String name = scanner.nextLine();
        System.out.print("┠ ▹ Nhập địa chỉ: ");
        String address = scanner.nextLine();
        String phoneNumber = checkPhoneNumber();
        String email = checkEmail();
        System.out.println("┖─────────────────────────────────────┚");
        System.out.println("");
        checkAccountUser(accountName, accountPassword, name, address, phoneNumber, email);
    }

    public String checkAccountName() {
        String accountUser;
        while (true) {
            System.out.print("┠ ▹ Nhập tài khoản (8 - 12 ký tự (a,1,...): ");
            String account = scanner.nextLine();
            if (!validate.validateAccount(account)) {
                System.out.println("[❌] Tài khoản không hợp lệ !!!");
//                System.out.println(">[Chú ý]: Tài khoản phải từ 8 - 12 ký tự (a,1,...)");
                System.out.println("---------------------------------------------------");
            } else {
                accountUser = account;
                break;
            }
        }
        return accountUser;
    }

    public String checkPassword() {
        String passwordUser;
        while (true) {
            System.out.print("┠ ▹ Nhập passwword (8 - 16 ký tự (a,A,1,...)): ");
            String password = scanner.nextLine();
            if (!validate.validatePassword(password)) {
                System.out.println("[❌] Mật khẩu không hợp lệ !!!");
//                System.out.println(">[Chú ý]: Mật khẩu phải từ 8 - 16 ký tự (a,A,1,...)hoặc ký tự đặc biệt");
                System.out.println("-----------------------------------------");
            } else {
                passwordUser = password;
                break;
            }
        }
        return passwordUser;
    }

    public String checkPhoneNumber() {
        String phoneNumber;
        while (true) {
            System.out.print("┠ ▹ Nhập số điện thoại: ");
            String phone = scanner.nextLine();
            if (!validate.validatePhone(phone)) {
                System.out.println("[❌] Số điện thoại không hợp lệ !!!");
                System.out.println(">[Chú ý]: Số điện thoại phải có 10 số: ");
                System.out.println("------------------------------------------");
            } else {
                phoneNumber = phone;
                break;
            }
        }
        return phoneNumber;
    }

    public String checkEmail() {
        String email;
        while (true) {
            System.out.print("┠ ▹ Nhập email: ");
            String inputEmail = scanner.nextLine();
            if (!validate.validateEmail(inputEmail)) {
                System.out.println("[❌] Email không hợp lệ !!!");
                System.out.println(">[Chú ý]: Email phải có dạng: abc@yahoo.com/ Xyz.a@gmail.vn/...");
                System.out.println("--------------------------------------------");
            } else {
                email = inputEmail;
                break;
            }
        }
        return email;
    }

    public void checkAccountUser(String accountUser, String passwordUser, String name, String address, String phoneNumber, String email) {
        if (checkNameAccount(accountUser)) {
            System.out.println("[❌] Tài khoản đã tồn tại. Vui lòng đăng ký lại !!!");
            System.out.println("---------------------------------------");
        } else {
            userManager.addUserInfor(new UserInfor(name,phoneNumber,address,email));
            accountUserManager.addAccount(new AccountUser(accountUser,passwordUser));
            System.out.println("[\uD83D\uDC4C] Đăng ký thành công !!!");
            System.out.println("----------------------------------------");
            System.out.println();
        }
        loginManager();
    }

    public boolean checkNameAccount(String nameAccountUser) {
        for (AccountUser account : accountUser.getAccountUserArrayList()) {
            boolean checkAccountUser = nameAccountUser.equals(account.getUserName());
            if (checkAccountUser) {
                return true;
            }
        }
        return false;
    }







}
