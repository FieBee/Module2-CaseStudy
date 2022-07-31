package model.egg;

import model.Products;

import java.io.Serializable;

public abstract class Egg extends Products implements Serializable {
   private int id;
   private int amount;

   public Egg(int id, int amount) {
      this.id = id;
      this.amount = amount;
   }

   public Egg(String dateOfManufacturing, int cost, int id, int amount) {
      super(dateOfManufacturing, cost);
      this.id = id;
      this.amount = amount;
   }

   public int getId() {
      return id;
   }

   public void setId(int id) {
      this.id = id;
   }

   public int getAmount() {
      return this.amount;
   }

   public void setAmount(int amount) {
      this.amount = amount;
   }

}
