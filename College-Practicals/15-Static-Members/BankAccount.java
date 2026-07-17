import java.util.Scanner;

 class BankAccount {
       private String accountHolder;
      private  double balance;
       private static int totalAccounts=0;
      private  static String bankName = "SBI";

    

      BankAccount(String name , double balance)
      {
        this.accountHolder = name;
        this.balance = balance; 
         totalAccounts++;
      }

     void displayAccountInfo()
     {
        System.out.println("\n\t------Account Detailes------\n");
        System.out.println("Banck Name  : "+bankName);
        System.out.println("AcHolder  : "+accountHolder);
        System.out.println("Balance :"+balance);
        
        
    }
    
    static void displayTotalAccounts(){
         System.out.println("\n\t------Number of Accounts------");
         System.out.println("\tTotal Accounts Open in Bank:" + totalAccounts);
     }
    }

public class program_15 {
   
    public static void main(String[] args)
    {
         Scanner scanner = new Scanner(System.in);
        
        System.out.println("--- Bank Account Program ---");
        
        System.out.print("Enter the number of Account : ");
        int count = scanner.nextInt();
        scanner.nextLine(); 
        
        for (int i = 0; i < count; i++) {
            System.out.println("\nEnter details for Account Holder " + (i + 1) + ":");
            
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Balance :" );
            double balance = scanner.nextDouble();
            scanner.nextLine(); 

            BankAccount account = new BankAccount(name , balance);
            account.displayAccountInfo();
            

            
        }
        BankAccount.displayTotalAccounts();
        scanner.close();
}
}
