package model.meat;

import model.Products;

import java.io.Serializable;

public abstract class Meat extends Products implements Serializable {

    private int id;
    private String name;
    private double weight;

    public Meat(){}

    public Meat(int id, String name, double weight) {
        this.id = id;
        this.name = name;
        this.weight = weight;
    }

    public Meat(String dateOfManufacturing, int cost, int id, String name, double weight) {
        super(dateOfManufacturing, cost);
        this.id = id;
        this.name = name;
        this.weight = weight;
    }

    public Meat(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    public Meat(String dateOfManufacturing, int cost, String name, double weight) {
        super(dateOfManufacturing, cost);
        this.name = name;
        this.weight = weight;
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

    @Override
    public String toString() {
        return "Meat{" +
                "id ='" + id + '\'' +
                ", name ='" + name + '\'' +
                ", weight =" + weight +
                "} " + super.toString();
    }
}
