package model.meat;

import model.Conditions;

import java.io.Serializable;
import java.time.LocalDate;

public class Chicken extends Meat implements Conditions, Serializable {

    public Chicken(int id,String name, double weight ) {

        super( name, weight);

    }

    public Chicken(String dateOfManufacturing, int cost, int id, String name, double weight) {
        super(dateOfManufacturing, cost, id, name, weight);
    }

    public Chicken() {
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
