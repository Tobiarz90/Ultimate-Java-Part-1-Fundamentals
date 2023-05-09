package com.bartosztobiasz;

public class Main {
    public static void main(String[] args) {
        int income = 120_000;

        // #1
//        String className;
//        if (income > 100_000) {
//            className = "First";
//        } else {
//            className = "Economy";
//        }
//        System.out.println(className);

        // #2
//        String className = "Economy";
//        if (income > 100_000) {
//            className = "First";
//        }
//        System.out.println(className);

        // #3
        // ternary operator; condition ? value1 : value2
        String className = income > 100_000 ? "First" : "Economy";
        System.out.println(className);
    }
}