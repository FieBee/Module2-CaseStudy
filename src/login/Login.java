package login;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Login {

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
                    registerAccountUser();
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
//        checkAccount(account, password);

//    public void checkAccount(String account, String password){}
//    public boolean checkLoginAccountAdmin(String account, String password) {
//        return false;
//    }

    }

    public void registerAccountUser(){
        System.out.println("┎──────────────[ĐĂNG KÝ]──────────────┒");
        System.out.println("[\uD83D\uDD11] Mời bạn nhập thông tin:");
        System.out.println("--------------------------------------");
    }

//    public String registerAccountName() {
//        String accountUser;
//        while (true) {
//            System.out.print("┠ ▹ Nhập tài khoản: ");
//            String account = scanner.nextLine();
//            if (!validate.validateAccount(account)) {
//                System.out.println("[❌] Tài khoản không hợp lệ !!!");
//                System.out.println(">[Chú ý]: Tài khoản phải từ 8 - 12 ký tự (a,1,...)");
//                System.out.println("---------------------------------------------------");
//            } else {
//                accountUser = account;
//                break;
//            }
//        }
//        return accountUser;
//    }
//
//    public String registerPassword() {
//        String passwordUser;
//        while (true) {
//            System.out.print("┠ ▹ Nhập passwword: ");
//            String password = scanner.nextLine();
//            if (!validate.validatePassword(password)) {
//                System.out.println("[❌] Mật khẩu không hợp lệ !!!");
//                System.out.println(">[Chú ý]: Mật khẩu phải từ 8 - 16 ký tự (a,A,1,...)hoặc ký tự đặc biệt");
//                System.out.println("-----------------------------------------");
//            } else {
//                passwordUser = password;
//                break;
//            }
//        }
//        return passwordUser;
//    }

}
