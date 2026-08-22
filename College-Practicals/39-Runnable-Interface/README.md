# 🔄 Runnable Interface

This Java program demonstrates how to create and execute threads using the `Runnable` interface.

The program simulates downloading two files simultaneously using separate threads.

## ⚙️ How It Works

1. Creates a `DownloadTask` class that implements the `Runnable` interface.
2. Defines the task inside the `run()` method.
3. Accepts two file names from the user.
4. Creates two `DownloadTask` objects.
5. Passes each task object to a `Thread` object.
6. Starts both threads using the `start()` method.
7. Displays the download progress for each file.
8. Uses `sleep()` to simulate download delay.
9. Uses `join()` to wait until both download threads complete.
10. Displays a completion message after all downloads finish.

## 📚 Concepts Used

- Runnable Interface
- `implements` Keyword
- Thread Class
- `run()` Method
- `start()` Method
- `sleep()` Method
- `join()` Method
- Multiple Threads
- Multithreading
- Method Overriding
- Constructor
- Scanner Class
- User Input
- Console Output
