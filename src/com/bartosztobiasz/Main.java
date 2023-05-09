package com.bartosztobiasz;

import java.text.NumberFormat;

public class Main {
    public static void main(String[] args) {
        String result;

        NumberFormat currency = NumberFormat.getCurrencyInstance(); // factory method
        result = currency.format(123456.789);
        System.out.println(result);

        // Refactor: Inline Variable
        result = NumberFormat.getPercentInstance().format(0.1); // method chaining
        System.out.println(result);
    }
}
