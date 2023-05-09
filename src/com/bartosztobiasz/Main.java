package com.bartosztobiasz;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // while loop => when you DON'T know how many times you want to execute statement/-s

        int i = 1;
        // while (loop condition -> boolean expression) { code block }
        while (i <= 5) {
            System.out.println("Hello World " + i);
            i++;
        }

        int j = 5;
        while (j > 0) {
            System.out.println("Hello World " + j);
            j--;
        }

        Scanner scanner = new Scanner(System.in);

        String input = "";
        // comparison operators compare the address of a string object, not its value
        while (!input.equals("quit")) {
            System.out.print("Input: ");
            input = scanner.next().toLowerCase();
            System.out.println(input);
        }
    }
}