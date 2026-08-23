import java.util.Scanner;

public class ExceptionHandling {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        try {

            System.out.print("Enter total marks: ");
            int totalMarks = input.nextInt();

            System.out.print("Enter number of subjects: ");
            int subjects = input.nextInt();

            int average = totalMarks / subjects;

            System.out.println("\nAverage Marks: " + average);

        } catch (ArithmeticException e) {

            System.out.println("\nError: Number of subjects cannot be zero.");

        }

        input.close();
    }
}
