package system;

import controller.ProductManager;
import model.Products;
import model.egg.ChickenEgg;
import model.egg.DucksEgg;
import model.meat.Beef;
import model.meat.Chicken;
import model.meat.Meat;
import model.meat.Pork;
import model.milk.FreshMilk;
import model.milk.Milk;
import model.milk.PreparedMilk;

import java.util.Scanner;

public class RunByAdmin {
    static ProductManager productManager = new ProductManager();
//    private final String MANAGER_OF_FILE = ProductManager.PRODUCT_MANAGEMENT;

//    private List<Products> listProductOfManager = readWriteFile.readData(MANAGER_OF_FILE);

    public final String SUCCESSFUL_NEW_CREATION = "Thao tác thành công!! ";

    public void menuManager() {
        Scanner input = new Scanner(System.in);
        int selectOption;
        do {
            System.out.println("╔============================================================╗");
            System.out.println("║              ▂ ▃ ▅ ▆ █ HỆ THỐNG ADMIN █ ▆ ▅ ▃ ▂            ║");
            System.out.println("╠============================================================╣");
            System.out.println("║>[1]. Thêm sản phẩm                                         ║");
            System.out.println("║>[2]. Sửa thông tin                                         ║");
            System.out.println("║>[3]. Xóa sản phẩm                                          ║");
            System.out.println("║>[4]. Hiển thị sản phẩm                                     ║");
//            System.out.println("║>[5]. Doanh thu sản phẩm                                    ║");
            System.out.println("║>[0]. Đăng xuất                                             ║");
            System.out.println("╚============================================================╝");
            selectOption = input.nextInt();

            switch (selectOption){

                case 0:
                    System.out.println("Bye!");
                    return;
                case 1:
                    System.out.println("╔===========================================╗");
                    System.out.println("║     ▂ ▃ ▅ ▆ █ THÊM SẢN PHẨM  █ ▆ ▅ ▃ ▂    ║");
                    System.out.println("╠===========================================╣");
                    System.out.println("║>[1]. Meat                                 ║");
                    System.out.println("║>[2]. Milk                                 ║");
                    System.out.println("║>[3]. Egg                                  ║");
                    System.out.println("║>[0]. Thoát                              ║");
                    System.out.println("╚===========================================╝");

                    int number = input.nextInt();

                    switch (number){
                        case 0: continue;
                        case 1: creatNewMeatProduct(); break;
                        case 2: creatNewMilkProduct(); break;
                        case 3: creatNewEggProduct(); break;
                        default: System.out.println("Chưa có mặt hàng này!!! Vui lòng chọn lại..");
                    }
                    break;

                case 2: editProductByIndex();break;
                case 3: deleteProductByIndex();break;
                case 4:
                    productManager.displayProduct();
                    break;
                default:
                    System.out.println("Tính năng chưa phát triển...!");
            }
        }while(true) ;
    }

    public Products creatNewMeatProduct(){
        Scanner input = new Scanner(System.in);
        Scanner input1 = new Scanner(System.in);

        try {
            int select;
            System.out.println("╔===========================================╗");
            System.out.println("║     ▂ ▃ ▅ ▆ █ THÊM SẢN PHẨM  █ ▆ ▅ ▃ ▂    ║");
            System.out.println("╠===========================================╣");
            System.out.println("║>[1]. Beef                                 ║");
            System.out.println("║>[2]. Chicken                              ║");
            System.out.println("║>[3]. Pork                                 ║");
            System.out.println("╚===========================================╝");
            select = input.nextInt();

            if (select <=0 || select > 3){
                System.out.println("Thao tác sai! Vui lòng nhập lại..");
                creatNewMeatProduct();
            }

            int id = Products.stt;
            Products.stt++;

            System.out.println("Nhập tên sản phẩm muốn tạo mới: ");
            String name = input1.nextLine();

            String manufacturing = productManager.checkDate();

            System.out.println("Nhập cân nặng:");
            double weight = input.nextDouble();

            System.out.println("Nhập giá tiền: ");
            int cost = input.nextInt();


            switch (select) {
                case 1 :
                    Beef meat1 = new Beef(manufacturing, cost, id, name, weight);
                    System.out.println(SUCCESSFUL_NEW_CREATION + meat1);
                    productManager.addProduct(meat1);
                    break;

                case 2 :
                    Chicken meat2 = new Chicken(manufacturing, cost, id, name, weight);
                    System.out.println(SUCCESSFUL_NEW_CREATION + meat2);
                    productManager.addProduct(meat2);;
                    break;

                case 3 :
                    Pork meat3 = new Pork(manufacturing, cost, id, name, weight);
                    System.out.println(SUCCESSFUL_NEW_CREATION + meat3);
                    productManager.addProduct(meat3);
                    break;
            }


        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        return null;
    }

    public Products creatNewMilkProduct(){
        Scanner input = new Scanner(System.in);

        try {
            int select;
            System.out.println("╔===========================================╗");
            System.out.println("║     ▂ ▃ ▅ ▆ █ THÊM SẢN PHẨM  █ ▆ ▅ ▃ ▂    ║");
            System.out.println("╠===========================================╣");
            System.out.println("║>[1]. FreshMilk                            ║");
            System.out.println("║>[2]. PreparedMilk                         ║");
            System.out.println("╚===========================================╝");
            select = input.nextInt();

            if (select <=0 || select > 2) {
                System.out.println("Thao tác sai! Vui lòng nhập lại..");
                creatNewMilkProduct();
            }
            Scanner input1 = new Scanner(System.in);

            int id = Products.stt;
            Products.stt++;

            System.out.println("Nhập tên sản phẩm muốn tạo mới: ");
            String name = input1.nextLine();

            String manufacturing = productManager.checkDate();

            System.out.println("Nhập thể tích (Ml):");
            int volume = input.nextInt();

            System.out.println("Nhập giá tiền: ");
            int cost = input.nextInt();


            switch (select) {
                case 1 :
                    Milk milk1 = new FreshMilk(manufacturing, cost, id, name, volume);
                    System.out.println(SUCCESSFUL_NEW_CREATION + milk1);
                    productManager.addProduct(milk1);
                    break;

                case 2 :
                    Milk milk2 = new PreparedMilk(manufacturing, cost, id, name, volume);
                    System.out.println(SUCCESSFUL_NEW_CREATION + milk2);
                    productManager.addProduct(milk2);
                    break;

                default : System.out.println("Thao tác sai! Vui lòng nhập lại..");
            }

        } catch (Exception e) {
            e.getMessage();
        }
        return null;
    }

    public Products creatNewEggProduct(){
        Scanner input = new Scanner(System.in);

        try {
            int select;
            System.out.println("╔===========================================╗");
            System.out.println("║     ▂ ▃ ▅ ▆ █ THÊM SẢN PHẨM  █ ▆ ▅ ▃ ▂    ║");
            System.out.println("╠===========================================╣");
            System.out.println("║>[1]. ChickenEgg                           ║");
            System.out.println("║>[2]. DucksEgg                             ║");
            System.out.println("╚===========================================╝");
            select = input.nextInt();

            if (select <=0 || select > 2){
                System.out.println("Thao tac sai! Vui long nhap lai..");
                creatNewEggProduct();
            }else {
                Scanner input1 = new Scanner(System.in);

                String manufacturing = productManager.checkDate();

                System.out.println("Nhập số lượng: ");
                int amount = input.nextInt();

                System.out.println("Nhập giá tiền: ");
                int cost = input.nextInt();

                int id = Products.stt;
                Products.stt++;

                switch (select) {
                    case 1:
                        ChickenEgg egg1 = new ChickenEgg(manufacturing, cost, id, amount);
                        System.out.println(SUCCESSFUL_NEW_CREATION + egg1);
                        productManager.addProduct(egg1);
                        break;

                    case 2 :
                        DucksEgg egg2 = new DucksEgg(manufacturing, cost, id, amount);
                        System.out.println(SUCCESSFUL_NEW_CREATION + egg2);
                        productManager.addProduct(egg2);
                        break;

                    default : System.out.println("Thao tác sai! Vui lòng nhập lại..");
                }
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return null;
    }

    public void editProductByIndex(){
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập ID sản phẩm muốn sửa: ");
        int index = input.nextInt();

        Products objectCorrected = productManager.productsList.get(index);
        if (objectCorrected instanceof Meat){
            Products newProduct = creatNewMeatProduct();
            productManager.editProductByIndex(index,newProduct);
        } else if (objectCorrected instanceof Milk) {
            Products newProduct = creatNewMilkProduct();
            productManager.editProductByIndex(index,newProduct);
        }else {
            Products newProduct = creatNewEggProduct();
            productManager.editProductByIndex(index,newProduct);
        }
        System.out.println(SUCCESSFUL_NEW_CREATION);
    }

    public void deleteProductByIndex(){
        try{
            Scanner input = new Scanner(System.in);
            System.out.println("Nhập id sản phẩm muốn xóa");
            int index = input.nextInt();
            productManager.deleteProductByIndex(index);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
