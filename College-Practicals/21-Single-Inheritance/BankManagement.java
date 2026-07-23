import java.util.Scanner;

class BankAccount {

    protected String accountHolder;
    protected int accountNumber;
    protected double balance;

    BankAccount(String accountHolder, int accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void displayAccountDetails() {
        System.out.println("\n========== Account Details ==========");
        System.out.println("Account Holder : " + accountHolder);
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Balance        : ₹" + balance);
    }
}

class SavingsAccount extends BankAccount {

    private double interestRate;

    SavingsAccount(String accountHolder, int accountNumber, double balance, double interestRate) {
        super(accountHolder, accountNumber, balance);
        this.interestRate = interestRate;
    }

    void calculateInterest() {
        double interest = (balance * interestRate) / 100;
        System.out.println("Interest Rate  : " + interestRate + "%");
        System.out.println("Interest Earned: ₹" + interest);
    }
}

public class BankManagement {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("----- Single Inheritance Demo -----");

        System.out.print("Account Holder Name: ");
        String name = input.nextLine();

        System.out.print("Account Number: ");
        int accountNo = input.nextInt();

        System.out.print("Balance: ");
        double balance = input.nextDouble();

        System.out.print("Interest Rate (%): ");
        double rate = input.nextDouble();

        SavingsAccount account = new SavingsAccount(name, accountNo, balance, rate);

        account.displayAccountDetails();
        account.calculateInterest();

        input.close();
    }
}
