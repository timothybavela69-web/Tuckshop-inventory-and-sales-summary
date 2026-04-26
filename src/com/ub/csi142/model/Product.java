package com.ub.csi142.model;
public abstract class Product {
  protected String name; 
  protected double price;
  protected int quantity;

  public Product(String name,double price,int quantity){
  this.name=name; 
  this.price=price;
  this.quantity=quantity;
  }
  public String getName(){
    return name;
  }
  public double getPrice(){
    return price;
  }
  public int getQuantity(){
    return quantity;
  }
  public void reduceQuantity(int soldQuantity) {
    this.quantity -= soldQuantity;
}
  @Override
  public String toString() {
      return String.format("Name: %s | Price: P%.2f | Quantity: %d",
              name, price, quantity);
  }
}
