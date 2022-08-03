package login;

import account.AccountAdmin;
import account.AccountUser;
import account.AccountUserManager;
import system.RunByAdmin;
import system.RunByUser;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Login {
    RunByUser runByUser = new RunByUser();
    RunByAdmin runByAdmin = new RunByAdmin();
    AccountUser accountUser = new AccountUser();
    AccountAdmin accountAdmin = new AccountAdmin();
    AccountUserManager accountUserManager = new AccountUserManager();

    Scanner scanner = new Scanner(System.in);
    public Login() {
    }

    public void menuLogin() throws NumberFormatException {
        do {
            System.out.println("╔============================================╗");
            System.out.println("║   ▂ ▃ ▅ ▆ █     EIYOU SHOP    █ ▆ ▅ ▃ ▂    ║");
            System.out.println("╠============================================╣");
            System.out.println("║>[1]. Đăng nhập                             ║");
            System.out.println("║>[2]. Đăng ký tài khoản                     ║");
            System.out.println("║>[0]. Thoát                                 ║");
            System.out.println("╚============================================╝");
            System.out.print("[\uD83D\uDC4B] Nhập lựa chọn: ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    loginManager();
                    break;
                case 2:
//                    registerAccountUser();
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
    public void loginManager() throws InputMismatchException {
        System.out.println("┎──────────────[ĐĂNG NHẬP]──────────────┒");
        System.out.print("┠ ▹ Nhập tài khoản: ");
        String account = scanner.nextLine();
        System.out.print("┠ ▹ Nhập mật khẩu: ");
        String password = scanner.nextLine();
        System.out.println("┖───────────────────────────────────────┚");
//        (account, password);


    }

    public static void main(String[] args) {
        Login login = new Login();
        login.menuLogin();
    }

    public void checkAccount(String account, String password){
        if (checkAccountAdmin(account,password)){
            System.out.println("[\uD83D\uDD13] Đặng nhập hệ thống bởi ADMIN thành công !!!");
            System.out.println("------------------------------------------------------------");
            runByAdmin.menuManager();
        } else if (checkAccountUser(account, password)) {
            System.out.println("[\uD83D\uDD13] Đăng nhập hệ thống bởi USER thành công !!!");
            System.out.println("----------------------------------------------------------");
            runByUser.displayShop();
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
        for (AccountUser accUser : accountUser.getAccountUserArrayList()){
            boolean check = name.equals(accUser.getUserName()) && password.equals(accUser.getUserPassword());
            if (check){
                return true;
            }
            return false;

        }
    }









}
