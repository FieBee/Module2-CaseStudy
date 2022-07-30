package controller;

import model.Products;

import java.util.List;

public class ProductManager {

    List<Products> productsList;
    public void addProduct(Products products){
        productsList.add(products);
    }

}
