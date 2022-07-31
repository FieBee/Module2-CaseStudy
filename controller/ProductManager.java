package controller;

import model.Products;
import storage.ReadWriteData;
import storage.ReadWriteFile;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class ProductManager {

    private static ReadWriteData readWriteFile = new ReadWriteFile();
    public List<Products> productsList = new LinkedList<>();
    public void addProduct(Products product){
        productsList.add(product);
        readWriteFile.writeData(productsList);
    }

    public void editProductByIndex(int index, Products product){
        productsList.set(index, product);
        readWriteFile.writeData(productsList);
    }

    public void deleteProductByIndex(int index){
        productsList.remove(index);
        readWriteFile.writeData(productsList);
    }

    public void displayProduct(){
        readWriteFile.readData();
    }

    public  void main(String[] args) {
        readWriteFile.readData();
    }

    public String checkDate(){
        try{

            Scanner input = new Scanner(System.in);

            while (true){
                System.out.println("Input date: ");
                String str = input.nextLine();

                String regex = "^\\d{4}[-|/]\\\\d{2}[-|/]\\d{2}$" ;

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
