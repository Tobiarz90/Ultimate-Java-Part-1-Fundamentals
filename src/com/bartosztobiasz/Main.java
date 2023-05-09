package com.bartosztobiasz;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Point point1 = new Point(1, 1);
        Point point2 = point1; // point2 stores a reference to the object

        // Changes made in one variable will be visible in the other variable.
        point1.x = 2;
        System.out.println(point2);
    }
}
