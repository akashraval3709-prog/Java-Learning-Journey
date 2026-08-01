import java.util.Scanner;

class Shape {

    void calculateArea() {
        System.out.println("Area cannot be calculated.");
    }
}

class Circle extends Shape {

    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    void calculateArea() {
        double area = 3.14 * radius * radius;
        System.out.println("Area of Circle: " + area);
    }
}

public class ShapeArea {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Radius: ");
        double radius = input.nextDouble();

        Circle circle = new Circle(radius);

        circle.calculateArea();

        input.close();
    }
}
