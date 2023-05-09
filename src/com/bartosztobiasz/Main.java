package com.bartosztobiasz;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input;
        while (true) {
            System.out.print("Input: ");
            input = scanner.next().toLowerCase();

//            if (!input.equals("quit"))
//                System.out.println(input);

            if (input.equals("pass"))
                continue; // moves control to the beginning of the loop

            if (input.equals("quit"))
                break; // terminates the loop

            System.out.println(input);
        }
    }
}