package com.bartosztobiasz;

public class Main {
    public static void main(String[] args) {
        int result;

        result = Math.round(1.1F);
        System.out.println(result);

        // 1.1 => 2; zaokrąglenie w górę (sufit)
        result = (int) Math.ceil(1.1F); // ang. ceiling  -> pol. sufit
        System.out.println(result);

        // 1.1 => 1; zaokrąglenie w dół (podłoga)
        result = (int) Math.floor(1.1F); // ang. floor  -> pol. podłoga
        System.out.println(result);

        result = Math.max(1, 2); // which one is greater?
        System.out.println(result);

        result = Math.min(1, 2); // which one is smaller?
        System.out.println(result);
    }
}
