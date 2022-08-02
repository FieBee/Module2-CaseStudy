package controller;

import model.Products;
import storage.ReadWriteData;
import storage.ReadWriteFile;

import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class ProductManager {

    public static final String PRODUCT_MANAGEMENT = "ProductManagement.phuong";


    public static ReadWriteData readWriteFile = new ReadWriteFile();
    public static List<Products> productsList = readWriteFile.readData(PRODUCT_MANAGEMENT);
//    private List<Products> listProductOfManager = readWriteFile.readData(MANAGER_OF_FILE);


    public void addProduct(Products product){
        productsList.add(product);
        readWriteFile.writeData(productsList, PRODUCT_MANAGEMENT);
    }

    public void editProductByIndex(int index, Products product){
        productsList.set(index, product);
        readWriteFile.writeData(productsList, PRODUCT_MANAGEMENT);
    }

    public void deleteProductByIndex(int index){
        productsList.remove(index);
        readWriteFile.writeData(productsList,  PRODUCT_MANAGEMENT);
    }

    public void displayProduct(){
        if(productsList.isEmpty()){
            System.out.println("\t\tChưa có sản phẩm nào");
        } else {
            productsList.forEach(System.out::println);
        }

    }


    public String checkDate(){
        try{

            Scanner input = new Scanner(System.in);

            while (true){
                System.out.println("Input date: ");
                String str = input.nextLine();

                String regex = "^\\d{4}[-|/]\\d{2}[-|/]\\d{2}$" ;

                Pattern pattern = Pattern.compile(regex);

                if (pattern.matcher(str).find()){
                    System.out.println("Date is ok");
                    return str;
                }else {
                    System.err.println("Date is not ok");
                }
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

//    public static void main(String[] args) {
//        productsList = readWriteFile.readData(PRODUCT_MANAGEMENT);
//        System.out.println(productsList);
//    }
}
