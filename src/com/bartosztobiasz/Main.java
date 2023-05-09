package com.bartosztobiasz;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date now = new Date();
        // new -> reserved keyword; allocates memory

//        now.getTime() // member

        System.out.println(now); // print value of the date object
    }
}
