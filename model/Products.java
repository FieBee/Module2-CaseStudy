package model;

import java.time.LocalDate;

public abstract class Products implements Discount{

    private String id;
    private String name;
    private LocalDate manufactoring;
    private int cost;

    public Products(){}

    public Products(String id, String name, LocalDate manufactoring, int cost) {
        this.id = id;
        this.name = name;
        this.manufactoring = manufactoring;
        this.cost = cost;
    }

    @Override
    public double getRealMoney() {
        return 0;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getManufactoring() {
        return manufactoring;
    }

    public void setManufactoring(LocalDate manufactoring) {
        this.manufactoring = manufactoring;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", manufactoring=" + manufactoring +
                ", cost=" + cost +
                '}';
    }
}
