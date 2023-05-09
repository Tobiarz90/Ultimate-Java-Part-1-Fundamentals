package com.bartosztobiasz;

public class Main {
    public static void main(String[] args) {
        // if statements allow making decisions based on certain conditions
        int temp = 32;

        // if (boolean expression/value) { code block }
        if (temp > 30) {
            // first section/clause
            System.out.println("It's a hot day");
            System.out.println("Drink water");
//        } else if (temp > 20 && temp <= 30) {
        } else if (temp > 20) {
            // second section/clause
            System.out.println("Beautiful day");
        } else {
            // third section/clause
            System.out.println("Cold day");
        }
    }
}