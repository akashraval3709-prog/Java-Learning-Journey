import java.util.Scanner;
public class LargestOfThreeNumbers {
    public static void main(String[] args)
    {
       Scanner input = new Scanner(System.in);
       System.out.print("Enter the number1 :");
       int num1 = input.nextInt();

        System.out.print("Enter the number2 :");
       int num2 = input.nextInt();

        System.out.print("Enter the number2 :");
       int num3 = input.nextInt();

       int max = (num1 >= num2 && num1 >= num3 ) ? num1 :((num2 >= num1 && num2 >= num3)? num2: num3);

       System.out.println("\nMax mumner is :"+ max);


        input.close();
    }
}
