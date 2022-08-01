package view;


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
import storage.ReadWriteFile;

import java.util.LinkedList;
import java.util.Scanner;



public class Client {

    private static final String MANAGEROFFILE = ProductManager.PRODUCTMANAGEMENT;
    private static final ReadWriteFile readWriteFile = new ReadWriteFile();
    public static final String SUCCESSFUL_NEW_CREATION = "Thao tác thành công!! ";

    static ProductManager productManager = new ProductManager();
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int selectOption;
        do {
            System.out.println("------------------------------");
            System.out.println("Chọn thao tác: ");
            System.out.println("   1. Thêm sản phẩm.");
            System.out.println("   2. Sửa thông tin sản phẩm theo id.");
            System.out.println("   3. Xoá sản phẩm theo id.");
            System.out.println("   4. Hiển thị danh sách sản phẩm.");
            System.out.println("   5. Thông tin chiết khấu chênh lệch. ");
            System.out.println("   0. Thoát khỏi chương trình. ");
            System.out.println("------------------------------");
            selectOption = input.nextInt();

            switch (selectOption){

                case 0:
                    System.out.println("Bye!");
                    return;
                case 1:
                        System.out.println("Creat new product: ");
                        System.out.println("    1. Meat");
                        System.out.println("    2. Milk");
                        System.out.println("    3. Egg");

                        int number = input.nextInt();

                        switch (number){
                            case 1: creatNewMeatProduct(); break;
                            case 2: creatNewMilkProduct(); break;
                            case 3: creatNewEggProduct(); break;
                            default: System.out.println("Chua co mat hang nay!!! Vui long nhap lai..");
                        }
                        break;

                case 2: editProductByIndex();break;
                case 3: deleteProductByIndex();break;
                case 4: LinkedList<Products> readData = readWriteFile.readData(MANAGEROFFILE) ;
                        System.out.println(readData);
                break;
//                case 5: materialManager.exchangeRateDifference(arr);break;
                default:
                    System.out.println("Tính năng chưa phát triển...!");
            }
        }while(true) ;


    }

    public static Products creatNewMeatProduct(){
        Scanner input = new Scanner(System.in);
        Scanner input1 = new Scanner(System.in);

        try {
            int select;
                System.out.println("Creat new meat product: ");
                System.out.println("    1. Beef");
                System.out.println("    2. Chicken");
                System.out.println("    3. Pork");
                select = input.nextInt();

                if (select <=0 || select > 3){
                    System.out.println("Thao tac sai! Vui long nhap lai..");
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

                    case 2 :
                        Chicken meat2 = new Chicken(manufacturing, cost, id, name, weight);
                        System.out.println(SUCCESSFUL_NEW_CREATION + meat2);
                        productManager.addProduct(meat2);;

                    case 3 :
                        Pork meat3 = new Pork(manufacturing, cost, id, name, weight);
                        System.out.println(SUCCESSFUL_NEW_CREATION + meat3);
                        productManager.addProduct(meat3);;
                    }


        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        return null;
    }

    public static Products creatNewMilkProduct(){
        Scanner input = new Scanner(System.in);

        try {
            int select;
                System.out.println("Creat new milk product: ");
                System.out.println("    1. FreshMilk");
                System.out.println("    2. PreparedMilk");
                select = input.nextInt();

                if (select <=0 || select > 2) {
                    System.out.println("Thao tac sai! Vui long nhap lai..");
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

                    case 2 :
                        Milk milk2 = new PreparedMilk(manufacturing, cost, id, name, volume);
                        System.out.println(SUCCESSFUL_NEW_CREATION + milk2);
                        productManager.addProduct(milk2);

                    default : System.out.println("Thao tac sai! Vui long nhap lai..");
                }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return null;
    }

    public static Products creatNewEggProduct(){
        Scanner input = new Scanner(System.in);

        try {
            int select;
                System.out.println("Creat new egg product: ");
                System.out.println("    1. Ducks Egg");
                System.out.println("    2. Chicken Egg");
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

                case 2 :
                        DucksEgg egg2 = new DucksEgg(manufacturing, cost, id, amount);
                        System.out.println(SUCCESSFUL_NEW_CREATION + egg2);
                        productManager.addProduct(egg2);

                    default : System.out.println("Thao tac sai! Vui long nhap lai..");
                }
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return null;
    }

    public static void editProductByIndex(){
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap id san pham muon sua");
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

    public static void deleteProductByIndex(){
        try{
            Scanner input = new Scanner(System.in);
            System.out.println("Nhap id san pham muon xoa");
            int index = input.nextInt();
            productManager.deleteProductByIndex(index);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

}









