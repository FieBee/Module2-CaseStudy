package model.milk;

import model.Conditions;

import java.time.LocalDate;

public class FreshMilk extends Milk implements Conditions {

    public FreshMilk(double volume) {
        super(volume);
    }

    public FreshMilk(String dateOfManufacturing, int cost, double volume) {
        super(dateOfManufacturing, cost, volume);
    }

    @Override
    public double getRealMoney() {
        return getCost() * getVolume();
    }

    @Override
    public LocalDate getShelfLife() {
        return getDateOfManufacturing().plusDays(20);
    }
}
