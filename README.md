# Tuckshop-inventory-and-sales-summary

GROUP MEMBERS:-

Emmanuel Tshabadira - 201805718

Masedi Selinda - 202507414

Timothy Bavela - 202500341

Emely Mooketsa - 202503891

PROJECT TITLE: Tuckshop Inventory and Sales Summary.

DOMAIN: Business and informal Trade

## SHORT CONCEPT NOTE

This project aims to develop a light weight java application that helps tuckshop owners manage stock and track sales. The system will allow users to record items, update inventory after each sale, and generate simple daily summaries. By digitizing these processes, tuckshop operators can reduce errors, avoid stockouts, and gain insights into their most profitable products. The solution is designed to be easy to use, mobile-friendly, and practical for informal traders who usually rely on manual record keeping.

# MILESTONE 2

## Package Structure + Classes

src/com/ub/csi142
 ├── app
 │    ├── MainApp.java
 │    └── MenuLoop.java
 ├── model
 │    ├── Product.java
 │    ├── Fries.java
 │    ├── CokeDrink.java
 │    ├── Bread.java
 │    └── Sale.java
 ├── service
 │    ├── InventoryService.java
 │    └── SalesService.java
 ├── util
 │    └── InputValidator.java
 └── exceptions
      ├── OutOfStockException.java
      └── InvalidInputException.java

## Class List:

## 	Package: app
•	Main – Entry point of the program. Calls the menu loop.
•	MenuLoop – Contains the menu loop logic.

## 	Package: model
•	Product – Abstract superclass for all products.
•	Fries – Subclass of Product representing Fries.
•	CokeDrink – Subclass of Product representing coke drinks.
•	Bread – Subclass of Product representing bread.
•	Sale – Records transactions.

## 	Package: service
•	InventoryService – Manages products.
•	SalesService – Manages sales.

## 	Package: util
•	InputValidator – Helper class for input validation.

## 	Package: exceptions
•	OutOfStockException – Raised when stock is insufficient.
•	InvalidInputException – Raised when user input is invalid.
