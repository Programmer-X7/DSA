// Notes:
// * Outer loop will run for the rows
// * Inner loop will run for the col (normally)
// * While printing hollow patterns use double spaces
// * Don't forget to use *sout to enter to next row

import java.util.Scanner;

public class patterns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        square(sc);
        // rectangle(sc);
        // hollowSquare(sc);
        // hollowRectangle(sc);
        // halfPyramid(sc);
        // invertedHalfPyramid(sc);
        // hollowHalfPyramid(sc);
        // invertedHollowHalfPyramid(sc);
        // numericHalfPyramid(sc);
        // invertedNumericHalfPyramid(sc);

        
        
        // dhanaPattern();
        sc.close();
    }

    // Q1. Full Square
    // * * * * *
    // * * * * *
    // * * * * *
    // * * * * *

    public static void square(Scanner sc) {
        System.out.print("Enter side of square: ");
        int side = sc.nextInt();

        for(int i=0; i<side; i++) {
            for(int j=0; j<side; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // Q2. Full Rectangle
    // * * * * * *
    // * * * * * *
    // * * * * * *

    public static void rectangle(Scanner sc) {
        System.out.print("Enter height of the rectangle: ");
        int height = sc.nextInt();
        System.out.print("Enter length of the rectangle: ");
        int length = sc.nextInt();

        for(int i=0; i<height; i++) {
            for(int j=0; j<length; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    // Q3. Hollow Square
    // * * * * *
    // *       *
    // *       *
    // * * * * *

    public static void hollowSquare(Scanner sc) {
        System.out.print("Enter side of square: ");
        int side = sc.nextInt();

        for (int i = 0; i < side; i++) {
            for (int j = 0; j < side; j++) {
                if (i == 0 || i == side-1 || j == 0 || j == side-1)
                    System.out.print("* ");
                else    
                    System.out.print("  ");     // use double spaces for consistancy
            }
            System.out.println();
        }
    }

    // Q4. Hollow Rectangle
    // * * * * * * *
    // *           *
    // * * * * * * *

    public static void hollowRectangle(Scanner sc) {
        System.out.print("Enter height of the rectangle: ");
        int height = sc.nextInt();
        System.out.print("Enter length of the rectangle: ");
        int length = sc.nextInt();

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < length; j++) {
                if(i == 0 || i == height-1 || j == 0 || j == length-1)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }

    // Q5. Half Pyramid
    // * 
    // * * 
    // * * * 
    // * * * * 
    // * * * * *

    public static void halfPyramid(Scanner sc) {
        System.out.print("Enter size of half pyramid: ");
        int size = sc.nextInt();

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < i+1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // Q6. Inverted half pyramid
    // * * * * * 
    // * * * * 
    // * * * 
    // * * 
    // * 

    public static void invertedHalfPyramid(Scanner sc) {
        System.out.print("Enter size of half pyramid: ");
        int size = sc.nextInt();

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size-i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // Q7. Hollow half pyramid
    // * 
    // * * 
    // *   * 
    // *     * 
    // * * * * *

    public static void hollowHalfPyramid(Scanner sc) {
        System.out.print("Enter size of hollow half pyramid: ");
        int size = sc.nextInt();
        
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < i+1; j++) {
                if(i == 0 || i == size-1 || j == 0 || j == i)
                    System.out.print("* ");
                else 
                    System.out.print("  ");
            }
            System.out.println();
        }
         
    }

    // Q8. Inverted hollow half pyramid
    // * * * * * 
    // *     * 
    // *   * 
    // * * 
    // * 
    
    public static void invertedHollowHalfPyramid(Scanner sc) {
        System.out.print("Enter size of inverted hollow half pyramid: ");
        int size = sc.nextInt();

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size-i; j++) {
                if(i == 0 || i == size-1 || j == 0 || j == size-i-1)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }

    // Q9. Numeric Half Pyramid
    // 1
    // 1 2 
    // 1 2 3
    // 1 2 3 4
    // 1 2 3 4 5

    public static void numericHalfPyramid(Scanner sc) {
        System.out.print("Enter size of numeric half pyramid: ");
        int size = sc.nextInt();

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < i+1; j++) {
                System.out.print(j+1 + " ");
            }
            System.out.println();
        }
    }

    // Q10. Inverted numeric half pyramid
    // 1 2 3 4 5
    // 1 2 3 4
    // 1 2 3
    // 1 2
    // 1

    public static void invertedNumericHalfPyramid(Scanner sc) {
        System.out.print("Enter size of inverted numeric half pyramid: ");
        int size = sc.nextInt();

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size-i; j++) {
                System.out.print((j+1) + " ");
            }
            System.out.println();
        }
    }
}