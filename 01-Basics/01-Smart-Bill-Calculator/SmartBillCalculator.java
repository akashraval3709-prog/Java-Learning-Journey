import java.util.Scanner;

public class SmartBillCalculator {

    public static void main(String[] args) {
        int basePrice;
        int taxPercent = 18;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the total amount : ");
        basePrice= sc.nextInt();
        System.out.print("Enter the tax : ");
        taxPercent= sc.nextInt();



        double taxAmount = (basePrice * taxPercent) / 100.0f;
        double totalBill = basePrice + taxAmount;

        System.out.println("Total Final Bill is : " + totalBill);
        sc.close();

    }
}
