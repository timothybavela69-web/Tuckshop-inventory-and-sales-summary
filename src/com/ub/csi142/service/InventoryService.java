package com.ub.csi142.service;

import java.util.ArrayList;
import java.util.List;
import com.ub.csi142.model.Product;

public class InventoryService {

    private List<Product> products;

   public InventoryService() {
    products = new ArrayList<>();
    }

    public void addProduct(Product product ) {
        products.add(product);
        System.out.println("Product added");
    }

    public void viewProducts() {
        if (products.isEmpty()){
            System.out.println("No products available.");
        }else {
            System.out.println("Product list:");
            for (Product product : products){
                System.out.println(product);
            }
        }
    }


    public Product findProductByName(String name){
        for(Product product : products) {
            if (product.getName().equalsIgnoreCase(name)){
                return product;
            }
        }
        return null;
    }
}