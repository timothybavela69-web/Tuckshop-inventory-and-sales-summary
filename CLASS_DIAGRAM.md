# Class Diagram - Tuckshop Inventory and Sales Summary System

This document shows a simple UML-style class diagram for the main classes in the project.

---

## Text-Based Class Diagram

~~~text
Product
- name: String
- price: double
- quantity: int
+ getName(): String
+ getPrice(): double
+ getQuantity(): int
+ addStock(quantity: int): void
+ reduceStock(quantity: int): void

        ^
        |
        | inherits
        |
--------------------------------
|              |               |
Bread       CokeDrink        Fries
- breadType  - fixed price    - fixed price
+ constructor + constructor   + constructor


Sale
- productName: String
- quantitySold: int
- totalPrice: double
+ getProductName(): String
+ getQuantitySold(): int
+ getTotalPrice(): double


InventoryService
- products: ArrayList<Product>
+ stockProduct(product: Product): void
+ viewProducts(): void
+ findProduct(name: String): Product


SalesService
- sales: ArrayList<Sale>
+ recordSale(product: Product, quantity: int): void
+ viewSalesReport(): void


MenuLoop
- inventoryService: InventoryService
- salesService: SalesService
+ start(): void
+ showMenu(): void


InputValidator
+ validateQuantity(quantity: int): void
+ validateMenuChoice(choice: int): void


InvalidInputException
+ InvalidInputException(message: String)


OutOfStockException
+ OutOfStockException(message: String)


Main
+ main(args: String[]): void
~~~

---

## Relationships Between Classes

### Inheritance

Bread, CokeDrink, and Fries inherit from Product.

This means they share common product features such as name, price, and quantity.

### Composition

MenuLoop has an InventoryService and a SalesService.

InventoryService manages Product objects.

SalesService manages Sale objects.

Sale stores information about a completed product sale.

### Polymorphism

The inventory can store different product types as Product objects.

For example:

- Bread is handled as a Product.
- CokeDrink is handled as a Product.
- Fries is handled as a Product.

This allows the same inventory logic to work with different product types.

---

## Package Layout

### com.ub.csi142.app

- Main
- MenuLoop

### com.ub.csi142.model

- Product
- Bread
- CokeDrink
- Fries
- Sale

### com.ub.csi142.service

- InventoryService
- SalesService

### com.ub.csi142.util

- InputValidator

### com.ub.csi142.exceptions

- InvalidInputException
- OutOfStockException