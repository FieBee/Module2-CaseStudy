package model.Meat;

import model.Conditions;
import model.Products;

import java.time.LocalDate;

public abstract class Meat extends Products{

    private String id;
    private String name;

    public Meat(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public Meat(String dateOfManufacturing, int cost, String id, String name) {
        super(dateOfManufacturing, cost);
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Meat{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                "} " + super.toString();
    }
}
