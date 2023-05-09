package com.bartosztobiasz;

public class Main {
    public static void main(String[] args) {
        // "Hello World" is a string literal/value

        // java.lang package is automatically imported

        /*
        Unless an explicit copy of original is needed,
        use of this constructor is unnecessary since Strings are immutable.
         */
//        String message = new String("Hello World");

//        String message = "Hello World"; // shorthand to initialize a string variable
//        System.out.println(message);

        // join a string with another one -> concatenate two strings
        String message = "Hello World" + "!!";

        System.out.println(message.endsWith("!!"));
        System.out.println(message.startsWith("!!"));

        System.out.println(message.length());

        System.out.println(message.indexOf("H"));
        System.out.println(message.indexOf("sky")); // -1

        System.out.println(message.replace("!", "*")); // ang. asterisk -> pol. gwiazdka
        System.out.println(message); // String.replace() doesn't modify the original string
        // Strings are immutable (pol. niezmienne)

        System.out.println(message.toLowerCase());
        System.out.println(message.toUpperCase());

        message = "  Hello World" + "!!  ";
        System.out.println(message.trim()); // all leading and trailing spaces are removed
        System.out.println(message);
    }
}
