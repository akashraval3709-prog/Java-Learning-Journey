import java.util.Scanner;
public class ContinueStatementDemo {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the limit: ");
        int limit = input.nextInt();

        System.out.println("\nOdd Numbers:");

        for (int i = 1; i <= limit; i++) {

            if (i % 2 == 0) {
                continue;
            }

            System.out.println(i);
        }

        input.close();
    }
}
