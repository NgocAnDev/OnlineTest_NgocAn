import 'product.dart';

//function to Calculate total inventory value
double caclulateTotalInventory(List<Product> products) {
  double total = 0;
  for (var product in products) {
    total += product.price * product.quantity;
  }
  return total;
}

//Function to find the most expensive product
String findMostExpensiveProduct(List<Product> products) {
  Product mostEx = products[0];
  for (var product in products) {
    if (product.price > mostEx.price) {
      mostEx = product;
    }
  }
  return mostEx.name;
}

// Function to check ìf product named "Headphones" is in stock
bool checkProductInstock(List<Product> products, String nameCheck) {
  for (var product in products) {
    if (product.name == nameCheck) {
      return true;
    }
  }
  return false;
}

// Sort products by price (ascending or descending)
List<Product> sortProductsByPrice(List<Product> products,
    {bool descending = false}) {
  products.sort((a, b) =>
      descending ? b.price.compareTo(a.price) : a.price.compareTo(b.price));
  return products;
}

// Sort products by quantity (ascending or descending)
List<Product> sortProductsByQuantity(List<Product> products,
    {bool ascending = false}) {
  products.sort((a, b) => ascending
      ? a.quantity.compareTo(b.quantity)
      : b.quantity.compareTo(a.quantity));
  return products;
}
