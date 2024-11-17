import 'package:challenge_2_1/inventory_calculator.dart';
import 'package:challenge_2_1/product.dart';
import 'package:test/test.dart';

void main() {
  List<Product> products = [];

  setUp(() {
    products = [
      Product(name: 'Laptop', price: 999.99, quantity: 5),
      Product(name: 'Smartphone', price: 499.99, quantity: 10),
      Product(name: 'Tablet', price: 299.99, quantity: 0),
      Product(name: 'Smartwatch', price: 199.99, quantity: 3),
    ];
  });

  group('Product Inventory Tests', () {
    test('Calculate total inventory value', () {
      double total = caclulateTotalInventory(products);
      expect(total, 10599.819999999998);  
    });

    test('Find most expensive product', () {
      String expensive = findMostExpensiveProduct(products);
      expect(expensive, 'Laptop');
    });

    test('Check Headphones availability', () {
      bool isInStock = checkProductInstock(products, 'Headphones'); 
      expect(isInStock, false);
    });

    test('Sort products by price descending', () {
      List<Product> sortByPrice = sortProductsByPrice(products, descending: true);  
      expect(sortByPrice[0].name, 'Laptop');
    });

    test('Sort products by quantity ascending', () {
      List<Product> sorted = sortProductsByQuantity(products, ascending: true);
      expect(sorted[0].name, 'Tablet');
    });
  });
}
