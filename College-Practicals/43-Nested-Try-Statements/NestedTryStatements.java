
import java.util.Scanner;

public class NestedTryStatements {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int size = input.nextInt();

        int[] numbers = new int[size];

        System.out.println("\nEnter array elements:");

        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            numbers[i] = input.nextInt();
        }

        try {

            System.out.print("\nEnter index to access: ");
            int index = input.nextInt();

            int selectedNumber = numbers[index];

            System.out.println("Selected Number: " + selectedNumber);

            try {

                System.out.print("Enter a number to divide " +
                        selectedNumber + " by: ");

                int divisor = input.nextInt();

                int result = selectedNumber / divisor;

                System.out.println("Division Result: " + result);

            }
            catch (ArithmeticException e) {
                System.out.println("Inner Exception: Cannot divide by zero.");
            }

        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Outer Exception: Invalid array index.");
        }

        input.close();
    }
}
