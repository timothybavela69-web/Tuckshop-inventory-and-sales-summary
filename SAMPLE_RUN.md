# Sample Run - Tuckshop Inventory and Sales Summary System

This file shows a sample console run of the Tuckshop Inventory and Sales Summary system.

The sample run demonstrates stocking products, viewing inventory, recording sales, viewing updated stock, generating a sales report, and handling invalid input.

---

## Starting the Program

Command used to run the program:

~~~bash
java -cp out com.ub.csi142.app.Main
~~~

---

## Sample Console Session

~~~text
--- Tuckshop Menu ---
1. Stock Product
2. View Products
3. Record Sale
4. View Sales Report
5. Exit
Choose option: 1

Enter product type (bread/coke/fries): bread
Enter quantity: 10
Choose bread type:
1. White Bread
2. Brown Bread
Enter choice: 1

Product stocked successfully!

--- Tuckshop Menu ---
1. Stock Product
2. View Products
3. Record Sale
4. View Sales Report
5. Exit
Choose option: 1

Enter product type (bread/coke/fries): coke
Enter quantity: 8

Product stocked successfully!

--- Tuckshop Menu ---
1. Stock Product
2. View Products
3. Record Sale
4. View Sales Report
5. Exit
Choose option: 1

Enter product type (bread/coke/fries): fries
Enter quantity: 6

Product stocked successfully!

--- Tuckshop Menu ---
1. Stock Product
2. View Products
3. Record Sale
4. View Sales Report
5. Exit
Choose option: 2

Product list:
Name: White Bread | Price: P9.95 | Quantity: 10
Name: Coke | Price: P12.35 | Quantity: 8
Name: Fries | Price: P15.00 | Quantity: 6

--- Tuckshop Menu ---
1. Stock Product
2. View Products
3. Record Sale
4. View Sales Report
5. Exit
Choose option: 3

Enter product name: white bread
Enter quantity: 3

Sale processed successfully. Total: P29.85

--- Tuckshop Menu ---
1. Stock Product
2. View Products
3. Record Sale
4. View Sales Report
5. Exit
Choose option: 3

Enter product name: coke
Enter quantity: 2

Sale processed successfully. Total: P24.70

--- Tuckshop Menu ---
1. Stock Product
2. View Products
3. Record Sale
4. View Sales Report
5. Exit
Choose option: 2

Product list:
Name: White Bread | Price: P9.95 | Quantity: 7
Name: Coke | Price: P12.35 | Quantity: 6
Name: Fries | Price: P15.00 | Quantity: 6

--- Tuckshop Menu ---
1. Stock Product
2. View Products
3. Record Sale
4. View Sales Report
5. Exit
Choose option: 4

=== Sales Report ===
Product: White Bread, Quantity: 3, Total Price: P29.85
Product: Coke, Quantity: 2, Total Price: P24.70
----------------------
Total Revenue: P54.55

--- Tuckshop Menu ---
1. Stock Product
2. View Products
3. Record Sale
4. View Sales Report
5. Exit
Choose option: 9

Invalid option. Please choose a number from 1 to 5.

--- Tuckshop Menu ---
1. Stock Product
2. View Products
3. Record Sale
4. View Sales Report
5. Exit
Choose option: 3

Enter product name: white bread
Enter quantity: 20

Error: Not enough stock available

--- Tuckshop Menu ---
1. Stock Product
2. View Products
3. Record Sale
4. View Sales Report
5. Exit
Choose option: 5

Thank you for using the Tuckshop Inventory and Sales Summary System.
~~~

---

## What This Sample Run Demonstrates

- The system runs as a Java console application.
- The menu repeats until the user chooses to exit.
- The user can stock different product types.
- The user can view available stock.
- The user can record sales.
- Product quantities reduce after successful sales.
- The system calculates totals automatically using product prices.
- The sales report displays sales and total revenue.
- Invalid menu options are handled without crashing.
- Insufficient stock is handled without crashing.