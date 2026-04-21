package com.ub.csi142.service;

import java.util.ArrayList;
import java.util.List;
import com.ub.csi142.model.Sale;

public class SalesService{

  private List<Sale> sales;

  public SalesService() {
    sales = new ArrayList<>();
  }

  public void recordSale(Sale sale) {
        sales.add(sale);
    System.out.println("sales recorded succesfully.");
      }

  public void viewSalesReport() {
    if (sales.isEmpty()){
      System.out.println("No sales recorded."); 
      }else{
        System.out.println("Sales Report:");
        for(Sale sale: sales){
          System.out.println(sale);
        }
      }
  }
}
