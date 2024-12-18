class MessageThread extends Thread {
    private String message;
    private int interval;

    public MessageThread(String message, int interval) {
        this.message = message;
        this.interval = interval;
    }

    public void run() {
        try {
            while (true) {
                System.out.println(message);
                Thread.sleep(interval);
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

public class MultiThreadExample {
    public static void main(String[] args) {
        // Create two threads with different messages and intervals
        MessageThread thread1 = new MessageThread("BMS College of Engineering", 10000); // 10 seconds
        MessageThread thread2 = new MessageThread("CSE", 2000); // 2 seconds

        // Start both threads
        thread1.start();
        thread2.start();

        // Print the tag
        System.out.print("UTKRISHT UMANG\n1BM23ET056");
    }
}
