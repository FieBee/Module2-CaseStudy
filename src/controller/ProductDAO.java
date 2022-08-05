package controller;

import model.Products;

import java.util.List;

public interface ProductDAO {

    void addProduct(Products products);

//    void editProductByIndex(int index, Products product);

    void deleteProduct(int index);

//    void displayProduct();

}
