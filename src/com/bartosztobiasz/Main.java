package com.bartosztobiasz;

import java.text.NumberFormat;
import java.util.Scanner;

// calculate the remaining balance after every month payment
// https://www.mtgprofessor.com/formulas.htm
// B -> remaining balance
// L -> principal / amount of loan
// c -> monthly interest
// n -> total number of payments
// p -> remaining number of payments
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
        // avoid magic numbers in your code, always use constants (final variables) to describe them
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;

        int principal = (int) readNumber("Principal ($1K - $1M): ", 1_000, 1_000_000);
        float annualInterestRate = (float) readNumber("Annual Interest Rate: ", 1, 30);
        byte years = (byte) readNumber("Period (Years): ", 1, 30);

        short totalNumberOfPayments = (short) (years * MONTHS_IN_YEAR);
        float monthlyInterestRate = annualInterestRate / PERCENT / MONTHS_IN_YEAR;

        printMortgage(principal, totalNumberOfPayments, monthlyInterestRate);
        System.out.println();
        printPaymentSchedule(principal, totalNumberOfPayments, monthlyInterestRate);
    }

    private static void printMortgage(int principal, short totalNumberOfPayments, float monthlyInterestRate) {
        double mortgage = calculateMortgage(principal, monthlyInterestRate, totalNumberOfPayments);

        System.out.println("MORTGAGE");
        System.out.println("--------");
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Monthly Payments: " + mortgageFormatted);
    }

    private static void printPaymentSchedule(int principal, short totalNumberOfPayments, float monthlyInterestRate) {
        System.out.println("PAYMENT SCHEDULE");
        System.out.println("----------------");

        for (short remainingNumberOfPayments = 1; remainingNumberOfPayments <= totalNumberOfPayments; remainingNumberOfPayments++) {
            double remainingBalance = calculateRemainingBalance(principal, monthlyInterestRate, totalNumberOfPayments, remainingNumberOfPayments);
            String remainingBalanceFormatted = NumberFormat.getCurrencyInstance().format(remainingBalance);
            System.out.println(remainingBalanceFormatted);
        }
    }

    private static double calculateRemainingBalance(
            int principal,
            float monthlyInterestRate,
            short totalNumberOfPayments,
            short remainingNumberOfPayments) {

        return principal
                * (Math.pow(1 + monthlyInterestRate, totalNumberOfPayments)
                    - Math.pow(1 + monthlyInterestRate, remainingNumberOfPayments))
                / (Math.pow(1 + monthlyInterestRate, totalNumberOfPayments) - 1);
    }

    // every question = different type of value => use double as a return type
    public static double readNumber(String prompt, double min, double max) {
        Scanner scanner = new Scanner(System.in);

        double value; // generic value
        while (true) {
            System.out.print(prompt);
            value = scanner.nextFloat();
            if (value >= min && value <= max)
                break;
            System.out.println("Enter a value between " + min + " and " + max + ": "); // generic error message
        }

        return value;
    }

    // logic for calculating mortgage in one place
    public static double calculateMortgage(
            int principal,
            float monthlyInterestRate,
            short numberOfPayments) {

        return principal
                * (monthlyInterestRate * Math.pow(1 + monthlyInterestRate, numberOfPayments))
                / (Math.pow(1 + monthlyInterestRate, numberOfPayments) - 1);
    }
}
