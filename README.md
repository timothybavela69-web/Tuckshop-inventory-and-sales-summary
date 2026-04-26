# Tuckshop Inventory and Sales Summary System

## Project Overview
This is a Java console-based application developed for the CSI142 Object Oriented Programming course.

The system simulates a tuckshop where the operator can stock products, record sales, and view reports. It demonstrates key Object-Oriented Programming (OOP) concepts such as classes, inheritance, abstraction, collections, and exception handling.

---

## Features

- Stock products into inventory  
- View available products  
- Record product sales  
- Automatically update stock after each sale  
- Prevent sales when stock is insufficient  
- View sales report with total revenue  
- Handle invalid input using exceptions  

---

## System Logic

- The **Stock Product** option is used to add inventory into the tuckshop  
- The quantity entered represents the available stock  
- When a sale is recorded:
  - The system checks if the product exists  
  - Ensures enough stock is available  
  - Reduces stock after a successful sale  
  - Records the sale for reporting  

---

## Project Structure

```
app/
  Main.java
  MenuLoop.java

model/
  Product.java (abstract class)
  Bread.java
  CokeDrink.java
  Fries.java
  Sale.java

service/
  InventoryService.java
  SalesService.java

exceptions/
  InvalidInputException.java
  OutOfStockException.java

util/
  InputValidator.java
```

---

## How to Compile and Run

### Compile:
```
javac -d out src\com\ub\csi142\app\*.java src\com\ub\csi142\model\*.java src\com\ub\csi142\service\*.java src\com\ub\csi142\util\*.java src\com\ub\csi142\exceptions\*.java
```

### Run:
```
java -cp out com.ub.csi142.app.Main
```

---

## Example Usage

- Stock Product → Add items into inventory  
- View Products → Check available stock  
- Record Sale → Sell items and update stock  
- View Sales Report → View all sales and total revenue  

---

## Group Members

- Emmanuel Tshabadira – 201805718  
- Masedi Selinda – 202507414  
- Timothy Bavela – 202500341  
- Emely Mooketsa – 202503891  

---

## OOP Concepts Used

- Encapsulation → private fields with getters in classes  
- Inheritance → Product → Bread, CokeDrink, Fries  
- Abstraction → abstract Product class  
- Polymorphism → handling different product types using Product reference  
- Collections → ArrayList for storing products and sales  
- Exception Handling → custom exceptions for invalid input and stock errors  

---

## Status

✔ Fully functional  
✔ All core features implemented  
✔ Ready for submission  
