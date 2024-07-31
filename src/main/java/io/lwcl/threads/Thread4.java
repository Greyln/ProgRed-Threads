package io.lwcl.threads;

public class Thread4 extends Thread {

    @Override
    public void run() {
        System.out.println();
        for (int i = 0; i < 10; i++) {
            System.out.println("H4 ("+ i +"): A");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}