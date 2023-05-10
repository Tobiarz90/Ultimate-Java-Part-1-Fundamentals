package com.bartosztobiasz;

public class Main {
    public static void main(String[] args) {
        // methodName(arguments);
        greetUser("Mosh", "Hamedani"); // method call
        greetUser("Bartosz", "Tobiasz"); // methods are reusable
    }

    // access_modifier static (?) return_type/void methodName(parameters (?)) { code block }
    // (?) -> optional
    // static -> this method belongs to a class, not an object
    // parameters can be use like a local variables inside the method
    public static void greetUser(String firstName, String lastName) {
        System.out.println("Hello " + firstName + " " + lastName); // concatenating strings
    }
}