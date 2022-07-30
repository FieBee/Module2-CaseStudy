package model.egg;

import model.Conditions;

import java.io.Serializable;
import java.time.LocalDate;

public class ChickenEgg extends Egg implements Conditions, Serializable {

    public ChickenEgg(int amount) {
        super(amount);
    }

    public ChickenEgg(String dateOfManufacturing, int cost, int amount) {
        super(dateOfManufacturing, cost, amount);
    }

    @Override
    public double getRealMoney() {
        return getAmount()*getCost();
    }

    @Override
    public LocalDate getShelfLife() {
        return getDateOfManufacturing().plusDays(30);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
