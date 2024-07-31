package io.lwcl.tasks;

public class Task2 implements Runnable {

    public void run() {
        System.out.println();
        for (int i = 0; i < 5; i++) {
            System.out.println("Proceso 2: " + i);
        }
    }
}
