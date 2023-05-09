package com.bartosztobiasz;

import java.text.NumberFormat;
import java.util.Scanner;

// ang. mortgage /morgydż/ -> pol. hipoteka, obciążyć hipotekę
// https://www.wikihow.com/Calculate-Mortgage-Payments
// Math.pow()
// principal -> amount of loan (pol. pożyczka)
// ang. interest rate -> pol. stopa procentowa
public class Main {
    public static void main(String[] args) {
        // avoid magic numbers in your code, always use constants (final variables) to describe them
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;

        Scanner scanner = new Scanner(System.in);

        int principal;
        while (true) {
            System.out.print("Principal [$1K - $1M]: ");
            principal = scanner.nextInt();
            if (principal >= 1_000 && principal < 1_000_000)
                break;
            System.out.println("Enter number between 1,000 and 1,000,000");
        }

        float monthlyInterestRate;
        while (true) {
            System.out.print("Annual Interest Rate [%]: ");
            // do not use magic names for your variables, always use meaningful and descriptive names
            float annualInterestRate = scanner.nextFloat();
            if (annualInterestRate > 0 && annualInterestRate <= 30) {
                monthlyInterestRate = annualInterestRate / MONTHS_IN_YEAR / PERCENT;
                break;
            }
            System.out.println("Enter number between 1 and 30");
        }

        short numberOfPayments;
        while (true) {
            System.out.print("Period (Years): ");
            byte years = scanner.nextByte();
            if (years > 0 && years <= 30) {
                numberOfPayments = (short) (years * MONTHS_IN_YEAR);
                break;
            }
            System.out.println("Enter number between 1 and 30");
        }

        double mortgage = principal
                * (monthlyInterestRate * Math.pow(1 + monthlyInterestRate, numberOfPayments))
                / (Math.pow(1 + monthlyInterestRate, numberOfPayments) - 1);

        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.print("Mortgage: " + mortgageFormatted);
    }
}
