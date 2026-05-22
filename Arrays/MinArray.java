/*
---------------------------------------------------------
Program: Find Minimum Element in Array
Language: Java
Concepts Used:
1. Arrays
2. Methods
3. Loops
4. Scanner Class
5. User Input Handling
---------------------------------------------------------
*/

import java.util.Scanner;

public class MinArray {

    // Method to take array input from user
    static void takeInputArray(int arr[], Scanner scn) {

        for (int i = 0; i < arr.length; i++) {

            System.out.print("Enter value for index " + i + " : ");
            arr[i] = scn.nextInt();
        }
    }

    // Method to print array elements
    static void printArray(int arr[]) {

        System.out.print("All Array Elements -> ");

        for (int i = 0; i < arr.length; i++) {

            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }

    // Method to find minimum element in array
    static int findMinimum(int arr[]) {

        int ans = arr[0];

        for (int index = 0; index < arr.length; index++) {

            int curr = arr[index];

            if (curr < ans) {
                ans = curr;
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        // Taking array size input
        System.out.print("Enter the size of Array : ");
        int size = scn.nextInt();

        // Creating array
        int userArray[] = new int[size];

        // Taking array elements input
        takeInputArray(userArray, scn);

        System.out.println();

        // Printing array elements
        printArray(userArray);

        System.out.println();

        // Finding minimum element
        int minElement = findMinimum(userArray);

        // Displaying minimum element
        System.out.println("Minimum Element in Array -> " + minElement);

        // Closing scanner object
        scn.close();
    }
}