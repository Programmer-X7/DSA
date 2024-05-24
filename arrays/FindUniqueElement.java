// Problem statement: 
//Given an array of integers where every element present twice except only one element. Find that element?

// test case:
// i/p: [1, 2, 5, 2, 1, 3, 3]
// o/p: 5
// Explaination: 5 is present only one time in the array.

// Approach:
// We can cancel out all the double occurence element (Using XOR) and leave with the single occurence element.

// T.C: O(n)
// S.C: O(1)

package arrays;

public class FindUniqueElement {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 5, 2, 1, 3, 3 };
        int ans = findUniqueElementInArray(arr);
        System.out.println("Unique element: " + ans);
    }

    public static int findUniqueElementInArray(int[] arr) {
        int element = 0;
        for (int i : arr) {
            element ^= i;
        }

        return element;
    }
}
