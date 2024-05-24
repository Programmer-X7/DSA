// Problem: 
// Transpose of a matrix

// i/p: 
// [ 10, 20, 30,
//   40, 50, 60
//   70, 80, 90 ]

// o/p:
// [ 10, 40, 70,
//   20, 50, 80
//   30, 60, 90 ]

// Approach:
// * swap(arr[i][j], arr[j][i])
// Note: We are not visiting a already swaped cell using (j=i) for inner loop

// T.C: O(n^2)
// S.C: O(1)

package arrays;

public class TransposeOfMatrix {
    public static void main(String[] args) {
        int[][] arr = {
                { 10, 20, 30 },
                { 40, 50, 60 },
                { 70, 80, 90 }
        };

        System.out.println("Before:");
        ArrayHelper.print2dArray(arr);

        transposeMatrix(arr);

        System.out.println("After:");
        ArrayHelper.print2dArray(arr);
    }

    public static void transposeMatrix(int[][] arr) {
        {
            for (int i = 0; i < arr.length; i++) {
                for (int j = i; j < arr[i].length; j++) {
                    // swap arr[i][j] with arr[j][i]
                    // Note: Don't use XOR swapping 
                    // Otherwise some elements will be 0
                    // Use traditional swaping
                    int temp = arr[i][j];
                    arr[i][j] = arr[j][i];
                    arr[j][i] = temp;
                }
            }
        }

    }
}
