package controller;

import model.Products;
import storage.ReadWriteData;
import storage.ReadWriteFile;

import java.util.LinkedList;
import java.util.List;

public class ProductUser {

    private ReadWriteData readWriteData = new ReadWriteFile();

    public List<Products> cart = new LinkedList<>();

    public void addProductToCart(Products product){
        cart.add(product);
        readWriteData.writeData(cart);
    }

}
