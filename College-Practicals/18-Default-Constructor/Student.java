public class Student {

    private String name;
    private int rollNo;
    private String course;

    // Default Constructor
    Student() {
        name = "Akash Raval";
        rollNo = 101;
        course = "BCA";
    }

    // Method to display student details
    void displayStudentInfo() {
        System.out.println("\n========== Student Details ==========");
        System.out.println("Name      : " + name);
        System.out.println("Roll No   : " + rollNo);
        System.out.println("Course    : " + course);
        System.out.println("=====================================");
    }

    public static void main(String[] args) {

        System.out.println("--- Default Constructor Demo ---");

        // Constructor is automatically called
        Student student = new Student();

        student.displayStudentInfo();
    }
}
