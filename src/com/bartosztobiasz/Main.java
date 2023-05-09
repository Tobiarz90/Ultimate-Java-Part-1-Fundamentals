package com.bartosztobiasz;

public class Main {
    public static void main(String[] args) {
        int income = 120_000;

        // #1
//        boolean hasHighIncome;
//        if (income > 100_000) {
//            hasHighIncome = true;
//        } else {
//            hasHighIncome = false;
//        }
//        System.out.println(hasHighIncome);

        // #2
//        boolean hasHighIncome = false;
//        if (income > 100_000) {
//            hasHighIncome = true;
//        }
//        System.out.println(hasHighIncome);

        // #3
        boolean hasHighIncome = (income > 100_000);
        System.out.println(hasHighIncome);
    }
}