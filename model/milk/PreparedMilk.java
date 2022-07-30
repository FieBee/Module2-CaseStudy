package model.milk;

import model.Conditions;

import java.time.LocalDate;

public class PreparedMilk extends Milk implements Conditions {

    public PreparedMilk(int id, String name, int volume) {
        super(id, name, volume);
    }

    public PreparedMilk(String dateOfManufacturing, int cost, int id, String name, int volume) {
        super(dateOfManufacturing, cost, id, name, volume);
    }

    @Override
    public double getRealMoney() {
        return getCost() * getVolume();
    }

    @Override
    public LocalDate getShelfLife() {
        return getDateOfManufacturing().plusDays(15);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
