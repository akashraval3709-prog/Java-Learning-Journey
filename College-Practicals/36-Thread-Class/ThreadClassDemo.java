import java.util.Scanner;

class NumberThread extends Thread {

    private int limit;

    NumberThread(int limit) {
        this.limit = limit;
    }

    @Override
    public void run() {

        System.out.println("\n--- Number Thread Started ---");

        for (int i = 1; i <= limit; i++) {
            System.out.println("Number Thread: " + i);

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Number Thread Interrupted.");
            }
        }

        System.out.println("Number Thread Finished.");
    }
}

class MessageThread extends Thread {

    private String message;

    MessageThread(String message) {
        this.message = message;
    }

    @Override
    public void run() {

        System.out.println("\n--- Message Thread Started ---");

        for (int i = 1; i <= 5; i++) {
            System.out.println("Message Thread: " + message);

            try {
                Thread.sleep(700);
            } catch (InterruptedException e) {
                System.out.println("Message Thread Interrupted.");
            }
        }

        System.out.println("Message Thread Finished.");
    }
}

public class ThreadClassDemo {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number limit: ");
        int limit = input.nextInt();
        input.nextLine();

        System.out.print("Enter message: ");
        String message = input.nextLine();

        NumberThread numberThread = new NumberThread(limit);
        MessageThread messageThread = new MessageThread(message);

        System.out.println("\nStarting Threads...");

        numberThread.start();
        messageThread.start();

        try {
            numberThread.join();
            messageThread.join();
        } catch (InterruptedException e) {
            System.out.println("Main Thread Interrupted.");
        }

        System.out.println("\nAll Threads Completed.");

        input.close();
    }
}
