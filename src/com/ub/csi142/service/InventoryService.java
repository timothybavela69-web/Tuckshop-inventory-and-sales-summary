package com.ub.csi142.service;

import com.ub.csi142.exceptions.InvalidInputException;
import com.ub.csi142.exceptions.OutOfStockException;
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

    public void sellProduct(String name, int quantity)
        throws InvalidInputException, OutOfStockException {

        if (quantity <= 0) {
            throw new InvalidInputException("Quantity must be greater than 0");
        }

        Product product = findProductByName(name);

        if (product == null) {
            throw new InvalidInputException("Product not found");
        }

        if (product.getQuantity() < quantity) {
            throw new OutOfStockException("Not enough stock available");
        }

        product.reduceQuantity(quantity);
        System.out.println("Sale processed successfully.");
    }

}