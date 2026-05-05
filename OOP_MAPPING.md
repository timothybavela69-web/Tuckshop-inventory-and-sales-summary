# OOP Mapping - Tuckshop Inventory and Sales Summary System

This document explains how the Tuckshop Inventory and Sales Summary System demonstrates the required Object-Oriented Programming concepts for the CSI142 Group Mini-Project.

---

## 1. Classes and Objects

The project uses several user-defined classes to represent meaningful parts of the tuckshop system.

### Main classes used

- `Main`
- `MenuLoop`
- `Product`
- `Bread`
- `CokeDrink`
- `Fries`
- `Sale`
- `InventoryService`
- `SalesService`
- `InputValidator`
- `InvalidInputException`
- `OutOfStockException`

### Explanation

Objects are created from these classes to represent products, sales, services, and validation behavior in the system.

For example:

- A `Bread` object represents bread sold in the tuckshop.
- A `CokeDrink` object represents Coke stock.
- A `Fries` object represents fries stock.
- A `Sale` object represents a completed sale transaction.

---

## 2. Encapsulation

Encapsulation is shown by using private fields and public methods to control access to class data.

### Files where it appears

- `Product.java`
- `Bread.java`
- `CokeDrink.java`
- `Fries.java`
- `Sale.java`

### Explanation

Product information such as name, price, and quantity is protected inside the classes. Other classes do not directly change the fields. They use methods such as getters, setters, or behavior methods.

This helps protect the data and allows validation before values are changed.

---

## 3. Constructors

Constructors are used to create objects with starting values.

### Files where it appears

- `Product.java`
- `Bread.java`
- `CokeDrink.java`
- `Fries.java`
- `Sale.java`

### Explanation

The product classes use constructors to set important values such as product name, price, and quantity.

For example:

- `Bread` objects are created with bread type and quantity.
- `CokeDrink` objects are created with a fixed product price and quantity.
- `Fries` objects are created with a fixed product price and quantity.
- `Sale` objects are created when a sale is recorded.

---

## 4. Methods and Modularity

The project breaks logic into separate methods instead of putting everything inside the `main` method.

### Files where it appears

- `Main.java`
- `MenuLoop.java`
- `InventoryService.java`
- `SalesService.java`
- `InputValidator.java`

### Explanation

The `Main` class starts the program.

The `MenuLoop` class controls the menu and user interaction.

The `InventoryService` class handles stock-related actions.

The `SalesService` class handles sale-related actions.

The `InputValidator` class handles validation of user input.

This makes the project easier to read, test, and maintain.

---

## 5. Composition

Composition is shown through a has-a relationship between classes.

### Files where it appears

- `Sale.java`
- `SalesService.java`
- `InventoryService.java`

### Explanation

A sale is connected to a product. This means the `Sale` class depends on product information such as product name, quantity sold, and total price.

The service classes also manage collections of objects. For example:

- `InventoryService` manages product objects.
- `SalesService` manages sale records.

This shows that larger parts of the system are built using smaller objects.

---

## 6. Inheritance

Inheritance is shown through the product hierarchy.

### Files where it appears

- `Product.java`
- `Bread.java`
- `CokeDrink.java`
- `Fries.java`

### Explanation

`Product` is the parent class.

The following classes inherit from `Product`:

- `Bread`
- `CokeDrink`
- `Fries`

This means the child classes share common product features such as name, price, and quantity, while still allowing each product type to have its own specific details.

---

## 7. Abstraction

Abstraction is shown by using the `Product` class as a general representation of tuckshop products.

### Files where it appears

- `Product.java`
- `Bread.java`
- `CokeDrink.java`
- `Fries.java`

### Explanation

The `Product` class represents the general idea of a product.

The system does not need to treat every product completely separately. Instead, different products can be handled using the common `Product` structure.

This hides unnecessary details and allows the program to work with products in a simpler and more organized way.

---

## 8. Polymorphism

Polymorphism is shown when different product objects are handled through the same parent type.

### Files where it appears

- `Product.java`
- `Bread.java`
- `CokeDrink.java`
- `Fries.java`
- `InventoryService.java`

### Explanation

The system can store and process different product types as `Product` objects.

For example, the inventory can contain:

- `Bread`
- `CokeDrink`
- `Fries`

Even though these are different classes, they can all be treated as products. This allows the same inventory logic to work with different product types.

---

## 9. Collections

Collections are used to store and manage multiple products and sales.

### Files where it appears

- `InventoryService.java`
- `SalesService.java`

### Explanation

The project uses Java collections such as `ArrayList` to store:

- product records
- sale records

This allows the system to add, view, search, update, and report on multiple items during the program run.

---

## 10. Packages

The project uses packages to organize the code into clear sections.

### Packages used

- `com.ub.csi142.app`
- `com.ub.csi142.model`
- `com.ub.csi142.service`
- `com.ub.csi142.util`
- `com.ub.csi142.exceptions`

### Explanation

Each package has a clear purpose.

- `app` contains the main program and menu loop.
- `model` contains domain classes such as products and sales.
- `service` contains business logic for inventory and sales.
- `util` contains helper classes such as input validation.
- `exceptions` contains custom exception classes.

This improves organization and makes the project easier to understand.

---

## 11. Robustness and Input Validation

The system handles invalid input and unexpected cases without crashing.

### Files where it appears

- `InputValidator.java`
- `InvalidInputException.java`
- `OutOfStockException.java`
- `MenuLoop.java`
- `InventoryService.java`
- `SalesService.java`

### Explanation

The system checks user input before processing it.

Examples of handled errors include:

- invalid menu choices
- invalid product names
- negative or zero quantities
- trying to sell more stock than available

Custom exceptions such as `InvalidInputException` and `OutOfStockException` make the error handling clearer.

---

## 12. Summary of OOP Requirements

| Required OOP Element | Where It Appears |
|---|---|
| Classes and objects | Product, Bread, CokeDrink, Fries, Sale, services |
| Encapsulation | Private fields and controlled methods in model classes |
| Constructors | Product, Bread, CokeDrink, Fries, Sale |
| Methods and modularity | MenuLoop, InventoryService, SalesService, InputValidator |
| Composition | Sale connected to product information; services manage objects |
| Inheritance | Bread, CokeDrink, and Fries inherit from Product |
| Abstraction | Product represents the general product idea |
| Polymorphism | Different product types handled as Product objects |
| Collections | ArrayList used in service classes |
| Packages | app, model, service, util, exceptions |
| Robustness | Input validation and custom exceptions |

---

## Conclusion

The Tuckshop Inventory and Sales Summary System demonstrates the main CSI142 OOP concepts in a small, realistic Java console application.

The system uses classes, inheritance, abstraction, polymorphism, collections, packages, validation, and exception handling to create a complete and understandable tuckshop management program.