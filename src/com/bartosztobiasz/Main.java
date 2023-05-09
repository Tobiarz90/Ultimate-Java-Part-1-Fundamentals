package com.bartosztobiasz;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // System.in -> read from a terminal

        System.out.print("Age: ");
        byte age = scanner.nextByte();
        System.out.println("You are " + age); // implicit casting

        System.out.print("Name: ");
        String name = scanner.next(); // reads one token (word)
        System.out.println("You are " + name);

        System.out.print("Full name: ");
        scanner.nextLine(); // !
        String fullName = scanner.nextLine().trim(); // method chaining
        System.out.println("You are " + fullName);
    }
}
