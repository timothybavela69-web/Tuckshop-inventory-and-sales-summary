package com.ub.csi142.app;

import java.util.Scanner;

import com.ub.csi142.exceptions.InvalidInputException;
import com.ub.csi142.exceptions.OutOfStockException;
import com.ub.csi142.model.*;
import com.ub.csi142.service.*;

public class MenuLoop {

    private InventoryService inventoryService;
    private SalesService salesService;
    private Scanner scanner;

    public MenuLoop() {
        inventoryService = new InventoryService();
        salesService = new SalesService();
        scanner = new Scanner(System.in);
    }

    public void start() {
        boolean running = true;

        while (running) {
            System.out.println("\n--- Tuckshop Menu ---");
            System.out.println("1. Stock Product");
            System.out.println("2. View Products");
            System.out.println("3. Record Sale");
            System.out.println("4. View Sales Report");
            System.out.println("5. Exit");
            System.out.print("Choose option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    addProduct();
                    break;
                case 2:
                    inventoryService.viewProducts();
                    break;
                case 3:
                    recordSale();
                    break;           
                case 4:
                    salesService.viewSalesReport();
                    break;
                case 5:
                    running = false;
                    System.out.println("Exiting system...");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        }

        scanner.close();
    }

    private void addProduct() {
        System.out.print("Enter product type (bread/coke/fries): ");
        String type = scanner.nextLine().toLowerCase().trim();

        System.out.print("Enter quantity: ");
        int quantity = Integer.parseInt(scanner.nextLine());

        String name;
        double price;
        Product product;

        switch (type) {
            case "bread":
                System.out.println("Choose bread type:");
                System.out.println("1. White Bread");
                System.out.println("2. Brown Bread");
                System.out.print("Enter choice: ");

                int breadChoice = Integer.parseInt(scanner.nextLine());

                if (breadChoice == 1) {
                    name = "White Bread";
                    price = 9.95;
                } else if (breadChoice == 2) {
                    name = "Brown Bread";
                    price = 7.99;
                } else {
                    System.out.println("Invalid bread choice.");
                    return;
                }

                product = new Bread(name, price, quantity);
                break;

            case "coke":
                name = "Coke";
                price = 12.35;
                product = new CokeDrink(name, price, quantity);
                break;

            case "fries":
                name = "Fries";
                price = 15.00;
                product = new Fries(name, price, quantity);
                break;

            default:
                System.out.println("Invalid product type!");
                return;
        }

        inventoryService.addProduct(product);
        System.out.println("Product stocked successfully!");
    }
    private void recordSale() {
        try {
            System.out.print("Enter product name: ");
            String name = scanner.nextLine().trim();

            System.out.print("Enter quantity: ");
            int quantity = Integer.parseInt(scanner.nextLine());

            Product product = inventoryService.sellProduct(name, quantity);
            double total = product.getPrice() * quantity;

            Sale sale = new Sale(product.getName(), quantity, total);
            salesService.recordSale(sale);

            System.out.printf("Sale processed successfully. Total: P%.2f%n", total);

        } catch (InvalidInputException | OutOfStockException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Invalid number entered.");
        }
    }
}