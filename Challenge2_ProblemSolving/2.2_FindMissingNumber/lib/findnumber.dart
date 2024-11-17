int findMissingNumber(List<int> numbers) {
    int long = numbers.length;

    // Calculate the sum of the range from 1 to n + 1
    int totalSum = ((long+1)*(long+2))~/2;
    
    // Calculate the sum of the elements in the list
    int currentSum = numbers.reduce((a, b) => a+b);

    return totalSum - currentSum;
}