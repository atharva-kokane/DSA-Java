/*
---------------------------------------------------------
Program: Linear Search in Array
Language: Java
Concepts Used:
1. Arrays
2. Linear Search
3. Methods
4. Loops
5. Scanner Class
---------------------------------------------------------
*/

import java.util.Scanner;

public class LinearSearch {

    // Method to search key element in array
    public static int findKey(int numbers[], int key) {

        // Traversing entire array
        for (int i = 0; i < numbers.length; i++) {

            // Checking if current element matches key
            if (numbers[i] == key) {

                // Returning index if key found
                return i;
            }
        }

        // Returning -1 if key not found
        return -1;
    }

    // Method to take array input from user
    static void takeArrayInput(int[] arr, Scanner scn) {

        for (int i = 0; i < arr.length; i++) {

            System.out.print("Enter value for Index " + i + " : ");
            arr[i] = scn.nextInt();
        }
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        // Taking array size input
        System.out.print("Enter Array Size : ");
        int size = scn.nextInt();

        // Creating array
        int[] userArray = new int[size];

        // Taking array elements input
        takeArrayInput(userArray, scn);

        // Taking key element input
        System.out.print("Enter the KEY Value : ");
        int key = scn.nextInt();

        // Calling linear search method
        int index = findKey(userArray, key);

        // Checking search result
        if (index == -1) {

            System.out.println("Key Not Found in Given Array");
        } else {

            System.out.println("Key is at Index : " + index);
        }

        // Closing scanner object
        scn.close();
    }
}