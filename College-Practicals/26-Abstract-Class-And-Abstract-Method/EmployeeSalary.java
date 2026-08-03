import java.util.Scanner;

abstract class Employee {

    String name;
    double basicSalary;

    Employee(String name, double basicSalary) {
        this.name = name;
        this.basicSalary = basicSalary;
    }

    abstract double calculateSalary();

    void displayEmployee() {
        System.out.println("\nEmployee Name : " + name);
        System.out.println("Basic Salary  : " + basicSalary);
    }
}

class FullTimeEmployee extends Employee {

    FullTimeEmployee(String name, double basicSalary) {
        super(name, basicSalary);
    }

    @Override
    double calculateSalary() {
        return basicSalary + (basicSalary * 0.20);
    }
}

public class EmployeeSalary {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Employee Name : ");
        String name = input.nextLine();

        System.out.print("Enter Basic Salary : ");
        double salary = input.nextDouble();

        FullTimeEmployee employee = new FullTimeEmployee(name, salary);

        employee.displayEmployee();
        System.out.println("Net Salary    : " + employee.calculateSalary());

        input.close();
    }
}
