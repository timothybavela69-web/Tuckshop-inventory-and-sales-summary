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
            System.out.println("1. Add Product");
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
                    try {
                        System.out.print("Enter product name: ");
                        String name = scanner.nextLine();

                        System.out.print("Enter quantity: ");
                        int quantity = Integer.parseInt(scanner.nextLine());

                        inventoryService.sellProduct(name, quantity);

                    } catch (InvalidInputException | OutOfStockException e) {
                        System.out.println("Error: " + e.getMessage());
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid number entered.");
                    }
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
        String type = scanner.nextLine().toLowerCase();

        System.out.print("Enter name: ");
        String name = scanner.nextLine();

        System.out.print("Enter price: ");
        double price = scanner.nextDouble();

        System.out.print("Enter quantity: ");
        int quantity = scanner.nextInt();
        scanner.nextLine();

        Product product = null;

        switch (type) {
            case "bread":
                product = new Bread(name, price, quantity);
                break;
            case "coke":
                product = new CokeDrink(name, price, quantity);
                break;
            case "fries":
                product = new Fries(name, price, quantity);
                break;
            default:
                System.out.println("Invalid product type!");
                return;
        }

        inventoryService.addProduct(product);
        System.out.println("Product added successfully!");
    }

    private void recordSale() {
        System.out.print("Enter product name: ");
        String name = scanner.nextLine();

        System.out.print("Enter quantity: ");
        int quantity = scanner.nextInt();
        scanner.nextLine();

        double price = 10;
        double total = price * quantity;

        Sale sale = new Sale(name, quantity, total);
        salesService.recordSale(sale);
    }
}