# 🏦 Custom Exception

This Java program demonstrates how to create and throw a custom exception using a simple bank account withdrawal system.

The program creates a user-defined exception called `InsufficientBalanceException`. When the user attempts to withdraw an amount greater than the available account balance, the program throws the custom exception and handles it using a `try-catch` block.

## ⚙️ How It Works

1. Accepts the account holder name from the user.
2. Accepts the initial account balance.
3. Creates a `BankAccount` object.
4. Displays the account details.
5. Accepts a withdrawal amount from the user.
6. Checks whether the withdrawal amount is greater than the available balance.
7. Throws the custom `InsufficientBalanceException` if the balance is insufficient.
8. Handles the custom exception using a `try-catch` block.
9. Displays the remaining balance if the withdrawal is successful.

## 📚 Concepts Used

- Custom Exception
- User-Defined Exception
- `throw` Keyword
- `throws` Keyword
- `try-catch` Block
- Exception Handling
- Inheritance
- Classes & Objects
- Constructors
- Scanner Class
- User Input
- Console Output

## 🖥️ Sample Output

Enter Account Holder Name: Akash
Enter Initial Balance: 5000

--- Account Details ---
Account Holder: Akash
Available Balance: 5000.0

Enter Withdrawal Amount: 7000

Transaction Failed!
Error: Insufficient balance! Available balance: 5000.0
