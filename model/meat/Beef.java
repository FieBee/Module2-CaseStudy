package model.meat;

import model.Conditions;

import java.io.Serializable;
import java.time.LocalDate;

public class Beef extends Meat implements Conditions, Serializable {

    public Beef() {
    }

    public Beef(int id, String name, double weight) {
        super(id, name, weight);
    }

    public Beef(String dateOfManufacturing, int cost, int id, String name, double weight) {
        super(dateOfManufacturing, cost, id, name, weight);
    }

    @Override
    public double getRealMoney() {
        return getWeight() * getCost();
    }

    @Override
    public LocalDate getShelfLife() {
        return getDateOfManufacturing().plusDays(7);
    }


}
