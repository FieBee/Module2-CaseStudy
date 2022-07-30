package view;

import controller.ProductManager;
import model.Products;
import model.egg.DucksEgg;
import model.egg.Egg;
import model.meat.Beef;
import model.meat.Chicken;
import model.meat.Meat;
import model.meat.Pork;
import model.milk.FreshMilk;
import model.milk.Milk;
import model.milk.PreparedMilk;

import java.util.Scanner;

public class Client {

    static ProductManager productManager = new ProductManager();
    public static void main(String[] args) {

//        Scanner input = new Scanner(System.in);
//        int selectOption;
//        do {
//            System.out.println("------------------------------");
//            System.out.println("Chọn thao tác: ");
//            System.out.println("   1. Thêm sản phẩm");
//            System.out.println("   2. Sửa thông tin sản phẩm theo id.");
//            System.out.println("   3. Xoá sản phẩm theo id.");
//            System.out.println("   4. Hiển thị danh sách sản phẩm.");
//            System.out.println("   5. Thông tin chiết khấu chênh lệch. ");
//            System.out.println("   0. Thoát khỏi chương trình. ");
//            System.out.println("------------------------------");
//            selectOption = input.nextInt();
//
//            switch (selectOption){
//                case 0:
//                    System.out.println("Bye!");
//                    return;
//                case 1:
//                    System.out.println("Chọn thao tác");
//                    System.out.println("1. Thêm sản phẩm meat");
//                    System.out.println("2. Thêm sản phẩm CispyFlour");
//                    int option = input.nextInt();
//
////                    switch (option){
////
////                    }
//                default:
//                    System.out.println("Tính năng chưa phát triển...!");
//            }
//        }while(true) ;

        Products products = creatNewMeatProduct();
        productManager.addProduct(products);
    }

    public static Products creatNewMeatProduct(){
        Scanner input = new Scanner(System.in);

        try {
            int select;
            do {
                System.out.println("Creat new meat product: ");
                System.out.println("    1. Beef");
                System.out.println("    2. Chicken");
                System.out.println("    3. Pork");
                select = input.nextInt();

                Scanner input1 = new Scanner(System.in);

                int id = Products.stt;
                Products.stt++;

                System.out.println("Nhập tên sản phẩm muốn tạo mới: ");
                String name = input1.nextLine();

                System.out.println("Nhập ngày sản xuất: ");
                String manufacturing = input1.nextLine();

                System.out.println("Nhập cân nặng:");
                double weight = input.nextDouble();

                System.out.println("Nhập giá tiền: ");
                int cost = input.nextInt();


                switch (select){
                    case 1:
                        Meat meat1 = new Beef(manufacturing,cost,id,name,weight);
                        System.out.println("Tạo mới thành công!! "+ meat1);
                        return meat1;
                    case 2:
                        Meat meat2 = new Chicken(manufacturing,cost,id,name,weight);
                        System.out.println("Tạo mới thành công!! "+ meat2);
                        return meat2;
                    case 3:
                        Meat meat3 = new Pork(manufacturing,cost,id,name,weight);
                        System.out.println("Tạo mới thành công!! "+ meat3);
                        return meat3;
                    default:
                        System.out.println("Thao tac sai! Vui long nhap lai..");
                }
            }while (true);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    public static Products creatNewMilkProduct(){
        Scanner input = new Scanner(System.in);

        try {
            int select;
            do {
                System.out.println("Creat new milk product: ");
                System.out.println("    1. FreshMilk");
                System.out.println("    2. PreparedMilk");
                select = input.nextInt();

                Scanner input1 = new Scanner(System.in);

                int id = Products.stt;
                Products.stt++;

                System.out.println("Nhập tên sản phẩm muốn tạo mới: ");
                String name = input1.nextLine();

                System.out.println("Nhập ngày sản xuất: ");
                String manufacturing = input1.nextLine();

                System.out.println("Nhập thể tích (Ml):");
                int volume = input.nextInt();

                System.out.println("Nhập giá tiền: ");
                int cost = input.nextInt();


                switch (select){
                    case 1:
                        Milk milk1 = new FreshMilk(manufacturing,cost,id,name,volume);
                        System.out.println("Tạo mới thành công!! "+ milk1);
                        return milk1;
                    case 2:
                        Milk milk2 = new PreparedMilk(manufacturing,cost,id,name,volume);
                        System.out.println("Tạo mới thành công!! "+ milk2);
                        return milk2;
                    default:
                        System.out.println("Thao tac sai! Vui long nhap lai..");
                }
            }while (true);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    public static Products creatNewEggProduct(){
        Scanner input = new Scanner(System.in);

        try {
            int select;
            do {
                System.out.println("Creat new egg product: ");
                System.out.println("    1. Ducks Egg");
                System.out.println("    2. Chicken Egg");
                select = input.nextInt();

                Scanner input1 = new Scanner(System.in);

                System.out.println("Nhập ngày sản xuất: ");
                String manufacturing = input1.nextLine();

                System.out.println("Nhập số lượng: ");
                int amount = input.nextInt();

                System.out.println("Nhập giá tiền: ");
                int cost = input.nextInt();


                switch (select){
                    case 1:
                        Egg egg1 = new DucksEgg(manufacturing,cost,amount);
                        System.out.println("Tạo mới thành công!! "+ egg1);
                        return egg1;
                    case 2:
                        Egg egg2 = new DucksEgg(manufacturing,cost,amount);
                        System.out.println("Tạo mới thành công!! "+ egg2);
                        return egg2;
                    default:
                        System.out.println("Thao tac sai! Vui long nhap lai..");
                }
            }while (true);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

}
