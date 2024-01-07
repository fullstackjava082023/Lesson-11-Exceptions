package my_exceptions;

/*
Exercise Description:
You are tasked with creating a simple program that calculates the division of two numbers entered by the user. However, you need to handle potential exceptions that may occur during the division, such as division by zero or invalid input.
        Instructions:
Create a Java program that does the following:
Takes two numbers as input from the user (numerator and denominator).
Attempts to perform the division operation.
Handles any exceptions that may occur and provides appropriate error messages.
Use a try-catch block to handle the exceptions. Specifically, catch exceptions for:
Division by zero (ArithmeticException).
Invalid input (InputMismatchException).
Display the result of the division if it's successful, or an error message if an exception occurs.
Keep the program running until the user decides to exit.
*/

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivisionCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to division calculator");
        while (true) {
            try {
                System.out.println("Enter numerator");
                int numerator = scanner.nextInt();

                System.out.println("Enter the denominator");
                int denominator = scanner.nextInt();
               /* if (denominator == 0) {
                    throw new AgeException("denominator = 0");
                } else {
                    double result = numerator / denominator;
                    System.out.println("Result = : " + result);
                }*/
                double result = numerator / denominator;
                System.out.println("Result = : " + result);
            } catch (ArithmeticException e) {
                System.out.println("Error! - Division by zero please try again");
            } catch (InputMismatchException e) {
                System.out.println("Error! - not valid input");
                scanner.nextLine();// Clear the input buffer
            }

            System.out.println("Do you want to continue (yes/no) ?");
            String choice = scanner.next();
            if (!choice.equals("yes")) {//everything except yes will exit
                System.out.println("GoodBye");
                break;
            }
        }
    }
}

