package com.bartosztobiasz;

public class Main {
    public static void main(String[] args) {
        String role = "admin";

        if (role == "admin") {
            System.out.println("You're an admin");
        } else if (role == "moderator") {
            System.out.println("You're a moderator");
        } else {
            System.out.println("You're a guest");
        }


        /*
        from: https://docs.oracle.com/javase/tutorial/java/nutsandbolts/switch.html

        "A switch works with the byte, short, char, and int primitive data types.
        It also works with enumerated types, the String class,
        and a few special classes that wrap certain primitive types:
        Character, Byte, Short, and Integer."
         */
        switch (role) {
            case "admin":
                System.out.println("You're an admin");
                break;

            case "moderator":
                System.out.println("You're a moderator");
                break;

            default:
                System.out.println("You're a guest");
        }
    }
}