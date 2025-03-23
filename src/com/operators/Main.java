// Java program to illustrate Unsigned Right Shift Operator
package com.operators;

// Main class
public class Main {

    // Main method to run java program
    public static void main(String[] args) {

        // Variable index holds value -1 = 11111111111111111111111111111111
        int index = -1;

        // Index is shifted 29 times
        System.out.println(index >>> 29); // -1 becomes 7

        // Variable index2 holds value -2 = 11111111111111111111111111111110
        int index1 = -2;

        // Index is shifted 28 times
        System.out.println(index1 >>> 28); // -2 becomes 15

        // Variable index2 holds value 3 = 11111111111111111111111111111110
        int index2 = 3;

        // Index is shifted 27 times
        System.out.println(index1 >>> 27); // 3 becomes 31

    }
}