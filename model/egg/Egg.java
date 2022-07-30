package model.egg;

import model.Products;

public abstract class Egg extends Products {
   private int amount;

   public Egg(int amount) {
      this.amount = amount;
   }

   public Egg(String dateOfManufacturing, int cost, int amount) {
      super(dateOfManufacturing, cost);
      this.amount = amount;
   }

   public int getAmount() {
      return amount;
   }

   public void setAmount(int amount) {
      this.amount = amount;
   }
}
