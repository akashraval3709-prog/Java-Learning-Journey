import java.util.Scanner;

public class PrimeNumberCheck{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number for sum of digit : ");
        int num = input.nextInt();
        int t = 0;
        for (int i = 2; i < num; i++) {
            if (i % 2 == 0) {
                t++;
                if (t > 1) {
                     
                    break;

                }
            }
        }

        if (t < 2)
            System.out.println("Number is prime");
        else
            System.out.println("Number is not prime");

        input.close();
    }
}
