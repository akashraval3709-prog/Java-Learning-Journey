import java.util.Scanner;

public class Employee {

    private String name;
    private int empId;
    private double salary;

    // Parameterized Constructor
    Employee(String name, int empId, double salary) {
        this.name = name;
        this.empId = empId;
        this.salary = salary;
    }

    // Method to display employee details
    void displayEmployeeInfo() {
        System.out.println("\n========== Employee Details ==========");
        System.out.println("Name      : " + name);
        System.out.println("Employee ID : " + empId);
        System.out.println("Salary    : ₹" + salary);
        System.out.println("======================================");
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("--- Parameterized Constructor Demo ---");

        System.out.print("Enter Employee Name: ");
        String name = input.nextLine();

        System.out.print("Enter Employee ID: ");
        int id = input.nextInt();

        System.out.print("Enter Salary: ");
        double salary = input.nextDouble();

        Employee employee = new Employee(name, id, salary);

        employee.displayEmployeeInfo();

        input.close();
    }
}
