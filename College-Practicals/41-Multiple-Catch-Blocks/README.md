# ⚠️ Multiple Catch Blocks

This Java program demonstrates the use of multiple `catch` blocks for handling
different types of exceptions.

The program stores student marks inside an array. The user selects a student
using an array index and enters a number to divide the selected marks.

Different exceptions are handled using separate `catch` blocks.

## ⚙️ How It Works

1. Creates an array containing student marks.
2. Accepts a student index from the user.
3. Accepts a number for division.
4. Accesses the selected student's marks.
5. Performs division using the entered number.
6. Handles `ArrayIndexOutOfBoundsException` for an invalid array index.
7. Handles `ArithmeticException` when dividing by zero.
8. Handles other unexpected errors using the general `Exception` class.

## 📚 Concepts Used

- Exception Handling
- `try` Block
- Multiple `catch` Blocks
- `ArrayIndexOutOfBoundsException`
- `ArithmeticException`
- General `Exception`
- Arrays
- Scanner Class
- User Input
- Console Output

## 🖥️ Sample Output

Enter student index (0 to 4): 2
Enter a number to divide the marks: 2

Student Marks: 78
Result After Division: 39
