import java.util.Scanner;

// Custom Exception
class InsufficientBalanceException extends Exception {

    public InsufficientBalanceException(String message) {
        super(message);
    }
}

class BankAccount {

    private String accountHolder;
    private double balance;

    public BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public void withdraw(double amount)
            throws InsufficientBalanceException {

        if (amount > balance) {
            throw new InsufficientBalanceException(
                    "Insufficient balance! Available balance: " + balance
            );
        }

        balance = balance - amount;

        System.out.println("\nWithdrawal Successful!");
        System.out.println("Withdrawn Amount: " + amount);
        System.out.println("Remaining Balance: " + balance);
    }

    public void displayAccount() {

        System.out.println("\n--- Account Details ---");
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Available Balance: " + balance);
    }
}

public class CustomException {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Account Holder Name: ");
        String name = input.nextLine();

        System.out.print("Enter Initial Balance: ");
        double balance = input.nextDouble();

        BankAccount account = new BankAccount(name, balance);

        account.displayAccount();

        System.out.print("\nEnter Withdrawal Amount: ");
        double withdrawAmount = input.nextDouble();

        try {

            account.withdraw(withdrawAmount);

        } catch (InsufficientBalanceException e) {

            System.out.println("\nTransaction Failed!");
            System.out.println("Error: " + e.getMessage());
        }

        input.close();
    }
}
