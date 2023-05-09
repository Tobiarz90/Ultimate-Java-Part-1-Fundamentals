package com.bartosztobiasz;

public class Main {
    public static void main(String[] args) {
        // prefix -> increment operator before variable
        int x = 1;
        // 1. increment x
        // 2. copy x value to y
        int y = ++x;
        System.out.println(x); // x = 2
        System.out.println(y); // y = 2
    }
}
