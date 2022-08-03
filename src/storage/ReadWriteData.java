package storage;

import java.util.ArrayList;
import java.util.List;

public interface ReadWriteData <E> {


    ArrayList<E> readData(String file);

    void writeData(List<E> productsList, String file);

    void writeData(List<E> productsList, String file);
}
