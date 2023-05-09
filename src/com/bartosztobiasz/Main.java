package com.bartosztobiasz;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // do { code block } while (loop condition -> boolean expression);
        // do..while loop is executed AT LEAST ONCE

        Scanner scanner = new Scanner(System.in);

        String input;
        do {
            System.out.print("Input: ");
            input = scanner.next().toLowerCase();
            System.out.println(input);
        } while (!input.equals("quit"));
    }
}