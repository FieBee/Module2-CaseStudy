package model.egg;

import model.Conditions;

import java.time.LocalDate;

public class DucksEgg extends Egg implements Conditions {

    public DucksEgg(int amount) {
        super(amount);
    }

    public DucksEgg(String dateOfManufacturing, int cost, int amount) {
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
