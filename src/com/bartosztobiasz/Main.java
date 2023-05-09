package com.bartosztobiasz;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Number: ");
        int number = scanner.nextInt();

        // % -> modulus operator returns the remainder (pol. reszta) of the division

        // the most specific condition on the top
        if (number % 5 == 0 && number % 3 == 0)
            System.out.println("FizzBuzz");
        else if (number % 5 == 0)
            System.out.println("Fizz");
        // the most generic condition on the bottom
        else if (number % 3 == 0)
            System.out.println("Buzz");
        else
            System.out.println(number);

        // avoid nested structure in your code
        if (number % 5 == 0) {
            if (number % 3 == 0)
                System.out.println("FizzBuzz");
            else
                System.out.println("Fizz");
        } else if (number % 3 == 0)
            System.out.println("Buzz");
        else
            System.out.println(number);
    }
}