/*
 * Program Name: OddEvenNumbersCollector
 * Description: This program collects and separates the odd and even numbers provided by the user.
 * The user will be asked to enter 20 numbers and after the 20th input, the odd and even numbers will
 * be shown in the screen.
 *
 * If the user repeats his input (e.g. entering number "1" twice), the program will end abruptly
 * and print the collected even and odd numbers.
 *
 * If the user types zero or a non-integer character, the program will restart.
 */

package com.oddeven.collector;

import java.util.InputMismatchException;
import java.util.Scanner;

public class OddEvenNumbersCollector {
    public static void main(String[] args) {
        final int maxNumberOfInput;
        maxNumberOfInput = 20;
        int[] arrayNumbers = new int[maxNumberOfInput];

        Scanner in = new Scanner(System.in);
        int index;

        System.out.println("Welcome to Odd and Even Numbers Collector!"); // Welcome message to user

        try {
            for (index = 0; index < maxNumberOfInput; index++) {
                System.out.print("Enter a number: "); // Asks user for a number
                int currentNumber = in.nextInt();

                if (currentNumber == 0) { // if the number 0, disallow
                    System.out.println("Zero is not allowed. Please try a different number.\n");
                    main(args);
                    //System.exit(0);
                }

                for (int arrayNumber : arrayNumbers) {
                    if (arrayNumber == currentNumber) {
                        System.out.println("\n");
                        System.out.println("Number " + currentNumber + " already exists.");
                        sortOddEvenNumbers(arrayNumbers);
                        System.exit(0); // Stops the script. End the program
                    } // if
                } // for

                arrayNumbers[index] = currentNumber;
            } // for
            sortOddEvenNumbers(arrayNumbers);

        } // try
        catch (InputMismatchException e) {
            System.out.println("Please type a valid number! Let's try it again.\n");
            main(args);
        } // catch
    } // main method

    public static void sortOddEvenNumbers(int[] array) {
        System.out.println(" "); // separator
        System.out.print("Here are the even numbers: "); // print all the even numbers
        for (int j : array) {
            if (j % 2 == 0) { // collects the even numbers
                if (j != 0) { // prints only non zero numbers
                    System.out.print(j + " ");
                } // if
            } // if
        } // for

        System.out.println(" "); // separator

        System.out.print("Here are the odd numbers: ");
        for (int j : array) { // checks all the numbers in the array
            if (j % 2 != 0) { // collects odd numbers and prints only non zero numbers
                System.out.print(j + " ");
            } // if
        } // for
    }// for
}
