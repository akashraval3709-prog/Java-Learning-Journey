import java.util.Scanner;

public class SwitchStatementDemo {
      public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Grade (A/B/C/D/F): ");
        char grade = input.next().toUpperCase().charAt(0);
        switch (grade) {

            case 'A':
                System.out.println("Excellent!");
                break;

            case 'B':
                System.out.println("Very Good!");
                break;

            case 'C':
                System.out.println("Good!");
                break;

            case 'D':
                System.out.println("Pass!");
                break;

            case 'F':
                System.out.println("Fail!");
                break;

            default:
                System.out.println("Invalid Grade!");
        }

        input.close();
    }

}
