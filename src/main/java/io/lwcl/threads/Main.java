package io.lwcl.threads;

import io.lwcl.tasks.Task1;
import io.lwcl.tasks.Task2;

public class Main {

    public static void main(String[] args) {
        Thread1 thread1 = new Thread1();
        Thread2 thread2 = new Thread2();
        Thread3 thread3 = new Thread3();
        Thread4 thread4 = new Thread4();

        System.out.println("patata!");

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
    }
}
