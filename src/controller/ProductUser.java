package controller;

import model.Products;
import storage.ReadWriteData;
import storage.ReadWriteFile;

import java.util.ArrayList;

public class ProductUser {

    private ArrayList<Products> cart = new ArrayList<>();
    public static final String CART_MANAGEMENT = "CartManagement.phuong";
    private ReadWriteData readWriteData = new ReadWriteFile();


    ProductManager productManager = new ProductManager();

    public void addProductToCart(Products product){

        cart.add(product);
        readWriteData.writeData(cart, CART_MANAGEMENT);
    }

    public void deleteProductByIndex(int index){
        cart.remove(index);
        readWriteData.writeData(cart, CART_MANAGEMENT);
    }


//    Thanh toán
    public int cartPayment(){
        cart = readWriteData.readData(CART_MANAGEMENT);
        int sum = 0;
        for (int i = 0; i < cart.size(); i++) {
            sum += cart.get(i).getCost();
        }
        return sum;
    }

    public ArrayList<Products> getCart() {
        return cart;
    }
}
