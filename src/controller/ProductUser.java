package controller;

import model.Products;
import storage.ReadWriteData;
import storage.ReadWriteFile;

import java.util.ArrayList;

public class ProductUser implements ProductDAO{
    private ReadWriteData readWriteData = ReadWriteFile.getInstance();
    private ArrayList<Products> cart = readWriteData.readData(CART_MANAGEMENT);
    public static final String CART_MANAGEMENT = "FileData/CartManagement.phuong";


    public void addProduct(Products product){
        cart.add(product);
        readWriteData.writeData(cart, CART_MANAGEMENT);
    }

    public void deleteProduct(int index){
        cart.remove(index);
        readWriteData.writeData(cart, CART_MANAGEMENT);
    }

    public int cartPayment(){
        cart = readWriteData.readData(CART_MANAGEMENT);
        int sum = 0;
        for (Products products : cart) {
            sum += products.getCost();
        }
        return sum;
    }


}
