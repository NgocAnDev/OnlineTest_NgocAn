import 'package:intl/intl.dart';

import 'lib/inventory_calculator.dart';
import 'lib/product.dart';

void main() {
  List<Product> products = [
    Product(name: 'Laptop', price: 999.99, quantity: 5),
    Product(name: 'Smartphone', price: 499.99, quantity: 10),
    Product(name: 'Tablet', price: 299.99, quantity: 0),
    Product(name: 'Smartwatch', price: 199.99, quantity: 3),
  ];

  // Total
  double totalValue = caclulateTotalInventory(products);
  final formNumber = NumberFormat("#,##0.00");

  print("Total inventory value: ${formNumber.format(totalValue)}");

  // Find most expensive Product
  String mostEx = findMostExpensiveProduct(products);
  print('Most expensive product is: ${mostEx} ');
  print("-" * 35);

  // Check if "Headphones" is in stock or not
  bool isInStock = checkProductInstock(products, 'Headphones');
  print('Is "Headphones" in stock ? : ${isInStock} ');
  print("-" * 35);

  // Sort by price (descending)
  List<Product> sortByPrice = sortProductsByPrice(products, descending: true);
  print('Product sorted by price(descending): ');
  sortByPrice.forEach((product) => print(' ${product.name}: ${product.price}'));
  print("-" * 35);

  // Sort by quantity(ascending)
  List<Product> sortedByQuantity =
      sortProductsByQuantity(products, ascending: true);
  print('Products Sorted by Quantity (Ascending):');
  sortedByQuantity
      .forEach((product) => print(' ${product.name}: ${product.quantity}'));
}
