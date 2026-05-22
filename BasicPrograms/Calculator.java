/*
---------------------------------------------------------
Program: Simple Calculator
Language: Java
Concepts Used:
1. Methods
2. Loops
3. Switch Case
4. Scanner Class
5. User Input Handling
---------------------------------------------------------
*/

import java.util.Scanner;

public class Calculator {

    // Method for addition
    static int add(int num1, int num2) {

        return num1 + num2;
    }

    // Method for subtraction
    static int subtract(int num1, int num2) {

        return num1 - num2;
    }

    // Method for multiplication
    static int multiply(int num1, int num2) {

        return num1 * num2;
    }

    // Method for division
    static int divide(int num1, int num2) {

        return num1 / num2;
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        while (true) {

            // Displaying calculator menu
            System.out.println("\n===== Welcome To My Calculator =====");
            System.out.println("0. Exit");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");

            // Taking user choice
            System.out.print("Enter Your Choice -> ");
            int choice = scn.nextInt();

            // Exit condition
            if (choice == 0) {

                System.out.println("Exiting Program...");
                break;
            }

            // Taking user input numbers
            System.out.print("Enter First Number : ");
            int num1 = scn.nextInt();

            System.out.print("Enter Second Number : ");
            int num2 = scn.nextInt();

            int result;

            // Performing operation using switch case
            switch (choice) {

                case 1:
                    result = add(num1, num2);
                    break;

                case 2:
                    result = subtract(num1, num2);
                    break;

                case 3:
                    result = multiply(num1, num2);
                    break;

                case 4:

                    // Checking division by zero
                    if (num2 == 0) {

                        System.out.println("Division by zero is not allowed.");
                        continue;
                    }

                    result = divide(num1, num2);
                    break;

                default:
                    System.out.println("Invalid Choice");
                    continue;
            }

            // Displaying final result
            System.out.println("Final Result -> " + result);
        }

        // Closing scanner object
        scn.close();
    }
}