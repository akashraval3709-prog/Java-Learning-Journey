import java.util.Scanner;

abstract class Vehicle {

    String vehicleName;

    Vehicle(String vehicleName) {
        this.vehicleName = vehicleName;
    }

    abstract void start();

    void displayVehicle() {
        System.out.println("Vehicle: " + vehicleName);
    }
}

class Car extends Vehicle {

    Car(String vehicleName) {
        super(vehicleName);
    }

    @Override
    void start() {
        System.out.println(vehicleName + " starts with a key.");
    }
}

public class VehicleSystem {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter vehicle name: ");
        String name = input.nextLine();

        Car car = new Car(name);

        car.displayVehicle();
        car.start();

        input.close();
    }
}
