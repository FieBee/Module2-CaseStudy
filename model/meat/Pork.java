package model.meat;

import model.Conditions;

import java.time.LocalDate;

public class Pork extends Meat implements Conditions {

    public Pork() {
    }

    public Pork(int id, String name, double weight) {
        super(id, name, weight);
    }

    public Pork(String dateOfManufacturing, int cost, int id, String name, double weight) {
        super(dateOfManufacturing, cost, id, name, weight);
    }

    @Override
    public double getRealMoney() {
        return getWeight() * getCost();
    }

    @Override
    public LocalDate getShelfLife() {
        return getDateOfManufacturing().plusDays(5);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
