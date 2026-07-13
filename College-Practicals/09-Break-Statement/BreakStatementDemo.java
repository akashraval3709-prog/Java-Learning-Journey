import java.util.Scanner;

public class BreakStatementDemo {

    public static void main(String[] args) {

        int[] numbers = {12, 25, 18, 40, 55, 72, 90};

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number to search: ");
        int search = input.nextInt();

        boolean found = false;

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] == search) {
                found = true;
                System.out.println("Number Found at index: " + i);
                break;
            }
        }

        if (!found) {
            System.out.println("Number Not Found.");
        }

        input.close();
    }
}
