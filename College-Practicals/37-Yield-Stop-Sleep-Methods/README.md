# 🧵 yield(), stop() & sleep() Methods

This Java program demonstrates the use of important thread control methods:
`yield()`, `stop()`, and `sleep()`.

## ⚙️ How It Works

1. Creates a custom `TaskThread` class by extending the `Thread` class.
2. Uses the `run()` method to perform repeated task execution.
3. Uses `sleep()` to pause the current thread for a specified time.
4. Uses `yield()` to give other threads an opportunity to execute.
5. Demonstrates `stop()` to terminate a running thread.
6. Creates and starts multiple threads to observe thread execution.
7. Displays the status of threads during execution.

## 📚 Concepts Used

- Thread Class
- `Thread` Creation
- `run()` Method
- `start()` Method
- `sleep()` Method
- `yield()` Method
- `stop()` Method
- Multiple Threads
- Thread Control
- `Scanner` Class
- User Input
- Console Output

## ⚠️ Note

The `stop()` method is deprecated in modern Java because it can terminate a thread in an unsafe state. It is included in this practical only to demonstrate the method required by the college syllabus.
