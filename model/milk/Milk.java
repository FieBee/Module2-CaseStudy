package model.milk;

import model.Products;

import java.io.Serializable;

public abstract class Milk extends Products implements Serializable {

    private int id;
    private String name;
    private int volume;

    public Milk(int id, String name, int volume) {
        this.id = id;
        this.name = name;
        this.volume = volume;
    }

    public Milk(String dateOfManufacturing, int cost, int id, String name, int volume) {
        super(dateOfManufacturing, cost);
        this.id = id;
        this.name = name;
        this.volume = volume;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

}
