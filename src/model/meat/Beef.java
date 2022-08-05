package model.meat;

import model.Conditions;

import java.io.Serializable;
import java.time.LocalDate;

public class Beef extends Meat implements Conditions, Serializable {

    //    public Beef(){}

//    public static class Builder {
//        private String dateOfManufacturing;
//        private int id;
//        private String name;
//        private double weight;
//        private int cost;
////        private String color;
//
//        public Builder withManufacturing(String dateOfManufacturing) {
//            this.dateOfManufacturing = dateOfManufacturing;
//            return this;
//        }
//        public Builder withId(int id) {
//            this.id = id;
//            return this;
//        }
//        public Builder withName(String name) {
//            this.name = name;
//            return this;
//        }
//        public Builder withWeight(double weight) {
//            this.weight = weight;
//            return this;
//        }
//        public Builder withCost(int cost) {
//            this.cost = cost;
//            return this;
//        }
//
//
//
//        public Beef build(){
//            Beef beef = new Beef();
//            beef.setManufacturing(LocalDate.parse(dateOfManufacturing));
//            beef.setCost(cost);
//            beef.setId(id);
//            beef.setName(name);
//            beef.setWeight(weight);
//            return beef;
//        }
//

//    }

    private static final int EXPIRY = 7;
    public Beef() {
    }

    public Beef(int id, String name, double weight) {
        super(id, name, weight);
    }

    public Beef(String dateOfManufacturing, int cost, int id, String name, double weight) {
        super(dateOfManufacturing, cost, id, name, weight);
    }

    @Override
    public double getRealMoney() {
        return getWeight() * getCost();
    }

    @Override
    public LocalDate getShelfLife() {
        return getDateOfManufacturing().plusDays(EXPIRY);
    }

    @Override
    public String toString() {
        return "Beef {" +
                "id = '" + super.getId() + '\'' +
                ", name = '" + super.getName() + '\'' +
                ", weight = " + super.getWeight() +
                ", dateOfManufacturing = " + super.getDateOfManufacturing() +
                ", shelfLife = " + getShelfLife() +
                ", cost = " + super.getCost() +
                "} " ;
    }
}
