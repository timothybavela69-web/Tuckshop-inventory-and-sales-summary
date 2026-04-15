package com.ub.csi142.app;

import java.util.Scanner;

public class MenuLoop {
    public static void start() {
        Scanner sc = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\n--- Tuckshop Menu ---");
            System.out.println("1. Add Product");
            System.out.println("2. View Products");
            System.out.println("3. Record Sale");
            System.out.println("4. View Sales Report");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1: System.out.println("Add Product selected."); 
                        break;
                case 2: System.out.println("View Products selected."); 
                        break;
                case 3: System.out.println("Record Sale selected."); 
                        break;
                case 4: System.out.println("View Sales Report selected."); 
                        break;
                case 5:
                    System.out.println("Exiting system...");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }

        sc.close();
    }
}
