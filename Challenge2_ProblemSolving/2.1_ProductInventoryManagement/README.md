# Product Inventory Management App

## Overview
This is a simple Product Inventory Management app built using Dart. It allows users to manage products, calculate total inventory value, sort products by price or quantity, and check if a specific product is in stock. The app uses object-oriented principles to model products and perform various calculations and checks.

## App Structure
- **Product Class**: Represents a product with attributes such as name, price, and quantity.
- **InventoryCalculator**: Contains logic for calculating total inventory value, finding the most expensive product, checking product availability, and sorting products.
- **Main.dart**: The entry point of the app, which initializes the list of products and demonstrates the app's functionality.
- **productmanagement_test**: Test the functionality of the Product Inventory Management app, including calculations, product availability checks, and sorting features.

## Key Functions
- **caclulateTotalInventory(List<Product> products)**: Calculates the total value of all products in the inventory.
- **findMostExpensiveProduct(List<Product> products)**: Returns the name of the most expensive product in the inventory.
- **checkProductInstock(List<Product> products, String nameCheck)**: Checks whether a product is in stock based on its name.
- **sortProductsByPrice(List<Product> products, {bool descending = false})**: Sorts products by price, either in ascending or descending order.
- **sortProductsByQuantity(List<Product> products, {bool ascending = false})**: Sorts products by quantity, either in ascending or descending order.

## Steps to Build and Run the App:
 1. Clone this repository to your local machine.
 2. Open the project in VSCode or any Dart-supported IDE.
 3. Ensure that you have the Dart SDK installed.
 4. Run the app by executing the `main.dart` file.
 5. The app will print the total inventory value, most expensive product, stock check, and sorted product lists to the console.

## Additional Notes and Challenges
- One of the challenges was ensuring proper sorting of products and handling different conditions like ascending/descending order.
- Another challenge was implementing the inventory calculations and managing the list of products in an efficient way.

## Technical Constraints
- The app currently manages only a small set of products.
- Price and quantity sorting is limited to two conditions: ascending and descending.

