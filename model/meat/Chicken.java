package model.meat;

import model.Conditions;

import java.time.LocalDate;

public class Chicken extends Meat implements Conditions {

    public Chicken(String id, String name, double weight) {
        super(id, name, weight);
    }

    public Chicken(String dateOfManufacturing, int cost, String id, String name, double weight) {
        super(dateOfManufacturing, cost, id, name, weight);
    }

    @Override
    public double getRealMoney() {
        return getWeight() * getCost();
    }

    @Override
    public LocalDate getShelfLife() {
        return getDateOfManufacturing().plusDays(4);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
