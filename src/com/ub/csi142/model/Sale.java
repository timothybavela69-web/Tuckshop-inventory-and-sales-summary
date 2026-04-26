 package com.ub.csi142.model;

public class Sale{ 
  private String productName;
  private int quantity;
  private double totalPrice;

  public Sale (String productName,int quantity,double totalPrice){
  this.productName=productName;
  this.quantity=quantity;
  this.totalPrice=totalPrice;
  }
    public String getProductName(){
    return productName;
  }
    public int getQuantity(){
    return quantity;
  }
  public double getTotalPrice(){
    return totalPrice;
  }
  @Override
  public String toString() {
      return String.format("Product: %s, Quantity: %d, Total Price: P%.2f",
              productName, quantity, totalPrice);
  }
}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             
  
