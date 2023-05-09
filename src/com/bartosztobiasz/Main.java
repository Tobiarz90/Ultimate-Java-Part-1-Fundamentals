package com.bartosztobiasz;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Arrays are reference types
        // Arrays have a fixed size/length

        // older syntax
//        int[] numbers = new int[5];
//        numbers[0] = 1;
//        numbers[1] = 2;
//        numbers[10] = 3; // Exception here

        // newer syntax
        int[] numbers = {2, 3, 5, 1, 4};

        System.out.println(numbers);

        System.out.println(numbers.length);

        Arrays.sort(numbers);

        // Arrays.toString() is implemented multiple times => the method is overloaded (method overloading)
        System.out.println(Arrays.toString(numbers));
    }
}
