package model.egg;

import model.Conditions;

import java.io.Serializable;
import java.time.LocalDate;

public class ChickenEgg extends Egg implements Conditions, Serializable {

    private static final int EXPIRY = 30;
    public ChickenEgg(int id, int amount) {
        super(id, amount);
    }

    public ChickenEgg(String dateOfManufacturing, int cost, int id, int amount) {
        super(dateOfManufacturing, cost, id, amount);
    }
    public ChickenEgg(){
        super();
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
        return "ChickenEgg {" +
                ", id = "+getId()+
                "amount = " + super.getAmount() +
                ", dateOfManufacturing = " + super.getDateOfManufacturing() +
                ", ShelfLife = "+getShelfLife()+
                ", cost = " + super.getCost() +
                "} " ;
    }
}
