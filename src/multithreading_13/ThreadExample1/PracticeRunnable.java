package multithreading_13.ThreadExample1;

public class PracticeRunnable {
    static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            System.out.println("1");
        });
        Thread thread2 = new Thread(() -> {
            System.out.println("2");
        });

        thread1.start();
        thread2.start();
    }
}
