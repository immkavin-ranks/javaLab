package javaLab;

public class Multithreading implements Runnable {
    public static int counter = 0;

    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                increment();
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static synchronized void increment() {
        counter++;
    }

    public static void main(String[] args) {
        Multithreading o = new Multithreading();
        Thread[] threads = new Thread[5];

        for (int i = 0; i < 5; i++) {
            threads[i] = new Thread(o);
            threads[i].start();
        }

        for (Thread t : threads) {
            try {
                t.join();
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println("Final counter value: " + counter);
    }
}