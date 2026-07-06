import java.util.Scanner;

public class LargestOfTwoNumbers {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number :");  
        int num1 = input.nextInt();
        System.out.print("Enter the number :");  
        int num2 = input.nextInt();

        if (num1 >= num2) {
            System.out.println("Number is max :" + num1);
        } else {
            System.out.println("Number is max :" + num2);
        }
        input.close();
    }
}
