# 📢 Multiple Interfaces

This folder contains Java programs demonstrating the use of **Interfaces** with multiple implementing classes.

## 📂 Programs

### 1. Notification System

The `Multiple-Interfaces.java` program defines a `Notification` interface with a common `sendNotification()` method.

Different classes implement the interface:

- `EmailNotification`
- `SMSNotification`
- `WhatsAppNotification`

Each class provides its own implementation of the `sendNotification()` method.

### 2. Media Player

The `InterfacePractice.java` program demonstrates interface implementation using a simple media player example.

The `MediaPlayer` interface defines a common `play()` method, which is implemented by:

- `AudioPlayer`
- `VideoPlayer`

The program also accepts audio and video file names from the user using the `Scanner` class.

## ⚙️ How It Works

1. Defines an interface with a common method.
2. Multiple classes implement the interface.
3. Each implementing class provides its own method implementation.
4. Objects of the implementing classes are created.
5. The required methods are called to perform their specific operations.

## 📚 Concepts Used

- Interface
- Interface Implementation
- Multiple Implementing Classes
- `implements` Keyword
- Method Overriding
- Classes & Objects
- Scanner Class
- User Input
- Polymorphism
- Console Output
