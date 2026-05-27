/*
---------------------------------------------------------
Program: Reverse an Array
Language: Java
Concepts Used:
1. Arrays
2. Two Pointer Approach
3. Methods
4. While Loop
5. Swapping Logic
---------------------------------------------------------
*/

public class ReverseArray {

    // Method to reverse array elements
    public static void reverse(int numbers[]) {

        // Starting index
        int start = 0;

        // Ending index
        int end = numbers.length - 1;

        // Loop continues until both pointers meet
        while (start < end) {

            // Swapping start and end elements
            int temp = numbers[end];
            numbers[end] = numbers[start];
            numbers[start] = temp;

            // Moving start pointer forward
            start++;

            // Moving end pointer backward
            end--;
        }
    }

    public static void main(String[] args) {

        // Declaring and initializing array
        int numbers[] = {1, 2, 3, 4, 5, 6, 7};

        // Printing original array
        System.out.print("Original Array : ");

        for (int i = 0; i < numbers.length; i++) {

            System.out.print(numbers[i] + " ");
        }

        System.out.println();

        // Calling reverse method
        reverse(numbers);

        // Printing reversed array
        System.out.print("Reverse Array : ");

        for (int i = 0; i < numbers.length; i++) {

            System.out.print(numbers[i] + " ");
        }

        System.out.println();
    }
}