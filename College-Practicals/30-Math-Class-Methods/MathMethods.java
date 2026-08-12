import java.util.Scanner;

public class MathMethods {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = input.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = input.nextDouble();

        System.out.println("\n--- Math Class Results ---");

        System.out.println("Maximum: " + Math.max(num1, num2));
        System.out.println("Minimum: " + Math.min(num1, num2));
        System.out.println("Absolute Value of First Number: " + Math.abs(num1));
        System.out.println("Square Root of First Number: " + Math.sqrt(num1));
        System.out.println("Power: " + Math.pow(num1, num2));
        System.out.println("Rounded First Number: " + Math.round(num1));
        System.out.println("Ceiling of First Number: " + Math.ceil(num1));
        System.out.println("Floor of First Number: " + Math.floor(num1));

        input.close();
    }
}
