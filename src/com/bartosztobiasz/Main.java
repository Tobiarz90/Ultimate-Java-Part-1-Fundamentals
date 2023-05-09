package com.bartosztobiasz;

public class Main {
    public static void main(String[] args) {
        /*
         Aby operacja matematyczna została wykonana,
         kompilator najpierw konwertuje elementy wyrażenia do wspólnego typu danych
         */
        // implicit (pol. niejawny) casting, automatic conversion/casting -> NO data loss
        // byte > short > int > long > float > double

        short x = 1;
        // short > int
        int y = x + 2; // short + int; short (2 bytes) + int (4 bytes)
        System.out.println(y);
    }
}
