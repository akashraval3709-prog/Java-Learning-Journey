import java.util.Scanner;

public class SumOfHarmonicSeries {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number for Sum Of Harmonic Series : ");
        int num = input.nextInt();
        float sum = 0.0f;
        for(int i=1; i <= num;i++)
        {
            sum = sum + (float) 1/i;
        }

        System.out.println("\nSum of Harmonic Series =" + sum);

        input.close();
    }
}
