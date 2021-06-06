/*
 * Program name: Unit Converter
 * Description: This program converts multiple measurement units based on user's selection (using swithc and multiple if
 * statements). This program converts Temperature (Celsius to Fahrenheit, Fahrenheit to Celsius), Currency (PH Peso to
 * US Dollar, US Dollar to Peso, Euro to PH Peso), Distance (m to km, km to m), and Weight (g to kg, kg to g).
 * Author: ZAND (Zarex Alvin Daria)
 * History:
 * Date:        Description:                    Programmer Name:
 * 11/13/19     Coded the program as LabWork 5  ZAND
 *              of Introduction to Programming
 *              Language
 * 05/18/21     Recoded the program using       ZAND
 *              simplified Java format.
 */

package com.unit.converter;

import java.util.Scanner;

public class UnitConverter {

    public static void main(String[] args) {
        Scanner inputDevice = new Scanner(System.in);
        int Selection;
        // Asks the user about the conversion he wants to do
        System.out.println("MAIN MENU");
        System.out.println("What do you want to convert?");
        System.out.print("\n");
        System.out.println("1. Temperature Conversion");
        System.out.println("2. Currency Conversion");
        System.out.println("3. Distance Conversion");
        System.out.println("4. Weight Conversion");
        System.out.print("\n");
        System.out.print("Enter your Choice here: ");
        Selection = inputDevice.nextInt();
        System.out.print("\n");
        System.out.println("_______________________________________________");

        switch (Selection) {
            case 1 -> temperature();
            case 2 -> currency();
            case 3 -> distance();
            case 4 -> weight();
            default -> {
                System.out.println("Please input a valid number!");
                System.out.print("\n");
                main(args);
            }
        }
    }

    // This converts the temperature units
    public static void temperature() {
        Scanner inputDevice = new Scanner(System.in);
        System.out.print("\n");
        System.out.println("You are in Temperature Conversion");
        System.out.print("\n");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.print("\n");
        System.out.print("Enter your choice here: ");
        int temperatureSelection = inputDevice.nextInt();
        System.out.print("\n");
        System.out.println("_______________________________________________");

        if (temperatureSelection == 1) {
            celsiusToFahrenheit();
        } else if (temperatureSelection == 2) {
            fahrenheitToCelsius();
        } else {
            System.out.print("\n");
            System.out.println("Please input a valid number!");
            System.out.print("\n");
            temperature();
        }
    }

    // Converts Celsius to Fahrenheit
    public static void celsiusToFahrenheit() {
        Scanner inputDevice = new Scanner(System.in);
        System.out.print("\n");
        System.out.print("Enter a value in Celsius: ");
        float celsius = inputDevice.nextFloat();
        float fahrenheitConversion = ((celsius * 9) / 5) + 32;
        System.out.print("\n");
        System.out.println("The Equivalent in Fahrenheit is: " + fahrenheitConversion);
        System.out.print("\n");
        System.out.print("______________________________________________");
        System.out.print("\n");
        continueQuestion();
    }

    // Converts Fahrenheit to Celsius
    public static void fahrenheitToCelsius() {
        Scanner inputDevice = new Scanner(System.in);
        System.out.print("\n");
        System.out.print("Enter a Value in Fahrenheit: ");
        float fahrenheit = inputDevice.nextFloat();
        float celsiusConversion = (((fahrenheit - 32) * 5) / 9);
        System.out.print("\n");
        System.out.println("The Equivalent in Celsius is: " + celsiusConversion);
        System.out.print("\n");
        System.out.print("______________________________________________");
        System.out.print("\n");
        continueQuestion();
    }

    // This converts the currency
    public static void currency() {
        Scanner inputDevice = new Scanner(System.in);
        System.out.print("\n");
        System.out.println("You are in Currency Conversion");
        System.out.print("\n");
        System.out.println("1. Peso to Dollar");
        System.out.println("2. Dollar to Peso");
        System.out.println("3. Euro to Peso");
        System.out.print("\n");
        System.out.print("Enter your choice here: ");
        int currencySelection = inputDevice.nextInt();
        System.out.print("\n");
        System.out.println("_______________________________________________");

        if (currencySelection == 1) {
            pesoToDollar();
        } else if (currencySelection == 2) {
            dollarToPeso();
        } else if (currencySelection == 3) {
            euroToPeso();
        } else {
            System.out.print("\n");
            System.out.println("Please input a valid number!");
            System.out.print("\n");
            currency();
        }
    }

    // Converts peso currency to Dollar
    public static void pesoToDollar() {
        Scanner inputDevice = new Scanner(System.in);
        System.out.print("\n");
        System.out.print("Enter a Value in Peso: ");
        float peso = inputDevice.nextFloat();
        float pesoToDollarConversion = (float) (peso / 50.77);
        System.out.print("\n");
        System.out.println("The Equivalent of " + peso + " Peso in Dollar is: " + pesoToDollarConversion);
        System.out.print("\n");
        System.out.print("______________________________________________");
        System.out.print("\n");
        continueQuestion();
    }

    // Converts dollar currency to peso
    public static void dollarToPeso() {
        Scanner inputDevice = new Scanner(System.in);
        System.out.print("\n");
        System.out.print("Enter a value in Dollar: ");
        float dollar = inputDevice.nextFloat();
        float dollarToPesoConversion = (float) (dollar * 50.77);
        System.out.print("\n");
        System.out.println("The Equivalent of " + dollar + " Dollar in Peso is: " + dollarToPesoConversion);
        System.out.print("\n");
        System.out.print("______________________________________________");
        System.out.print("\n");
        continueQuestion();
    }

    // Converts euro currency to peso
    public static void euroToPeso() {
        Scanner inputDevice = new Scanner(System.in);
        System.out.print("\n");
        System.out.print("Enter a value in Euro: ");
        float euro = inputDevice.nextFloat();
        float euroToPesoConversion = euro * 56;
        System.out.print("\n");
        System.out.println("The Equivalent of " + euro + " Euro in Peso is: " + euroToPesoConversion);
        System.out.print("\n");
        System.out.print("______________________________________________");
        System.out.print("\n");
        continueQuestion();
    }

    // Converts distances
    public static void distance() {
        Scanner inputDevice = new Scanner(System.in);
        System.out.print("\n");
        System.out.println("You are in Distance Conversion");
        System.out.print("\n");
        System.out.println("1. Meter to Kilometer");
        System.out.println("2. Kilometer to Meter");
        System.out.print("Enter your choice here: ");
        int distanceSelection = inputDevice.nextInt();
        System.out.print("\n");
        System.out.println("_______________________________________________");

        if (distanceSelection == 1) {
            meterToKilometer();
        } else if (distanceSelection == 2) {
            kilometerToMeter();
        } else {
            System.out.print("\n");
            System.out.println("Please input a valid number!");
            System.out.print("\n");
            distance();
        }
    }

    // Converts meters to kilometers
    public static void meterToKilometer() {
        Scanner inputDevice = new Scanner(System.in);
        System.out.print("\n");
        System.out.print("Enter a value in Meter: ");
        float meter = inputDevice.nextFloat();
        float meterToKilometerConversion = meter / 1000;
        System.out.print("\n");
        System.out.println("The Equivalent of " + (meter) + " Meter to Kilometer is " + meterToKilometerConversion);
        System.out.print("\n");
        System.out.print("______________________________________________");
        System.out.print("\n");
        continueQuestion();
    }

    // Converts kilometer value to meters
    public static void kilometerToMeter() {
        Scanner inputDevice = new Scanner(System.in);
        System.out.print("\n");
        System.out.print("Enter a value in Kilometer: ");
        float kilometer = inputDevice.nextFloat();
        float kilometerToMeterConversion = kilometer * 1000;
        System.out.print("\n");
        System.out.println("The Equivalent of " + (int) (kilometer) + " Kilometer to Meter is " + kilometerToMeterConversion);
        System.out.print("\n");
        System.out.print("______________________________________________");
        System.out.print("\n");
        continueQuestion();
    }

    // This method converts weight units
    public static void weight() {
        Scanner inputDevice = new Scanner(System.in);
        System.out.print("\n");
        System.out.println("You are in Weight Conversion");
        System.out.print("\n");
        System.out.println("1. Gram to Kilogram");
        System.out.println("2. Kilogram to Gram");
        System.out.print("Enter your choice here: ");
        int weightSelection = inputDevice.nextInt();
        System.out.print("\n");
        System.out.println("_______________________________________________");

        if (weightSelection == 1) {
            gramToKilogram();
        } else if (weightSelection == 2) {
            kilogramToGram();
        } else {
            System.out.print("\n");
            System.out.println("Please input a valid number!");
            System.out.print("\n");
            weight();
        }
    }

    // Converts grams to kilograms
    public static void gramToKilogram() {
        Scanner inputDevice = new Scanner(System.in);
        System.out.print("\n");
        System.out.print("Enter a Value in Gram: ");
        float gram = inputDevice.nextFloat();
        float gramToKilogramConversion = gram / 1000;
        System.out.print("\n");
        System.out.println("The Equivalent of " + gram + " Gram to Kilogram is " + gramToKilogramConversion);
        System.out.print("\n");
        System.out.print("______________________________________________");
        System.out.print("\n");
        continueQuestion();
    }

    // Converts kilogram value to grams
    public static void kilogramToGram() {
        Scanner inputDevice = new Scanner(System.in);
        System.out.print("\n");
        System.out.print("Enter a value in Kilogram: ");
        float kilogram = inputDevice.nextFloat();
        float kilogramToGramConversion = kilogram * 1000;
        System.out.print("\n");
        System.out.println("The Equivalent of " + kilogram + " Kilogram to Gram is " + kilogramToGramConversion);
        System.out.print("\n");
        System.out.print("______________________________________________");
        System.out.print("\n");
        continueQuestion();
    }

    // Asks the user whether he wants to do more conversions or not
    public static void continueQuestion() {
        Scanner inputDevice = new Scanner(System.in);
        System.out.print("\n");
        System.out.print("Do you want to do more conversions? y/n: ");
        String ContinueOrNot = inputDevice.nextLine();
        ContinueOrNot = ContinueOrNot.toLowerCase();

        if (ContinueOrNot.equals("y")) {
            System.out.print("\n");
            main(null);
        } else {
            System.out.print("\n");
            System.out.println("Thanks for using my program! See you next time!");
        }
    }
}
