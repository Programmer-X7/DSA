// Proble Statement: Given an array with only 0s and 1s. Sort the array?

// Test Case:
// i/p: [1, 0, 0, 1, 1, 1, 0]
// o/p: [0, 0, 0, 1, 1, 1, 1]

// Approach:
// A. Two Pointer Approach
// 1. init start = 0, end = n-1
// 2. if arr[start] == 0
//      start++
// 3. else
//      swap arr[start] and arr[end]
//      end--

// T.C: O(n)
// S.C: O(1)

// B. Count and Insert
// 1. Count all 0s in the array
// 2. Count all 1s by, ones = n-zeros;
// 3. Inser all zeros first and then insert all ones

// T.C: O(n)
// S.C: O(1)

package arrays;

public class Sort01 {

    public static void main(String[] args) {
        int[] arr = { 1, 0, 0, 1, 1, 1, 0 };
        segregate0and1(arr);

        // Printing the array
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void segregate0and1(int[] arr) {

        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            if (arr[start] == 0) {
                start++;
            } else {

                // Swaping start element with end element
                arr[start] = arr[start] ^ arr[end];
                arr[end] = arr[start] ^ arr[end];
                arr[start] = arr[start] ^ arr[end];

                end--;
            }
        }
    }
}
