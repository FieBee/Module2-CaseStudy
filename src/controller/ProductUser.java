package controller;
import model.Products;
import storage.ReadWriteData;
import storage.ReadWriteFile;

import java.util.LinkedList;
import java.util.List;

public class ProductUser {

    public static final String CART_MANAGEMENT = "CartManagement.phuong";
    private ReadWriteData readWriteData = new ReadWriteFile();

    public List<Products> cart = new LinkedList<>();
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
        int sum = 0;
        for (int i = 0; i < cart.size(); i++) {
            sum += cart.get(i).getCost();
        }
        return sum;
    }
    public void display(){
        productManager.displayProduct();
    }



}
