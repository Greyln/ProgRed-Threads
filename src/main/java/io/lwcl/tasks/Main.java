package io.lwcl.tasks;

public class Main {

    public static void main(String[] args) {
        Task1 thread1s = new Task1();
        Thread thread2 = new Thread(new Task2());

        thread1s.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        thread2.start();
    }
}