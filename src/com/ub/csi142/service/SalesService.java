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
    }

  public void viewSalesReport() {
      if (sales.isEmpty()) {
          System.out.println("No sales recorded.");
      } else {
          double totalRevenue = 0;

          System.out.println("=== Sales Report ===");

          for (Sale sale : sales) {
              System.out.println(sale);
              totalRevenue += sale.getTotalPrice();
          }

          System.out.println("----------------------");
          System.out.printf("Total Revenue: P%.2f%n", totalRevenue);
      }
  }
}
