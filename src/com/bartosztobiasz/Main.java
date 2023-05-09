package com.bartosztobiasz;

public class Main {
    public static void main(String[] args) {
        double result_ = Math.random(); // from 0 to 1
        System.out.println(result_);

        int result;

        result = (int) Math.round(Math.random() * 100);
        System.out.println(result);

        result = (int) (Math.random() * 100);
        System.out.println(result);
    }
}
