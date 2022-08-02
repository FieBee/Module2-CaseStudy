package model.milk;

import model.Conditions;

import java.io.Serializable;
import java.time.LocalDate;

public class PreparedMilk extends Milk implements Conditions, Serializable {

    private static final int EXPIRY = 15;

    public PreparedMilk(String dateOfManufacturing, int cost, int id, String name, int volume) {
        super(dateOfManufacturing, cost, id, name, volume);
    }

    @Override
    public double getRealMoney() {
        return getCost() * getVolume();
    }

    @Override
    public LocalDate getShelfLife() {
        return getDateOfManufacturing().plusDays(EXPIRY);
    }

    @Override
    public String toString() {
        return "PreparedMilk {" +
                "id = '" + super.getId() + '\'' +
                ", name = '" + super.getName() + '\'' +
                ", volume = " + super.getVolume() +
                ", dateOfManufacturing = " + super.getDateOfManufacturing() +
                ", shelfLife = " + getShelfLife() +
                ", cost = " + super.getCost() +
                "} " ;
    }
}
