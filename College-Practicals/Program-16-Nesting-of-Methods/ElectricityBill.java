import java.util.Scanner;

class ElectricityBill {

    static int calculateUnitCharge(int units) {
        return units * 8;
    }

    static double calculateGST(int amount) {
        return amount * 0.18;
    }

    static double calculateTotalBill(int units) {

        int amount = calculateUnitCharge(units);   // Nested Method
        double gst = calculateGST(amount);         // Nested Method

        return amount + gst;
    }

    static void displayBill(int units) {

        double total = calculateTotalBill(units);  // Nested Method

        System.out.println("\n----- Electricity Bill -----");
        System.out.println("Units Consumed : " + units);
        System.out.println("Total Bill     : ₹" + total);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Units Consumed : ");
        int units = sc.nextInt();

        displayBill(units);

        sc.close();
    }
}
