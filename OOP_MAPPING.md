# OOP Mapping - Tuckshop Inventory and Sales Summary System

## Classes and Objects
The system uses several classes to represent parts of a tuckshop system, such as `Product`, `Sale`, `Bread`, `CokeDrink`, `Fries`, `InventoryService`, and `SalesService`.

## Encapsulation
Encapsulation is used through class fields and methods. For example, `Sale` stores product name, quantity, and total price as private fields and provides getter methods.

## Constructors
Constructors are used to create objects with starting values. Examples include:
- `Product(String name, double price, int quantity)`
- `Sale(String productName, int quantity, double totalPrice)`
- `Bread(String name, double price, int quantity)`

## Inheritance
`Bread`, `CokeDrink`, and `Fries` inherit from the abstract `Product` class.

## Abstraction
`Product` is an abstract class that represents a general product. Specific products such as Bread, CokeDrink, and Fries extend it.

## Polymorphism
Polymorphism is shown when different product objects are stored and handled using the `Product` reference.

Example:
`Product product;`

## Collections
The project uses `ArrayList` to store products and sales:
- `List<Product> products`
- `List<Sale> sales`

## Packages
The project is organised into packages:
- `app`
- `model`
- `service`
- `exceptions`
- `util`

## Exception Handling
The project uses custom exceptions:
- `InvalidInputException`
- `OutOfStockException`

These help prevent the program from crashing when invalid input is entered or when stock is insufficient.

## Summary
This project demonstrates key OOP concepts through a tuckshop inventory and sales system. The operator can stock products, record sales, update stock automatically, and view sales reports.