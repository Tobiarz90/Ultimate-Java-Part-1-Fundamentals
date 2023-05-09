package com.bartosztobiasz;

public class Main {
    public static void main(String[] args) {
        byte x = 1;
        byte y = x; // 1
        x = 2; // y is not affected => x and y are completely independent of each other
        System.out.println(y);
    }
}
