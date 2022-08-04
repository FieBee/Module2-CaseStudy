package controller;

import storage.ReadWriteData;
import storage.ReadWriteFile;

public class ProductUser {

    public static final String CART_MANAGEMENT = "CartManagement.phuong";
    private ReadWriteData readWriteData = new ReadWriteFile();


//    ProductManager productManager = new ProductManager();
//
//    public void addProductToCart(Products product){
//        AccountUser.numCart++;
//        AccountUser.cart.add(product);
//        readWriteData.writeData(AccountUser.cart, CART_MANAGEMENT);
//    }
//
//    public void deleteProductByIndex(int index){
//        AccountUser.cart.remove(index);
//        readWriteData.writeData(AccountUser.cart, CART_MANAGEMENT);
//    }
//
//
////    Thanh toán
//    public int cartPayment(){
//        int sum = 0;
//        for (int i = 0; i < AccountUser.cart.size(); i++) {
//            sum += AccountUser.cart.get(i).getCost();
//        }
//        return sum;
//    }
//    public void display(){
//        productManager.displayProduct();
//    }

}
