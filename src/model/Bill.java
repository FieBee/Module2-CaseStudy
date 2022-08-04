package model;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
//import java.util.ArrayList;

public class Bill implements Serializable {
    private String userName;
    private ArrayList<Products> product;
    private double totalPrice;
    private LocalDateTime purchaseDate;


    public Bill(String userName, ArrayList<Products> product, double totalPrice, LocalDateTime purchaseDate) {
        this.userName = userName;
        this.product = product;
        this.totalPrice = totalPrice;
        this.purchaseDate = purchaseDate;
    }

    public Bill() {
    }



    public ArrayList<Products> getProduct() {
        return product;
    }

    public String getUserName() {
        return userName;
    }

    public LocalDateTime getPurchaseDate() {
        return purchaseDate;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void display() {
        int number = 1;
        System.out.println("╔====================================================================================================================================================╗");
        System.out.println("║\t                                                 Username:" + userName);
        System.out.printf("║          Sản phẩm đã mua: " +"\n");
        for (Products products: product
             ) {
            System.out.println("║                     " + number + ". " + products);
        }
        System.out.println("║ ");
        System.out.println("║                             Tổng cộng " + totalPrice + '\t' + "                           Date: " + purchaseDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")));
        System.out.println("╚====================================================================================================================================================╝");
    }

    @Override
    public String toString() {
        return "Bill{" +
                "userName='" + userName + '\'' +
                ", product=" + product +
                ", totalPrice=" + totalPrice +
                ", purchaseDate=" + purchaseDate +
                '}';
    }
}
