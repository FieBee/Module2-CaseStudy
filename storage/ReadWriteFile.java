package storage;

import controller.ProductManager;
import model.Products;

import java.io.*;
import java.util.List;

public class ReadWriteFile implements ReadWriteData{



    @Override
    public  List<Products> readData() {
        try{
            FileInputStream fileInputStream = new FileInputStream("ProductFile.txt");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            Object ob = objectInputStream.readObject();
            List<Products> products = (List<Products>) ob;
            objectInputStream.close();

            return products;

        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void writeData(List<Products> productsList) {
        try{
            FileOutputStream fileOutputStream = new FileOutputStream("ProductFile.txt");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(productsList);
            objectOutputStream.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
