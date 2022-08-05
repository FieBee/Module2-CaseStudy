package system;

import controller.ProductManager;
import controller.ProductUser;
import login.Login;
import model.Bill;
import model.Products;
import storage.ReadWriteFile;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

import static controller.ProductManager.PRODUCT_MANAGEMENT;

public class RunByUser {

    private static RunByUser instance = null;
    private RunByUser() {
    }

    public static RunByUser getInstance(){
        if (instance == null) instance = new RunByUser();
        return instance;
    }

    private ArrayList<Bill> billArrayList = new ArrayList<>();
    private ReadWriteFile readWriteFile = ReadWriteFile.getInstance();
    ArrayList<Products> arrayList = readWriteFile.readData(ProductUser.CART_MANAGEMENT);
    private static ProductUser productUser = new ProductUser();
    private static ProductManager productManager = ProductManager.getInstance();


     public void menuUser(){
         Scanner input = new Scanner(System.in);
         int selectOption;
         do {
             System.out.println("--------------------------------------------------------------");
             System.out.println("Sản phẩm đang bán: ");
             productManager.displayProduct();

             System.out.println("--------------------------------------------------------------");
             System.out.println("╔============================================================╗");
             System.out.println("║                            USER                            ║");
             System.out.println("╠============================================================╣");
             System.out.println("║  1. Thêm sản phẩm vào giỏ hàng                            ║");
             System.out.println("║  2. Xóa  sản phẩm khỏi giỏ hàng                           ║");
             System.out.println("║  3. Kiểm tra giỏ hàng                                     ║");
             System.out.println("║  4. Thanh toán                                            ║");
             System.out.println("║  0. Đăng xuất                                             ║");
             System.out.println("╚============================================================╝");
             selectOption = input.nextInt();

             switch (selectOption){

                 case 0:
                     System.out.println("Bye!");
                     Login login = new Login();
                     login.menuLogin();
                     break;
                 case 1:
                     addProduct();
                     break;

                 case 2:deleteProductToCart();
                     ;break;
                 case 3: displayCart();break;
                 case 4: getTotalPrice(); break;
                 default:
                     System.out.println("Tính năng chưa phát triển...!");
             }
         }while(true) ;
     }

     public void addProduct(){
         Scanner input = new Scanner(System.in);
         try{
             System.out.println("Nhập sản phẩm muốn thêm từ giỏ hàng: ");
             int select = input.nextInt();

             arrayList =  readWriteFile.readData(PRODUCT_MANAGEMENT);
             productUser.addProductToCart(arrayList.get(select));
             readWriteFile.writeData(productUser.getCart(), ProductUser.CART_MANAGEMENT);
             System.out.println("Thêm thành công!! "+ arrayList.get(select));
         } catch (Exception e) {
             System.err.println("Sản phẩm không tồn tại!!!");
             e.getMessage();
         }
         readWriteFile.writeData(arrayList, ProductUser.CART_MANAGEMENT);
     }

     public void displayCart(){
        int number = 0;
        if (arrayList.isEmpty()){
            System.out.println("Giỏ hàng trống!!");
            menuUser();
        }else {

            System.out.println("Sản phẩm trong giỏ hàng: ");
            for (Products obj: arrayList
                 ) {
                System.out.println(number +". "+ obj);
                number++;
            }
        }

     }

     public void getTotalPrice(){
         System.out.println("Hóa đơn của bạn: ");
         int totalPrice = productUser.cartPayment();
         Bill bill = new Bill(Login.accountName, arrayList,totalPrice, LocalDateTime.now());
         bill.display();

     }

     public void deleteProductToCart(){
         Scanner input = new Scanner(System.in);
         System.out.println("Nhập vị trí sản phẩm muốn xóa khỏi giỏ hàng: ");
         int index = input.nextInt();
         arrayList = readWriteFile.readData(ProductUser.CART_MANAGEMENT);
         if (index>=arrayList.size() || index<0){
             System.out.println("Sản phẩm không tồn tại trong giỏ hàng!!!");
         }else{
             System.out.println("Xóa thành công!!");
             System.out.println(arrayList.get(index));
             arrayList.remove(index);

             System.out.println("Giỏ hàng: ");
             arrayList.forEach(System.out::println);
         }
         readWriteFile.writeData(arrayList, ProductUser.CART_MANAGEMENT);

     }


}
