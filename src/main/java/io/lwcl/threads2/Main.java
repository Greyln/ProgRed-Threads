package io.lwcl.threads2;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        IncrementThread[] threads = new IncrementThread[5];

        for (int i = 0; i < threads.length; i++) {
            threads[i] = new IncrementThread(counter);
            threads[i].start();
        }

        for (IncrementThread thread : threads) {
            thread.join();
        }

        System.out.println("Valor final del contador " + counter.getValue());
    }
}
