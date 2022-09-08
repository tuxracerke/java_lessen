/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.java_leren;

/**
 *
 * @author tux
 */
public class Java_leren {

    //overloading: multiple methods can have the same name with different parameters
    static int plusMethod(int x, int y) {
        return x + y;
    }

    static double plusMethod(double x, double y) {
        return x + y;
    }

    static int myMethodAddTwoNumbers(int x, int y) {
        return x + y;
    }

    static void myMethod() {
        System.out.println("I just got executed!");
    }

    static void myMethod2(String fname, int age) {
        System.out.println(fname + " is " + age);
    }

    public static void main(String[] args) {

        double myNum2 = plusMethod(4.3, 6.26);
        int myNum1 = plusMethod(8, 5);
// commentaar
        System.out.println(
                "int: " + myNum1);
        System.out.println(
                "double: " + myNum2);

        myMethod();

        myMethod2(
                "Liam", 34);
        myMethod2(
                "Jenny", 45);
        myMethod2(
                "Anja", 22);
        System.out.println(
                "De som van de 2 getallen is:  " + myMethodAddTwoNumbers(8, 56));

        System.out.println(
                "Hello World!");
        // operators, arithmethic
        int x = 8;
        int y = 5;
        //System.out.println(--x);

        System.out.println(x
                + " modulo " + y + " = " + (x % y));
        System.out.println(x
                + " divide by " + y + " = " + (x / y));
        System.out.println(
                "x =" + x + ", " + x + "^3" + " = " + (x ^= 3));

        // create variables
        int a = 4;
        int var;

        // assign value using =
        var = a;

        System.out.println(
                "var using =: " + var);

        // assign value using =+
        var += a;

        System.out.println(
                "var using +=: " + var);

        // assign value using =*
        var *= a;

        System.out.println(
                "var using *=: " + var);
        int p = 7;
        p
                %= 2;
        System.out.println(p);

        //A String in Java is actually an object, which contain methods 
        //that can perform certain operations on strings. 
        // String is non-primitive data type 
        //for example:
        String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        System.out.println(
                "The length of the txt string: " + txt.toLowerCase() + " is: " + txt.length());
        System.out.println(txt.indexOf("A")); // Outputs 0

        String firstName = "John ";
        String lastName = "Doe";

        System.out.println(
                "\n" + firstName.concat(lastName));

        //The Java Math class has many methods that allows you to perform mathematical tasks on numbers
        System.out.println(Math.max(5, 4));

        float randomNum = (float) (Math.random() * 101);

        System.out.println(randomNum);

        //booleans:
        System.out.println(
                10 > 90);

        // if else ...
        if (20 > 18) {
            System.out.println("20 is greater than 18");
        }

        int time = 22;
        if (time
                < 10) {
            System.out.println("Good morning.");
        } else if (time
                < 20) {
            System.out.println("Good day.");
        } else {
            System.out.println("Good eveninggggg.");
        }
        // Outputs "Good eveningggg."

        int x1 = 10;

        System.out.println(x1
                == 10);

        int time2 = 42;
        String result = (time2 < 18) ? "Good dayyyy." : "Good evening.";

        System.out.println(result);

        String dayofweek = "tuesday";
        switch (dayofweek) {
            case "tuesday":
                System.out.println("dinsdag");
                break;
        }

        int day = 4;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
        } //while loop:
        int i = 0;
        while (i
                < 5) {
            System.out.println(i);
            i++;
        }

        //the do while loop:
        int i2 = 0;

        do {
            System.out.println(i2);
            i2++;
        } while (i2 < 5);

        //the for loop:
        for (int i3 = 0;
                i3 <= 10; i3 = i3 + 2) {
            System.out.println(i3);
        }

        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (String i4 : cars) {
            System.out.println(i4);
        }

        // break and continue:
        for (int i5 = 0;
                i5 <= 10; i5++) {
            if (i5 == 4) {
                continue;
            }
            System.out.println(i5);
        }
        // break in for loop: this exaple skips 11 
        for (int i6 = 8;
                i6 < 15; i6++) {
            if (i6 == 11) {
                continue;
            }
            System.out.println(i6);
        }

        //arrays: used to store multiple values in a single variable
        String[] cars2 = {"Volvo", "BMW", "Ford", "Mazda"};
        int[] myNum = {10, 20, 30, 40};
        for (int i6 = 0;
                i6 < cars.length;
                i6++) {
            System.out.println(cars[i6]);
        }

        // Multidimensional Arrays
        //This example accesses the third element (2) in the second array (1) of myNumbers:
        int[][] myNumbers = {{1, 2, 3, 4}, {5, 6, 7}};
        int x2 = myNumbers[1][1];

        System.out.println(x2); // Outputs 7

        int[][][] arr = {{{1, 2}, {3, 4}}, {{5, 6}, {7, 8}}};
        for (int i8 = 0;
                i8 < 2; i8++) {
            for (int j1 = 0; j1 < 2; j1++) {
                for (int z = 0; z < 2; z++) {
                    System.out.println("arr[" + i8
                            + "]["
                            + j1 + "]["
                            + z + "] = "
                            + arr[i8][j1][z]);
                }
            }
        }

    }
}
