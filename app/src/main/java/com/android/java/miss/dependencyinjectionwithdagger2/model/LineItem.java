package com.android.java.miss.dependencyinjectionwithdagger2.model;

/**
 * This extends product to add price.
 */

public class LineItem  extends Product {
  private int quantity;

  public LineItem() {
  }

  public LineItem(Product product, int quantity) {
    super(product);
    this.quantity = quantity;
  }

  public int getQuantity() {
    return quantity;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

  public double getSumPrice() {
    return getSalePrice() * quantity;
  }
}
