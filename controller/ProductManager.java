package controller;

import model.Products;
import storage.ReadWriteData;
import storage.ReadWriteFile;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ProductManager {

    private ReadWriteData readWriteData = new ReadWriteFile();
    public List<Products> productsList = new LinkedList<>();
    public void addProduct(Products product){
        productsList.add(product);
        readWriteData.writeData(productsList);
    }

    public void editProductByIndex(int index, Products product){
        productsList.set(index, product);
        readWriteData.writeData(productsList);
    }

    public void deleteProductByIndex(int index){
        productsList.remove(index);
        readWriteData.writeData(productsList);
    }

    public void displayProduct(){
        for (Products obj: productsList
             ) {
            System.out.println(obj);
        }
    }

}
