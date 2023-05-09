package com.bartosztobiasz;

public class Main {
    public static void main(String[] args) {
        // postfix -> increment operator after variable
        int x = 1;
        // 1. copy x value to y
        // 2. increment x
        int y = x++;
        System.out.println(x); // x = 2
        System.out.println(y); // y = 1
    }
}
