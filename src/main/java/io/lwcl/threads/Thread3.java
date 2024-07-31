package io.lwcl.threads;

public class Thread3 extends Thread {

    @Override
    public void run() {
        System.out.println();
        for (int i = 0; i < 10; i++) {
            System.out.println("H3 ("+ i +"): L");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}