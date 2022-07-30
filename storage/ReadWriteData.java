package storage;

import model.Products;

import java.util.List;

public interface ReadWriteData {

    List<Products> readData();
    void writeData(List<Products> materialList);

}
