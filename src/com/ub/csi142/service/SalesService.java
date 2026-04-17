package com.ub.csi142.service;

import java.util.ArrayList;
import java.util.List;
import com.ub.csi142.model.Product;

public class SalesService{

  private List<Sale> sales;

  public SalesService() {
    sales = new Arraylist<>();
  }

  public void recordSale(Sale sale) {
        sales.add(sale);
    System.out.printIn("sales recorded succesfully.");
      }

  public void viewSalesReport() {
    if (Sales.isEmpty()){
      System.out.printIn("No sales recorded."); 
      }else{
        System.out.printIn("Sales Report:");
        for(Sale sale: sales){
          System.out.printIn(sale);
        }
      }
  }
}
