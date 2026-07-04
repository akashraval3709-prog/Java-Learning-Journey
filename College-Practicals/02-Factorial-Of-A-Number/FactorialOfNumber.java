import java.util.Scanner;

public class FactorialOfNumber {

    public static void main(String [] args)
    {
         Scanner input = new Scanner(System.in);
         System.out.print("Enter the number :");
        int num = input.nextInt();
         long f=1;
        while (num != 0) {
            f *= num;
            num--;
        }
        

         System.out.println("Number of factorial : "+ f);
        input.close();
    }
    

}
