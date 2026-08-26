# 🪆 Nested Try Statements

This Java program demonstrates the use of nested `try` statements in exception handling.

The program accepts array elements from the user and allows the user to access an element using its index. The outer `try` block handles invalid array indexes.

Inside the outer `try` block, an inner `try` block performs division using the selected array element. The inner `catch` block handles division by zero.

## ⚙️ How It Works

1. Accepts the number of array elements from the user.
2. Stores user-entered values in an array.
3. Uses an outer `try` block to access an array element.
4. Handles invalid indexes using `ArrayIndexOutOfBoundsException`.
5. Uses an inner `try` block to perform division.
6. Handles division by zero using `ArithmeticException`.
7. Demonstrates how nested exception handling works.

## 📚 Concepts Used

- Exception Handling
- Nested `try` Statements
- Multiple `catch` Blocks
- `ArrayIndexOutOfBoundsException`
- `ArithmeticException`
- Arrays
- Scanner Class
- User Input
- Console Output
