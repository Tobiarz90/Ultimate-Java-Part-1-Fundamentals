package com.bartosztobiasz;

public class Main {
    public static void main(String[] args) {
        // for each -> iterates over an array or a collections

        String[] fruits = {"Apple", "Mango", "Orange"};

        for (int i = 0; i < fruits.length; i++) {
            System.out.println(fruits[i]);
        }

        // for (loop variable : array or collection) { code block }
        // for each loop is FORWARD only
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        for (int i = fruits.length - 1; i >= 0; i--) {
            System.out.println(fruits[i]);
        }
    }
}