package storage;

import model.Products;

import java.util.LinkedList;
import java.util.List;

public interface ReadWriteData {


    LinkedList<Products> readData(String file);

    void writeData(List<Products> productsList, String file);
}
