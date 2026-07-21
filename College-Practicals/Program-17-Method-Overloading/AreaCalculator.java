import java.util.Scanner;

class AreaCalculator {

```
static int area(int side) {
    return side * side;
}

static int area(int length, int width) {
    return length * width;
}

static double area(double radius) {
    return 3.14 * radius * radius;
}

public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.print("Enter Side of Square : ");
    int side = sc.nextInt();

    System.out.print("Enter Length : ");
    int length = sc.nextInt();

    System.out.print("Enter Width : ");
    int width = sc.nextInt();

    System.out.print("Enter Radius : ");
    double radius = sc.nextDouble();

    System.out.println("\nArea of Square : " + area(side));
    System.out.println("Area of Rectangle : " + area(length, width));
    System.out.println("Area of Circle : " + area(radius));

    sc.close();
}
```

} aa college

17. Write a java program which shows the use of Methods Overloading. readem ap ane msg
