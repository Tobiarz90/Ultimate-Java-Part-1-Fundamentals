package com.bartosztobiasz;

public class Main {
    public static void main(String[] args) {
        String x = "1";

        // every primitive type has a reference type wrapper
        // Integer -> wrapper for int
        int y = Integer.parseInt(x) + 2; // 1 + 2

        System.out.println(y);
    }
}
