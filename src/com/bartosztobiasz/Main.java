package com.bartosztobiasz;

public class Main {
    public static void main(String[] args) {
        /*
         Aby operacja matematyczna została wykonana,
         kompilator najpierw konwertuje elementy wyrażenia do wspólnego typu danych
         */
        // explicit (pol. jawny) casting, manual conversion/casting -> data loss

        double x = 1.1;
        // (int) x => data loss here
        int y = (int) x + 2; // 1 + 2
        System.out.println(y);
    }
}
