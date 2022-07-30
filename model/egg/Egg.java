package model.egg;

import model.Products;

import java.io.Serializable;

public abstract class Egg extends Products implements Serializable {
   private int amount;

   public Egg(int amount) {
      this.amount = amount;
   }

   public Egg(String dateOfManufacturing, int cost, int amount) {
      super(dateOfManufacturing, cost);
      this.amount = amount;
   }

   public int getAmount() {
      return this.amount;
   }

   public void setAmount(int amount) {
      this.amount = amount;
   }

   @Override
   public String toString() {
      return "Egg{" +
              "amount=" + amount +
              "} " + super.toString();
   }
}
