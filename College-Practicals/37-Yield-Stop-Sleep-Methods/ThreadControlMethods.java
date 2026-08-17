class WorkerThread extends Thread {

    private String threadName;

    WorkerThread(String threadName) {
        this.threadName = threadName;
    }

    @Override
    public void run() {

        for (int i = 1; i <= 10; i++) {

            System.out.println(threadName + " - Count: " + i);

            if (i == 3) {
                System.out.println(threadName
                        + " is calling yield()...");
                Thread.yield();
            }

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(threadName + " interrupted.");
                return;
            }
        }

        System.out.println(threadName + " completed.");
    }
}

public class ThreadControlMethods {

    public static void main(String[] args) {

        WorkerThread worker1 = new WorkerThread("Worker-1");
        WorkerThread worker2 = new WorkerThread("Worker-2");

        System.out.println("Starting Worker Threads...\n");

        worker1.start();
        worker2.start();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println("Main Thread Interrupted.");
        }

        System.out.println("\nMain Thread woke up after sleep().");

        if (worker2.isAlive()) {
            System.out.println("Stopping Worker-2 using stop()...");
            worker2.stop();
        }

        try {
            worker1.join();
            worker2.join();
        } catch (InterruptedException e) {
            System.out.println("Main Thread Interrupted.");
        }

        System.out.println("\nWorker Threads execution completed.");
    }
}
