/*
---------------------------------------------------------
Program: Print All Pairs in Array
Language: Java
Concepts Used:
1. Arrays
2. Nested Loops
3. Pair Generation
4. Iteration
---------------------------------------------------------
*/

public class PrintPairs {

    // Method to print all possible pairs in array
    public static void printPairs(int numbers[]) {

        // Outer loop selects first element of pair
        for (int i = 0; i < numbers.length; i++) {

            // Current element
            int curr = numbers[i];

            // Inner loop selects second element of pair
            for (int j = i + 1; j < numbers.length; j++) {

                // Printing pair
                System.out.print("(" + curr + "," + numbers[j] + ")");
            }

            // Moving to next line after each row
            System.out.println();
        }
    }

    public static void main(String[] args) {

        // Declaring and initializing array
        int numbers[] = {2, 3, 4, 5, 6, 7, 8};

        // Calling method to print pairs
        printPairs(numbers);
    }
}