package model.meat;

import model.Conditions;

import java.time.LocalDate;

public class Beef extends Meat implements Conditions {

    public Beef(String id, String name, double weight) {
        super(id, name, weight);
    }

    public Beef(String dateOfManufacturing, int cost, String id, String name, double weight) {
        super(dateOfManufacturing, cost, id, name, weight);
    }

    @Override
    public double getRealMoney() {
        return 0;
    }

    @Override
    public LocalDate getShelfLife() {
        return null;
    }


}
