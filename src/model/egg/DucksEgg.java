package model.egg;

import model.Conditions;

import java.io.Serializable;
import java.time.LocalDate;

public class DucksEgg extends Egg implements Conditions, Serializable {

    private static final int EXPIRY = 20;
    public DucksEgg(int id, int amount) {
        super(id, amount);
    }

    public DucksEgg(String dateOfManufacturing, int cost, int id, int amount) {
        super(dateOfManufacturing, cost, id, amount);
    }

    @Override
    public double getRealMoney() {
        return getAmount()*getCost();
    }

    @Override
    public LocalDate getShelfLife() {
        return getDateOfManufacturing().plusDays(EXPIRY);
    }

    public String toString() {
        return "DucksEgg {" +
                "amount = " + super.getAmount() +
                ", dateOfManufacturing = " + super.getDateOfManufacturing() +
                ", ShelfLife = "+getShelfLife()+
                ", shelfLife = " + getShelfLife() +
                ", cost = " + super.getCost() +
                "} " ;
    }
}
