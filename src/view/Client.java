package view;


import storage.ReadWriteFile;
import system.RunByAdmin;



public class Client {

    private static RunByAdmin admin = new RunByAdmin();
//    private static final String CART_OF_FILE = ProductUser.CART_MANAGEMENT;

    private static final ReadWriteFile readWriteFile = new ReadWriteFile();


//    private static  List<Products> getListProductOfUser = readWriteFile.readData(CART_OF_FILE);
    public static final String SUCCESSFUL_NEW_CREATION = "Thao tác thành công!! ";


    public static void main(String[] args) {
        admin.menuManager();
    }




//     public static void MenuUser(){
//         Scanner input = new Scanner(System.in);
//         int selectOption;
//         do {
//             System.out.println("╔============================================================╗");
//             System.out.println("║             ▂ ▃ ▅ ▆ █  HỆ THỐNG USER  █ ▆ ▅ ▃ ▂            ║");
//             System.out.println("╠============================================================╣");
//             System.out.println("║>[1]. Thêm sản phẩm vào giỏ hàng                            ║");
//             System.out.println("║>[2]. Kiểm tra giỏ hàng                                     ║");
//             System.out.println("║>[3]. Thanh toán                                            ║");
//             System.out.println("║>[0]. Đăng xuất                                             ║");
//             System.out.println("╚============================================================╝");
//             selectOption = input.nextInt();
//
//             switch (selectOption){
//
//                 case 0:
//                     System.out.println("Bye!");
//                     return;
//                 case 1:
//                     System.out.println("╔===========================================╗");
//                     System.out.println("║   ▂ ▃ ▅ ▆ █ THÊM VÀO GIỎ HÀNG █ ▆ ▅ ▃ ▂   ║");
//                     System.out.println("╠===========================================╣");
//                     System.out.println("║>[1]. Meat                                 ║");
//                     System.out.println("║>[2]. Milk                                 ║");
//                     System.out.println("║>[3]. Egg                                  ║");
//                     System.out.println("╚===========================================╝");
//
//                     int number = input.nextInt();
//
//                     switch (number){
////                         case 1: creatNewMeatProduct(); break;
////                         case 2: creatNewMilkProduct(); break;
////                         case 3: creatNewEggProduct(); break;
//                         default: System.out.println("Chua co mat hang nay!!! Vui long nhap lai..");
//                     }
//                     break;
//
////                 case 2: editProductByIndex();break;
////                 case 3: deleteProductByIndex();break;
////                 case 4: LinkedList<Products> readData = readWriteFile.readData(MANAGER_OF_FILE) ;
////                     System.out.println(readData);break;
//                 default:
//                     System.out.println("Tính năng chưa phát triển...!");
//             }
//         }while(true) ;
//     }


}









