import java.util.Scanner;
public class AreaOfCircle{
    public static void main(String []args)
    {
        final float PI = 3.14F;
        Scanner input = new Scanner(System.in);
         System.out.print("Enter the number :");
        int r = input.nextInt();

         float area = PI * r * r;

         System.out.println("Area of circle : "+ area);
        input.close();
    }

}
