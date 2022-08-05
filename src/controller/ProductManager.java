package controller;

import model.Products;
import storage.ReadWriteData;
import storage.ReadWriteFile;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class ProductManager implements ProductDAO{
    private static ProductManager instance = null;
    private ProductManager() {
    }

    public static ProductManager getInstance(){
        if (instance == null ) instance = new ProductManager();
        return instance;
    }

    public static final String PRODUCT_MANAGEMENT = "FileData/ProductManagement.pku0ng";
    public static ReadWriteData readWriteFile = ReadWriteFile.getInstance();
    private static int count = 1;
    public static List<Products> productsList = new ArrayList<>();
    ArrayList<Products> productsArrayList;




    public void addProduct(Products product){
        productsList.add(product);
        readWriteFile.writeData(productsList, PRODUCT_MANAGEMENT);
    }

//    @Override
    public void editProductByIndex(int index, Products product){
        System.out.println(productsArrayList.size());
        ArrayList<Products> productsArrayList = readWriteFile.readData(PRODUCT_MANAGEMENT);
        productsArrayList.set(index, product);
        readWriteFile.writeData(productsArrayList, PRODUCT_MANAGEMENT);
        Products.stt++;
    }

    @Override
    public void deleteProduct(int index){
        ArrayList<Products> productsArrayList = readWriteFile.readData(PRODUCT_MANAGEMENT);
        System.out.println("Xóa thành công:  "+ productsArrayList.get(index));
        productsArrayList.remove(index);

        readWriteFile.writeData(productsArrayList,  PRODUCT_MANAGEMENT);
    }

//    @Override
    public void displayProduct(){
        count=0;
        ArrayList<Products> displayFile = readWriteFile.readData(PRODUCT_MANAGEMENT);
        Iterator iterator = displayFile.iterator();
        while (iterator.hasNext()){
            Object element = iterator.next();
            System.out.println(count + ". "+element);
            count++;
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
                }
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
