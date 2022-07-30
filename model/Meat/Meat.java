package model.Meat;

import model.Conditions;
import model.Products;

import java.time.LocalDate;

public abstract class Meat extends Products{

    private String id;
    private String name;
    private double weight;

    public Meat(String id, String name, double weight) {
        this.id = id;
        this.name = name;
        this.weight = weight;
    }

    public Meat(String dateOfManufacturing, int cost, String id, String name, double weight) {
        super(dateOfManufacturing, cost);
        this.id = id;
        this.name = name;
        this.weight = weight;
    }
}
