package com.bartosztobiasz;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    // ideal method -> from 5 to 10 lines and no more than 20 lines

    /*
    1) Which lines of code always go together? / Which lines of code are conceptually very relevant?
    Here: years and numberOfPayments, monthlyInterestRate and annualInterestRate
     */
    /*

    2) Are there any repetitive patterns in the code?
    Here: while loops (asking questions)

    PATTERN:
    1. infinite loop
    2. ask a question
    3. read a value
    4. perform data validation
    5. invalid value => print error message
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int principal;
        while (true) {
            System.out.print("Principal [$1K - $1M]: ");
            principal = scanner.nextInt();
            if (principal >= 1_000 && principal < 1_000_000)
                break;
            System.out.println("Enter number between 1,000 and 1,000,000");
        }

        float annualInterestRate;
        while (true) {
            System.out.print("Annual Interest Rate [%]: ");
            // do not use magic names for your variables, always use meaningful and descriptive names
            annualInterestRate = scanner.nextFloat();
            if (annualInterestRate > 0 && annualInterestRate <= 30) break;
            System.out.println("Enter number between 1 and 30");
        }

        byte years;
        while (true) {
            System.out.print("Period (Years): ");
            years = scanner.nextByte();
            if (years > 0 && years <= 30) break;
            System.out.println("Enter number between 1 and 30");
        }

        double mortgage = calculateMortgage(principal, annualInterestRate, years);

        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.print("Mortgage: " + mortgageFormatted);
    }

    // logic for calculating mortgage in one place
    public static double calculateMortgage(
            int principal,
            float annualInterestRate,
            byte years) {
        // avoid magic numbers in your code, always use constants (final variables) to describe them
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;

        short numberOfPayments = (short) (years * MONTHS_IN_YEAR);
        float monthlyInterestRate = annualInterestRate / PERCENT / MONTHS_IN_YEAR;

        return principal
                * (monthlyInterestRate * Math.pow(1 + monthlyInterestRate, numberOfPayments))
                / (Math.pow(1 + monthlyInterestRate, numberOfPayments) - 1);
    }
}
