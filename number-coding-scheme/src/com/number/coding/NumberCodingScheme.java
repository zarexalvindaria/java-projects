/*
 * Program Name: NumberCodingScheme
 * Description: This program allows a user to know the day his vehicle is banned on major thoroughfares in Metro Manila
 * from 7 a.m. to 8 p.m. on a certain day of the week based on the last digit of his license plate. The user only
 * needs to input the last digit of his plate number.
 */

package com.number.coding;

import java.util.Scanner;

public class NumberCodingScheme {

    public static void main(String[] args)
    {
        // Asks the last digit of the user's plate number
        System.out.print("Please enter the last digit of your plate number: ");
        Scanner inputDevice = new Scanner(System.in);
        int plateNumber = inputDevice.nextInt();

            if (plateNumber == 1 || plateNumber == 2)
            {
                // sets Monday as the codingDay
                CodingScheme("Monday");
            }

            else if (plateNumber == 3 || plateNumber == 4)
            {
                // sets Tuesday as the codingDay
                CodingScheme("Tuesday");
            }

            else if (plateNumber == 5 || plateNumber == 6)
            {
                // sets Wednesday as the codingDay
                CodingScheme("Wednesday");
            }

            else if (plateNumber == 7 || plateNumber == 8)
            {
                // sets Thursday as the codingDay
                CodingScheme("Thursday");
            }

            else if (plateNumber == 9 || plateNumber == 0)
            {
                // sets Friday as the codingDay
                CodingScheme("Friday");
            }
            else
            {
                System.out.println("Please enter a valid number.");
                System.out.print("\n");
                main(args);
            }
        }

    public static void CodingScheme(String codingDay)
    {
        // Generates the message to be displayed to the user based on codingDay value passed
        System.out.print("You are not allowed every " + codingDay + ".");
    }
}
