# 🧵 Thread Priority

This Java program demonstrates the use of thread priorities using the `Thread` class.

Three threads are created with different priority levels: minimum, normal, and maximum priority.

## ⚙️ How It Works

1. Creates a `PriorityThread` class by extending the `Thread` class.
2. Uses the `run()` method to define the task performed by each thread.
3. Creates three thread objects.
4. Sets different priorities using `setPriority()`.
5. Uses `Thread.MIN_PRIORITY` for the low-priority thread.
6. Uses `Thread.NORM_PRIORITY` for the normal-priority thread.
7. Uses `Thread.MAX_PRIORITY` for the high-priority thread.
8. Displays the thread name, priority, and execution count.
9. Starts all threads using the `start()` method.

## 📚 Concepts Used

- Thread Class
- Multithreading
- Thread Priority
- `setPriority()`
- `getPriority()`
- `getName()`
- `Thread.MIN_PRIORITY`
- `Thread.NORM_PRIORITY`
- `Thread.MAX_PRIORITY`
- `run()` Method
- `start()` Method
- Console Output

## ⚠️ Note

Thread priority is only a suggestion to the thread scheduler. Therefore, the exact execution order of threads may vary depending on the JVM and operating system.
