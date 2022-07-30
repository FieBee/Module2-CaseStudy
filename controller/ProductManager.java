package controller;

import model.Products;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ProductManager {

    public List<Products> productsList = new LinkedList<Products>();
    public void addProduct(Products product){
        productsList.add(product);
    }

    public void editProductByIndex(int index, Products product){
        productsList.set(index, product);
    }

}
