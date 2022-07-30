package view;

import controller.ProductManager;
import model.Products;
import model.meat.Beef;
import model.meat.Chicken;
import model.meat.Meat;
import model.meat.Pork;

import java.util.Scanner;

public class Client {

    static ProductManager productManager = new ProductManager();
    public static void main(String[] args) {
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

}
