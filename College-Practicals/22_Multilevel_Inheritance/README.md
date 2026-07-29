# Multilevel Inheritance in Java

## 📚 Concept
This program explains the concept of **Multilevel Inheritance** in Java.

Multilevel Inheritance means a class inherits from another class, and a third class inherits from the second class.

### Inheritance Flow:

Device → Computer → Laptop

- Device is the Parent Class
- Computer inherits Device
- Laptop inherits Computer

## 🏗️ Class Description

### Device Class
- Stores basic device information like brand name.
- Contains method to display device details.

### Computer Class
- Inherits Device class.
- Adds computer-specific information like RAM size.

### Laptop Class
- Inherits Computer class.
- Adds laptop-specific information like battery backup.
- Displays all details using inherited methods.

## 🔑 Concepts Used

- Multilevel Inheritance
- extends Keyword
- super() Constructor
- Constructor Chaining
- Method Reusability
- Object Creation

## 💻 Output Example
Enter Brand Name: Dell
Enter RAM (in GB): 16
Enter Battery Backup (in Hours): 8.5

--- 💻 Laptop Product Specifications ---
Brand : Dell
RAM Size : 16 GB
Battery Backup: 8.5 Hours


## 📌 Learning Outcome

After completing this program, we understand how Java supports multilevel inheritance by creating a hierarchy of classes and reusing properties and methods from parent classes.
