import java.util.Scanner;

public class MultipleCatchBlocks {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        try {

            int[] marks = {85, 90, 78, 88, 95};

            System.out.print("Enter student index (0 to 4): ");
            int index = input.nextInt();

            System.out.print("Enter a number to divide the marks: ");
            int number = input.nextInt();

            int result = marks[index] / number;

            System.out.println("\nStudent Marks: " + marks[index]);
            System.out.println("Result After Division: " + result);

        }

        catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("\nError: Invalid student index.");

        }

        catch (ArithmeticException e) {

            System.out.println("\nError: Cannot divide by zero.");

        }

        catch (Exception e) {

            System.out.println("\nError: Invalid input.");

        }

        input.close();
    }
}
