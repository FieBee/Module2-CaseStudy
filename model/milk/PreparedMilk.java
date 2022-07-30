package model.milk;

import model.Conditions;

import java.time.LocalDate;

public class PreparedMilk extends Milk implements Conditions {

    public PreparedMilk(double volume) {
        super(volume);
    }

    public PreparedMilk(String dateOfManufacturing, int cost, double volume) {
        super(dateOfManufacturing, cost, volume);
    }

    @Override
    public double getRealMoney() {
        return getCost() * getVolume();
    }

    @Override
    public LocalDate getShelfLife() {
        return getDateOfManufacturing().plusDays(15);
    }
}
