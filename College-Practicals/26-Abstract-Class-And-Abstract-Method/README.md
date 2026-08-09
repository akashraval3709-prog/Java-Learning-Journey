# 👨‍💼 Abstract Class & Abstract Method

This Java practical demonstrates the implementation of an **abstract class** and **abstract method** using practical examples.

The folder contains two Java programs that demonstrate how an abstract class can define common structure and how child classes provide their own implementation of abstract methods.

## 📂 Programs

### 1. Employee Salary Example — `EmployeeSalary.java`

This program uses an abstract class for an employee salary calculation system.

### ⚙️ How It Works

1. Accepts employee name and basic salary from the user.
2. Creates a `FullTimeEmployee` object.
3. Displays employee details.
4. Implements the abstract salary calculation method in the child class.
5. Calculates and displays the net salary.

### 📚 Concepts Used

- Abstract Class
- Abstract Method
- Inheritance
- Method Overriding
- Constructor
- `super()` Keyword
- Classes & Objects
- Scanner Class
- User Input
- Console Output

### 🖥️ Sample Output

```text
Enter Employee Name : Akash
Enter Basic Salary : 30000

Employee Name : Akash
Basic Salary  : 30000.0
Net Salary    : 36000.0
2. Vehicle System Example — VehicleSystem.java

This program demonstrates abstraction using a vehicle system. A common abstract vehicle structure is created, and the child class provides its own implementation of the abstract method.

⚙️ How It Works
Defines a common structure using an abstract class.
Declares an abstract method for vehicle operation.
Extends the abstract class using a child class.
Overrides the abstract method in the child class.
Creates an object and executes the implemented method.
📚 Concepts Used
Abstract Class
Abstract Method
Inheritance
Method Overriding
Classes & Objects
Abstraction
Console Output
🗂️ Program Structure
26-Abstract-Class-And-Abstract-Method/
│
├── EmployeeSalary.java
├── VehicleSystem.java
└── README.md
🎯 Learning Objective

The purpose of this practical is to understand how abstract classes and abstract methods are used to provide a common design while allowing child classes to implement specific behavior.

⭐ This practical is part of my Java Learning Journey and covers an important OOP concept — Abstraction.


### Commit message

For README update:

```text
docs: update README for abstract class examples

Optional extended description:

Updated the README for the Abstract Class and Abstract Method practical.

- Documented EmployeeSalary.java
- Documented VehicleSystem.java
- Added program workflow and concepts used
- Added project structure and learning objective
