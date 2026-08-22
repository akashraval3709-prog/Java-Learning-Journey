import java.util.Scanner;

class DownloadTask implements Runnable {

    private String fileName;

    public DownloadTask(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void run() {

        System.out.println("\nDownload Started: " + fileName);

        for (int i = 20; i <= 100; i += 20) {

            System.out.println(
                fileName + " Download Progress: " + i + "%"
            );

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(
                    fileName + " Download Interrupted."
                );
            }
        }

        System.out.println(fileName + " Download Completed.");
    }
}

public class RunnableInterfaceDemo {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter first file name: ");
        String file1 = input.nextLine();

        System.out.print("Enter second file name: ");
        String file2 = input.nextLine();


        DownloadTask task1 = new DownloadTask(file1);
        DownloadTask task2 = new DownloadTask(file2);


        Thread thread1 = new Thread(task1);
        Thread thread2 = new Thread(task2);


        System.out.println("\nStarting Downloads...");

        thread1.start();
        thread2.start();


        try {

            thread1.join();
            thread2.join();

        } catch (InterruptedException e) {

            System.out.println("Main Thread Interrupted.");
        }


        System.out.println("\nAll Downloads Completed.");

        input.close();
    }
}
