class PriorityThread extends Thread {

    public PriorityThread(String name) {
        super(name);
    }

    @Override
    public void run() {

        for (int i = 1; i <= 5; i++) {

            System.out.println(
                "Thread: " + getName()
                + " | Priority: " + getPriority()
                + " | Count: " + i
            );
        }
    }
}

public class ThreadPriorityDemo {

    public static void main(String[] args) {

        PriorityThread lowPriority =
                new PriorityThread("Low Priority Thread");

        PriorityThread normalPriority =
                new PriorityThread("Normal Priority Thread");

        PriorityThread highPriority =
                new PriorityThread("High Priority Thread");


        lowPriority.setPriority(Thread.MIN_PRIORITY);

        normalPriority.setPriority(Thread.NORM_PRIORITY);

        highPriority.setPriority(Thread.MAX_PRIORITY);


        System.out.println("Starting Threads...\n");


        lowPriority.start();
        normalPriority.start();
        highPriority.start();
    }
}
