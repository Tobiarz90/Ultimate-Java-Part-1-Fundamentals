package com.bartosztobiasz;

class Main {
    public static void main(String[] args) {
        System.out.println("Start");
        printNumbers(4);
        System.out.println("Finish");
    }

    private static void printNumbers(int limit) {
//        for (int i = 0; i < limit; i += 2) {
        for (int i = 0; i <= limit; i++) {
            System.out.println(i);
        }
    }
}