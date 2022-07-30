package model.egg;

import model.Conditions;

import java.time.LocalDate;

public class ChickenEgg extends Egg implements Conditions {

    public ChickenEgg(int amount) {
        super(amount);
    }

    public ChickenEgg(String dateOfManufacturing, int cost, int amount) {
        super(dateOfManufacturing, cost, amount);
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
