package storage;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadWriteFile implements ReadWriteData{


    @Override
    public ArrayList readData(String file) {
        try{
            FileInputStream fileInputStream = new FileInputStream(file);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            Object ob = objectInputStream.readObject();
            ArrayList products = (ArrayList)  ob;

            return products;

        } catch (IOException | ClassNotFoundException e) {
            System.err.println(e.getMessage());
        }
        return null;
    }

    @Override
    public void writeData(List productsList, String file) {
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
