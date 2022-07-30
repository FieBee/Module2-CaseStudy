package model.Meat;

import model.Conditions;

import java.time.LocalDate;

public class Chicken extends Meat implements Conditions {

    private double weight;
    public Chicken(String id, String name, double weight) {
        super(id, name);
        this.weight = weight;
    }

    public Chicken(String dateOfManufacturing, int cost, String id, String name, double weight) {
        super(dateOfManufacturing, cost, id, name);
        this.weight = weight;
    }

    @Override
    public double getRealMoney() {
        return 0;
    }

    @Override
    public LocalDate getShelfLife() {
        return null;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Chicken{" +
                "weight=" + weight +
                "} " + super.toString();
    }
}
