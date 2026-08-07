# 📢 Multiple Interfaces

This Java program demonstrates the use of an **Interface** with multiple implementing classes. The `Notification` interface defines a common `sendNotification()` method, which is implemented by Email, SMS, and WhatsApp notification classes.

## ⚙️ How It Works

1. Creates a `Notification` interface with the `sendNotification()` method.
2. `EmailNotification` implements the interface for Email notifications.
3. `SMSNotification` implements the interface for SMS notifications.
4. `WhatsAppNotification` implements the interface for WhatsApp notifications.
5. Each class provides its own implementation of `sendNotification()`.
6. The main method creates objects of all three classes and sends notifications.

## 📚 Concepts Used

- Interface
- Multiple Implementing Classes
- Method Overriding
- Classes & Objects
- `implements` Keyword
- Console Output
