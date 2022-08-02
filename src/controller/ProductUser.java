package controller;
import model.Products;
import storage.ReadWriteData;
import storage.ReadWriteFile;

import java.util.LinkedList;
import java.util.List;

public class ProductUser {

    private static final String CARTMANAGEMENT = "CartManagement";
    private ReadWriteData readWriteData = new ReadWriteFile();

    public List<Products> cart = new LinkedList<>();

    public void addProductToCart(Products product){
        cart.add(product);
        readWriteData.writeData(cart, CARTMANAGEMENT);
    }

    public void deleteProductByIndex(int index){
        cart.remove(index);
        readWriteData.writeData(cart, CARTMANAGEMENT);
    }


//    Thanh toán
    public int cartPayment(){
        int sum = 0;
        for (int i = 0; i < cart.size(); i++) {
            sum += cart.get(i).getCost();
        }
        return sum;
    }
    public void displayProduct(){
        readWriteData.readData(CARTMANAGEMENT);
    }



}
