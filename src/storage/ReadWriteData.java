package storage;

import model.Products;

import java.util.ArrayList;
import java.util.List;

public interface ReadWriteData {


    ArrayList<Products> readData(String file);

    void writeData(List<Products> productsList, String file);
}
