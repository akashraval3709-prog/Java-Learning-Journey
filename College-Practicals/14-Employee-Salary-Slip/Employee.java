import java.util.Scanner;

public class Employee {
    
    private String name;
    private int empId;
    private String department;
    private double basicSalary;
    private double dearness;      
    private double houseRent;     
    private double medical;       
    private double provident;     
    private double tax;           
    
    public Employee(String name, int empId, String department, double basicSalary) {
        this.name = name;
        this.empId = empId;
        this.department = department;
        this.basicSalary = basicSalary;
    }
    
    public void calculateAllowances() {
        dearness = basicSalary * 0.10;      
        houseRent = basicSalary * 0.05;     
        medical = basicSalary * 0.03;       
    }
    
    public void calculateDeductions() {
        provident = basicSalary * 0.12;     
        tax = basicSalary * 0.05;           
    }
    
    public double calculateGrossSalary() {
        return basicSalary + dearness + houseRent + medical;
    }
    
    public double calculateNetSalary() {
        return calculateGrossSalary() - provident - tax;
    }
    
    public void generateSalarySlip() {
        calculateAllowances();
        calculateDeductions();
        
        double grossSalary = calculateGrossSalary();
        double netSalary = calculateNetSalary();
        
        System.out.println("\n========================================");
        System.out.println("              SALARY SLIP               ");
        System.out.println("========================================");
        System.out.println("Employee Name : " + name);
        System.out.println("Employee ID   : " + empId);
        System.out.println("Department    : " + department);
        System.out.println("----------------------------------------");
        
        System.out.println("EARNINGS:");
        System.out.println("  Basic Salary      : Rs. " + String.format("%.2f", basicSalary));
        System.out.println("  Dearness Allow.   : Rs. " + String.format("%.2f", dearness));
        System.out.println("  House Rent Allow. : Rs. " + String.format("%.2f", houseRent));
        System.out.println("  Medical Allow.    : Rs. " + String.format("%.2f", medical));
        System.out.println("  Gross Salary      : Rs. " + String.format("%.2f", grossSalary));
        System.out.println("----------------------------------------");
        
        System.out.println("DEDUCTIONS:");
        System.out.println("  Provident Fund    : Rs. " + String.format("%.2f", provident));
        System.out.println("  Tax               : Rs. " + String.format("%.2f", tax));
        System.out.println("  Total Deductions  : Rs. " + String.format("%.2f", (provident + tax)));
        System.out.println("----------------------------------------");
        
        System.out.println("NET SALARY          : Rs. " + String.format("%.2f", netSalary));
        System.out.println("========================================\n");
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("--- Employee Salary Slip Program ---");
        
        System.out.print("Enter the number of employees: ");
        int count = scanner.nextInt();
        scanner.nextLine(); 
        
        for (int i = 0; i < count; i++) {
            System.out.println("\nEnter details for Employee " + (i + 1) + ":");
            
            System.out.print("Name: ");
            String name = scanner.nextLine();
            
            System.out.print("Employee ID: ");
            int empId = scanner.nextInt();
            scanner.nextLine(); 
            
            System.out.print("Department: ");
            String department = scanner.nextLine();
            
            System.out.print("Basic Salary: ");
            double basicSalary = scanner.nextDouble();
            scanner.nextLine(); 
            
            Employee emp = new Employee(name, empId, department, basicSalary);
            emp.generateSalarySlip();
        }
        
        scanner.close();
    }
}
