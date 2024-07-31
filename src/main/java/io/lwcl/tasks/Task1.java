package io.lwcl.tasks;

public class Task1 extends Thread {

    @Override
    public void run() {
        System.out.println();
        for (int i = 0; i < 5; i++) {
            System.out.println("Proceso 1: " + i);
        }
    }
}
