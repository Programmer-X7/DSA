// Problem:
// Shift elements of an array by k position

// Test Case:
// i/p: [10, 20, 30, 40, 50, 60]
// k = 2
// o/p: [50, 60, 10, 20, 30, 40]

// Approach:
// Step-0: Formatting total no of shifts needed to avoid unnecessory shifts
// Step-1: Copy last k elements of the array into a temp array
// Step-2: Shift elements to right by k times
// Step-3: Copy temp array elements to main array

// T.C: O(n)
// S.C: O(k) // Can be O(1) if temp array size is constant

package arrays;

public class CyclicRotationOfElements {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 50, 60};
        int k = 2;

        System.out.println("Before:");
        ArrayHelper.printArray(arr);
        shiftArray(arr, k);

        System.out.println("After:");
        ArrayHelper.printArray(arr);
    }

    public static void shiftArray(int[] arr, int k) {
        int[] temp = new int[k];    // Bad Practice
        int tempIndex = 0;
        int n = arr.length;

        // Formatting total no of shifts needed
        k = (k % n);

        // Step-1: Copy last k elements of the array into a temp array
        for (int i = n - k; i < n; i++) {
            temp[tempIndex] = arr[i];
            tempIndex++;
        }

        // Step-2: Shift elements to right by k times
        for (int i = n - 1; i >= k; i--) {
            arr[i] = arr[i - k];
        }

        // Step-3: Copy temp array elements to main array
        for (int i = 0; i < k; i++) {
            arr[i] = temp[i];
        }
    }
}
