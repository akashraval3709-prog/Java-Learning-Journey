import java.util.Scanner;
import calculator.Calculator;

public class PackageDemo {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = input.nextInt();

        System.out.print("Enter second number: ");
        int num2 = input.nextInt();

        Calculator calc = new Calculator();

        System.out.println("\nCalculator Result:");
        calc.displayResult(num1, num2);

        input.close();
    }
}
