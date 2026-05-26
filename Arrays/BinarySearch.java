/*
---------------------------------------------------------
Program: Binary Search in Array
Language: Java
Concepts Used:
1. Arrays
2. Binary Search
3. Methods
4. While Loop
5. Conditional Statements
---------------------------------------------------------
*/

public class BinarySearch {

    // Method to perform Binary Search
    public static int findBinarySearch(int numbers[], int key) {

        // Starting index of array
        int start = 0;

        // Ending index of array
        int end = numbers.length - 1;

        // Loop continues until search space becomes invalid
        while (start <= end) {

            // Finding middle index
            int mid = (start + end) / 2;

            // Checking if key is present at middle index
            if (numbers[mid] == key) {

                // Returning index if key found
                return mid;
            }

            // If middle element is smaller than key
            // Move search to right half
            if (numbers[mid] < key) {

                start = mid + 1;

            } else {

                // If middle element is greater than key
                // Move search to left half
                end = mid - 1;
            }
        }

        // Returning -1 if key is not found
        return -1;
    }

    public static void main(String[] args) {

        // Sorted array for Binary Search
        int numbers[] = {2, 3, 5, 7, 8, 9, 12};

        // Key element to search
        int key = 12;

        // Calling Binary Search method
        int result = findBinarySearch(numbers, key);

        // Displaying result
        System.out.println("Index for Key is : " + result);
    }
}