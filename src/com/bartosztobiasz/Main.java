package com.bartosztobiasz;

public class Main {
    public static void main(String[] args) {
        // for loop -> when you know how many times you want to execute statement/-s

        // i, j, k, ...
        // for (loop/counter variable; loop condition -> boolean expression; i++) { code block }
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello World " + i);
        }

        for (int i = 1; i <= 5; i++) {
            System.out.println("Hello World " + i);
        }

        for (int i = 5; i > 0; i--) {
            System.out.println("Hello World " + i);
        }
    }
}