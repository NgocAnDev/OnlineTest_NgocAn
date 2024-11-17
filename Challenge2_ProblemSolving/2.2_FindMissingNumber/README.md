# Find Missing Number App

## Overview  
This is a simple Dart app that finds the missing number in a sequence of consecutive numbers. It compares the sum of the numbers in the given list with the expected sum to find the missing number.

## App Structure  
- **findMissingNumber**: Function that calculates the missing number by comparing the sum of the numbers in the given list with the expected sum.
- **main.dart**: The entry point of the app that demonstrates how to use the function with a sample list of numbers.
- **findnumber_test**: This test file verifies the functionality of the findMissingNumber function by checking it against different input arrays.
## Key Function  
- **findMissingNumber(List<int> numbers)**: Calculates the missing number by finding the difference between the total expected sum and the sum of the numbers in the list.

## Steps to Build and Run the App  
1. Clone this repository to your local machine.  
2. Open the project in any Dart-supported IDE.  
3. Ensure the Dart SDK is installed.  
4. Run the app by executing the `main.dart` file.  
5. The app will print the missing number based on the input list.

## Additional Notes and Challenges  
- The main challenge was ensuring the formula for calculating the sum works correctly for any valid input list.
- Another challenge was maintaining efficiency in the solution.

## Technical Constraints  
- The app assumes the input list contains consecutive numbers with exactly one missing number.
- The time complexity of the solution is O(n).
