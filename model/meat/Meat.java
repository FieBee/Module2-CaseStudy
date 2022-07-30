package model.meat;

import model.Products;

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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
