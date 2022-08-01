package controller;

import model.Products;
import storage.ReadWriteData;
import storage.ReadWriteFile;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class ProductManager {

    public static final String PRODUCTMANAGEMENT = "ProductManagement.phuong";
    private static ReadWriteData readWriteFile = new ReadWriteFile();
    public List<Products> productsList = new LinkedList<>();



    public void addProduct(Products product){
        productsList.add(product);
        readWriteFile.writeData(productsList, PRODUCTMANAGEMENT);
    }

    public void editProductByIndex(int index, Products product){
        productsList.set(index, product);
        readWriteFile.writeData(productsList, PRODUCTMANAGEMENT);
    }

    public void deleteProductByIndex(int index){
        productsList.remove(index);
        readWriteFile.writeData(productsList,  PRODUCTMANAGEMENT);
    }

    public void displayProduct(){
        readWriteFile.readData( PRODUCTMANAGEMENT);
    }

    public  void main(String[] args) {
        readWriteFile.readData( PRODUCTMANAGEMENT);
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
}
