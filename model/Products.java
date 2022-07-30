package model;

import java.time.LocalDate;

public abstract class Products{


    private LocalDate dateOfManufacturing;
    private int cost;

    public Products(){}

    public Products(String dateOfManufacturing, int cost) {
        this.dateOfManufacturing = LocalDate.parse(dateOfManufacturing);
        this.cost = cost;
    }


    public LocalDate getDateOfManufacturing() {
        return dateOfManufacturing;
    }

    public void setManufacturing(LocalDate manufacturing) {
        this.dateOfManufacturing = manufacturing;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Products{" +
                "dateOfManufacturing=" + dateOfManufacturing +
                ", cost=" + cost +
                '}';
    }
}
