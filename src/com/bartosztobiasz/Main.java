package com.bartosztobiasz;

import java.text.NumberFormat;
import java.util.Scanner;

// calculate the remaining balance after every month payment
// https://www.mtgprofessor.com/formulas.htm
// B -> remaining balance
// L -> principal / amount of loan
// c -> monthly interest
// n -> total number of payments
// p -> number of payments made
public class Main {
    // avoid magic numbers in your code, always use constants (final variables) to describe them
    // class level variable -> class field
    // static methods can only access static variables
    final static byte MONTHS_IN_YEAR = 12;
    final static byte PERCENT = 100;

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
        int principal = (int) readNumber("Principal ($1K - $1M): ", 1_000, 1_000_000);
        float annualInterestRate = (float) readNumber("Annual Interest Rate: ", 1, 30);
        byte years = (byte) readNumber("Period (Years): ", 1, 30);

        System.out.println();
        printMortgage(principal, annualInterestRate, years);

        System.out.println();
        printPaymentSchedule(principal, annualInterestRate, years);
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

    private static void printMortgage(int principal, float annualInterestRate, byte years) {
        double mortgage = calculateMortgage(principal, annualInterestRate, years);

        System.out.println("MORTGAGE");
        System.out.println("--------");
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Monthly Payments: " + mortgageFormatted);
    }

    private static void printPaymentSchedule(int principal, float annualInterestRate, byte years) {
        System.out.println("PAYMENT SCHEDULE");
        System.out.println("----------------");

        for (short numberOfPaymentsMade = 1; numberOfPaymentsMade <= years * MONTHS_IN_YEAR; numberOfPaymentsMade++) {
            double remainingBalance = calculateRemainingBalance(principal, annualInterestRate, years, numberOfPaymentsMade);
            String remainingBalanceFormatted = NumberFormat.getCurrencyInstance().format(remainingBalance);
            System.out.println(remainingBalanceFormatted);
        }
    }

    private static double calculateRemainingBalance(
            int principal,
            float annualInterestRate,
            byte years,
            short numberOfPaymentsMade) {

        short totalNumberOfPayments = (short) (years * MONTHS_IN_YEAR);
        float monthlyInterestRate = annualInterestRate / PERCENT / MONTHS_IN_YEAR;

        return principal
                * (Math.pow(1 + monthlyInterestRate, totalNumberOfPayments)
                - Math.pow(1 + monthlyInterestRate, numberOfPaymentsMade))
                / (Math.pow(1 + monthlyInterestRate, totalNumberOfPayments) - 1);
    }

    // logic for calculating mortgage in one place
    public static double calculateMortgage(
            int principal,
            float annualInterestRate,
            byte years) {

        /*
        These two lines are duplicated once.
        A better solution would be to move this logic to the main method,
        but to remain this method reusable in other projects, you shouldn't use this solution.
         */
        short numberOfPayments = (short) (years * MONTHS_IN_YEAR);
        float monthlyInterestRate = annualInterestRate / PERCENT / MONTHS_IN_YEAR;

        return principal
                * (monthlyInterestRate * Math.pow(1 + monthlyInterestRate, numberOfPayments))
                / (Math.pow(1 + monthlyInterestRate, numberOfPayments) - 1);
    }
}
