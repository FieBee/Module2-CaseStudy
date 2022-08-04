package system;

import controller.ProductManager;
import controller.ProductUser;

import java.util.Scanner;

public class RunByUser {
    private static ProductUser productUser = new ProductUser();
    private static ProductManager productManager = new ProductManager();


//    public static void main(String[] args) {
//        menuUser();
//    }
     public void menuUser(){
         Scanner input = new Scanner(System.in);
         int selectOption;
         do {
             System.out.println("Sản phẩm đang bán: ");
             productManager.displayProduct();


             System.out.println("╔============================================================╗");
             System.out.println("║             ▂ ▃ ▅ ▆ █  HỆ THỐNG USER  █ ▆ ▅ ▃ ▂            ║");
             System.out.println("╠============================================================╣");
             System.out.println("║>[1]. Thêm sản phẩm vào giỏ hàng                            ║");
             System.out.println("║>[2]. Kiểm tra giỏ hàng                                     ║");
             System.out.println("║>[3]. Thanh toán                                            ║");
             System.out.println("║>[0]. Đăng xuất                                             ║");
             System.out.println("╚============================================================╝");
             selectOption = input.nextInt();

             switch (selectOption){

                 case 0:
                     System.out.println("Bye!");
                     return;
                 case 1:
                     productUser.display();

                     break;

//                 case 2: editProductByIndex();break;
//                 case 3: deleteProductByIndex();break;
//                 case 4: LinkedList<Products> readData = readWriteFile.readData(MANAGER_OF_FILE) ;
//                     System.out.println(readData);break;
                 default:
                     System.out.println("Tính năng chưa phát triển...!");
             }
         }while(true) ;
     }


     public void displayShop(){

     }

}
