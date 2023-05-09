package com.bartosztobiasz;

public class Main {
    public static void main(String[] args) {
        /*
         Aby operacja matematyczna została wykonana,
         kompilator najpierw konwertuje elementy wyrażenia do wspólnego typu danych
         */
        // implicit (pol. niejawny) casting, automatic conversion/casting -> NO data loss
        // byte > short > int > long > float > double

        double x = 1.1;
        // int > double
        double y = x + 2; // 1.1 + 2.0; double (more precise) + int (less precise)
        System.out.println(y);
    }
}
