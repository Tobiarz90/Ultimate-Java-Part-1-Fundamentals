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
        final byte MONTHS_IN_YEAR = 12;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Principal: ");
        int principal = scanner.nextInt();

        System.out.print("Annual Interest Rate [%]: ");
        float monthlyInterestRate = scanner.nextFloat() / MONTHS_IN_YEAR / 100;

        System.out.print("Period (Years): ");
        short period = (short) (scanner.nextByte() * MONTHS_IN_YEAR);

        double mortgage = principal *
                monthlyInterestRate * Math.pow(1 + monthlyInterestRate, period) /
                (Math.pow(1 + monthlyInterestRate, period) - 1);
        System.out.print("Mortgage: " + NumberFormat.getCurrencyInstance().format(mortgage));
    }
}
