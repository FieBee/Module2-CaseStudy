package model.milk;

import model.Products;

public abstract class Milk extends Products {
    private double volume;

    public Milk(double volume) {
        this.volume = volume;
    }

    public Milk(String dateOfManufacturing, int cost, double volume) {
        super(dateOfManufacturing, cost);
        this.volume = volume;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "Milk{" +
                "volume=" + volume +
                "} " + super.toString();
    }
}
