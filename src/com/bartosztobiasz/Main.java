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

        System.out.print("Principal: ");
        int principal = scanner.nextInt();

        System.out.print("Annual Interest Rate [%]: ");
        // do not use magic names for your variables, always use meaningful and descriptive names
        float annualInterestRate = scanner.nextFloat();
        float monthlyInterestRate = annualInterestRate / MONTHS_IN_YEAR / PERCENT;

        System.out.print("Period (Years): ");
        byte years = scanner.nextByte();
        short numberOfPayments = (short) (years * MONTHS_IN_YEAR);

        double mortgage = principal
                * (monthlyInterestRate * Math.pow(1 + monthlyInterestRate, numberOfPayments))
                / (Math.pow(1 + monthlyInterestRate, numberOfPayments) - 1);

        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.print("Mortgage: " + mortgageFormatted);
    }
}
