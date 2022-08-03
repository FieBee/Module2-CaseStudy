package login;

import account.AccountAdmin;
import account.AccountUser;
import account.AccountUserManager;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Login {
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

    public boolean checkAccountAdmin(String name, String password){
            for (AccountAdmin accAdmin : accountAdmin.getAccountsAdminList()){
                boolean checkAccountAdmin = name.equals(accAdmin.getAdminName()) && password.equals(accAdmin.getAdminPassword());
                if (checkAccountAdmin){
                    return true;
                }
            }
            return false;
    }









}
