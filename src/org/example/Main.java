package org.example;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("Hello and welcome!");

        for (int i = 1; i <= 15; i++) {
            System.out.println("Hello and welcome!");

            // wait for 2 seconds (2000 milliseconds)
            Thread.sleep(2000);
        }
    }
}