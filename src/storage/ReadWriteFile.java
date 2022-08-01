package storage;

import model.Products;

import java.io.*;
import java.util.LinkedList;
import java.util.List;

public class ReadWriteFile implements ReadWriteData{


    @Override
    public LinkedList<Products> readData(String file) {
        try{
            FileInputStream fileInputStream = new FileInputStream(file);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            Object ob = objectInputStream.readObject();
            LinkedList<Products> products = (LinkedList<Products>)  ob;

            return products;

        } catch (IOException | ClassNotFoundException e) {
            System.err.println(e.getMessage());
        }
        return null;
    }

    @Override
    public void writeData(List<Products> productsList, String file) {
        try{
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(productsList);
            objectOutputStream.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
