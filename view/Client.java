package view;

import controller.ProductManager;
import model.Products;
import model.egg.ChickenEgg;
import model.egg.DucksEgg;
import model.egg.Egg;
import model.meat.Beef;
import model.meat.Chicken;
import model.meat.Meat;
import model.meat.Pork;
import model.milk.FreshMilk;
import model.milk.Milk;
import model.milk.PreparedMilk;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;


public class Client {

    public static final String SUCCESSFUL_NEW_CREATION = "Thao tác thành công!! ";

    static ProductManager productManager = new ProductManager();
    public static void main(String[] args) {

//        System.out.println(productManager);

        Products products = creatNewMeatProduct();
        productManager.addProduct(products);
        Products product1 = creatNewEggProduct();
        productManager.addProduct(product1);

        productManager.displayProduct();
        editProductByIndex();


        productManager.displayProduct();

        deleteProductByIndex();
        productManager.displayProduct();

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

                if (select <=0 || select > 3){
                    System.out.println("Thao tac sai! Vui long nhap lai..");
                    continue;
                }

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


                switch (select) {
                    case 1 -> {
                        Meat meat1 = new Beef(manufacturing, cost, id, name, weight);
                        System.out.println(SUCCESSFUL_NEW_CREATION + meat1);
                        return meat1;
                    }
                    case 2 -> {
                        Meat meat2 = new Chicken(manufacturing, cost, id, name, weight);
                        System.out.println(SUCCESSFUL_NEW_CREATION + meat2);
                        return meat2;
                    }
                    case 3 -> {
                        Meat meat3 = new Pork(manufacturing, cost, id, name, weight);
                        System.out.println(SUCCESSFUL_NEW_CREATION + meat3);
                        return meat3;
                    }
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


                switch (select) {
                    case 1 -> {
                        Milk milk1 = new FreshMilk(manufacturing, cost, id, name, volume);
                        System.out.println(SUCCESSFUL_NEW_CREATION + milk1);
                        return milk1;
                    }
                    case 2 -> {
                        Milk milk2 = new PreparedMilk(manufacturing, cost, id, name, volume);
                        System.out.println(SUCCESSFUL_NEW_CREATION + milk2);
                        return milk2;
                    }
                    default -> System.out.println("Thao tac sai! Vui long nhap lai..");
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

                int id = Products.stt;
                Products.stt++;

                switch (select) {
                    case 1 -> {
                        Egg egg1 = new DucksEgg(manufacturing, cost, id, amount);
                        System.out.println(SUCCESSFUL_NEW_CREATION + egg1);
                        return egg1;
                    }
                    case 2 -> {
                        Egg egg2 = new DucksEgg(manufacturing, cost, id, amount);
                        System.out.println(SUCCESSFUL_NEW_CREATION + egg2);
                        return egg2;
                    }
                    default -> System.out.println("Thao tac sai! Vui long nhap lai..");
                }
            }while (true);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

//    public static void editProductByIndex(int index) {
//        Scanner input = new Scanner(System.in);
//        Scanner input1 = new Scanner(System.in);
//
//        Products objectCorrected = productManager.productsList.get(index);
//
//        if (objectCorrected instanceof Meat) {
//            System.out.println("Nhập tên sản phẩm muốn sửa: ");
//            String name = input1.nextLine();
//
//            System.out.println("Nhập lại ngày sản xuất: ");
//            String manufacturing = input1.nextLine();
//
//            System.out.println("Nhập lại cân nặng:");
//            double weight = input.nextDouble();
//
//            System.out.println("Nhập lại giá tiền: ");
//            int cost = input.nextInt();
//
//            int id = Products.stt;
//
//            if (objectCorrected instanceof Chicken) {
//                Chicken chicken = new Chicken(manufacturing, cost, id, name, weight);
//                productManager.editProductByIndex(index, chicken);
//
//            } else if (objectCorrected instanceof Pork) {
//                Pork pork = new Pork(manufacturing, cost, id, name, weight);
//                productManager.editProductByIndex(index, pork);
//            } else {
//                Beef beef = new Beef(manufacturing, cost, id, name, weight);
//                productManager.editProductByIndex(index, beef);
//            }
//            System.out.println(SUCCESSFUL_NEW_CREATION);
//
//        }
//
//        else if (objectCorrected instanceof Milk) {
//            System.out.println("Nhập tên sản phẩm muốn sửa: ");
//            String name = input1.nextLine();
//
//            System.out.println("Nhập lại ngày sản xuất: ");
//            String manufacturing = input1.nextLine();
//
//            System.out.println("Nhập lại thể tích:");
//            int volume = input.nextInt();
//
//            System.out.println("Nhập lại giá tiền: ");
//            int cost = input.nextInt();
//
//            int id = Products.stt;
//
//            if (objectCorrected instanceof FreshMilk) {
//                FreshMilk freshMilk = new FreshMilk(manufacturing, cost, id, name, volume);
//                productManager.editProductByIndex(index, freshMilk);
//
//            } else {
//                PreparedMilk preparedMilk = new PreparedMilk(manufacturing, cost, id, name, volume);
//                productManager.editProductByIndex(index, preparedMilk);
//            }
//            System.out.println(SUCCESSFUL_NEW_CREATION);
//        } else if () {
//
//        }
////        productManager.editProductByIndex(index,);
//    }

    public static void editProductByIndex(){
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap id san pham muon sua");
        int index = input.nextInt();

        Products objectCorrected = productManager.productsList.get(index);
        if (objectCorrected instanceof  Meat){
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
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap id san pham muon xoa");
        int index = input.nextInt();
        productManager.deleteProductByIndex(index);
    }

}









