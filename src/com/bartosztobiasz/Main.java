package com.bartosztobiasz;

public class Main {
    public static void main(String[] args) {
        /*
        special characters:
        " -> \"
        \ -> \\
        \n
        \t
         */
        String message;

        message = "Hello \"Mosh\"";
        System.out.println(message);

        message = "c:\\Windows\\...";
        System.out.println(message);

        message = "c:\nWindows\\...";
        System.out.println(message);

        message = "c:\tWindows\\...";
        System.out.println(message);
    }
}
