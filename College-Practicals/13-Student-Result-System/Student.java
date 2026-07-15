// Program to Create Student Class and Generate Result

import java.util.Scanner;

public class Student {
    
    // Variables
    private String name;
    private int roll;
    private double math;
    private double english;
    private double science;
    private double hindi;
    private double total;
    private double percentage;
    private String grade;
    
    // Constructor
    public Student(String name, int roll, double math, double english, 
                   double science, double hindi) {
        this.name = name;
        this.roll = roll;
        this.math = math;
        this.english = english;
        this.science = science;
        this.hindi = hindi;
    }
    
    // Method to calculate total marks
    public void calculateTotal() {
        total = math + english + science + hindi;
    }
    
    // Method to calculate percentage
    public void calculatePercentage() {
        percentage = (total / 400) * 100;  // Total marks = 400 (100 each subject)
    }
    
    // Method to calculate grade
    public void calculateGrade() {
        if (percentage >= 90) {
            grade = "A+";
        } else if (percentage >= 80) {
            grade = "A";
        } else if (percentage >= 70) {
            grade = "B";
        } else if (percentage >= 60) {
            grade = "C";
        } else if (percentage >= 50) {
            grade = "D";
        } else {
            grade = "F";
        }
    }
    
    // Method to generate result
    public void generateResult() {
        calculateTotal();
        calculatePercentage();
        calculateGrade();
        
        System.out.println("\n-------------- STUDENT RESULT ----------------");
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + roll);
        System.out.println("\nMarks:");
        System.out.println("  Mathematics: " + math);
        System.out.println("  English: " + english);
        System.out.println("  Science: " + science);
        System.out.println("  Hindi: " + hindi);
        System.out.println("\nTotal Marks: " + total);
        System.out.println("Percentage: " + String.format("%.2f", percentage) + "%");
        System.out.println("Grade: " + grade);
        System.out.println("-----------------------------------------------------------------\n");
    }
    

   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("--- Student Result Program ---");
        
        System.out.print("Enter the number of students: ");
        int count = scanner.nextInt();
        scanner.nextLine(); 
        
        for (int i = 0; i < count; i++) {
            System.out.println("\nEnter details for Student " + (i + 1) + ":");
            
            System.out.print("Name: ");
            String name = scanner.nextLine();
            
            System.out.print("Roll Number: ");
            int rollNo = scanner.nextInt();
            
            System.out.print("Mark 1: ");
            int m1 = scanner.nextInt();
            
            System.out.print("Mark 2: ");
            int m2 = scanner.nextInt();
            
            System.out.print("Mark 3: ");
            int m3 = scanner.nextInt();
            
            System.out.print("Mark 4: ");
            int m4 = scanner.nextInt();
            scanner.nextLine(); 
            
            Student student = new Student(name, rollNo, m1, m2, m3, m4);
            
            System.out.println("\nResult:");
            student.generateResult();
        }
        
        scanner.close();
    }
}
