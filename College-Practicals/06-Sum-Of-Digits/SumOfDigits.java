import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number for sum of digit : ");
        int num = input.nextInt();
        int sum = 0;
        while (num != 0) {

            int r = num % 10;
            sum = sum + r;
            num /= 10;
        }

        System.out.println("\nSum of digit.. : " + sum);

        input.close();
    }
}
