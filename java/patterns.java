// Notes:
// * Outer loop will run for the rows
// * Inner loop will run for the col (normally)
// * While printing hollow patterns use double spaces
// * Don't forget to use sout* to enter to next row

import java.util.Scanner;

public class patterns {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        // square(7);
        // rectangle(7, 5);
        // hollowSquare(7);
        // hollowRectangle(7, 5);
        // halfPyramid(7);
        // invertedHalfPyramid(7);
        // hollowHalfPyramid(7);
        // invertedHollowHalfPyramid(7);
        // numericHalfPyramid(7);
        // invertedNumericHalfPyramid(7);
        // numericHollowHalfPyramid(7);
        // invertedNumericHollowHalfPyramid(7);
        // numericPalindromeFullPyramid(7);
        // soldiHalfDimond(7);
        // fancyPattern1(7);
        // fancyPattern2(7);
        // fancyPattern3(7);
        // floydsTrianglePattern(7);
        // pascalTrianglePattern(7);
        // butterflyPattern(7);
        // fullPyramid(7);
        // invertedFullPyramid(7);
        // dimond(7);
        // hollowPyramid(7);
        // invertedHollowPyramid(7);
        // hollowDiamond(7);
        // mixPyramid(7);
        // half_fancy_12_pattern(7);
        // full_fancy_12_pattern(7);     
        // ABCBA_pattern(7);
        
        sc.close();
    }

    // Q1. Full Square
    // * * * * *
    // * * * * *
    // * * * * *
    // * * * * *

    public static void square(int ...n) {
        int side = 0;

        // Checks if function is called with any size argument
        if (n.length != 0) {
            side = n[0];
        } else {
            System.out.print("Enter side of square: ");
            side = sc.nextInt();
        }

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

    public static void rectangle(int... n) {
        int height = 0;
        int length = 0;

        // Checks if function is called with any size argument
        if (n.length != 0) {
                height = n[0];
                length = n[1];
        } else {
            System.out.print("Enter height of the rectangle: ");
            height = sc.nextInt();
            System.out.print("Enter length of the rectangle: ");
            length = sc.nextInt();
        }

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

    public static void hollowSquare(int... n) {
        int side = 0;

        // Checks if function is called with any size argument
        if (n.length != 0) {
            side = n[0];
        } else {
            System.out.print("Enter side of square: ");
            side = sc.nextInt();
        }

        for (int i = 0; i < side; i++) {
            for (int j = 0; j < side; j++) {
                if (i == 0 || i == side-1 || j == 0 || j == side-1)
                    System.out.print("* ");
                else    
                    // use double spaces for consistancy
                    System.out.print("  ");     
            }
            System.out.println();
        }
    }

    // Q4. Hollow Rectangle
    // * * * * * * *
    // *           *
    // * * * * * * *

    public static void hollowRectangle(int... n) {
        int height = 0;
        int length = 0;

        // Checks if function is called with any size argument
        if (n.length != 0) {
                height = n[0];
                length = n[1];
        } else {
            System.out.print("Enter height of the rectangle: ");
            height = sc.nextInt();
            System.out.print("Enter length of the rectangle: ");
            length = sc.nextInt();
        }

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

    public static void halfPyramid(int... n) {
        int size = 0;

        // Checks if function is called with any size argument
        if(n.length != 0) {
            size = n[0];
        } else {
            System.out.print("Enter size of half pyramid: ");
            size = sc.nextInt();
        }

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

    public static void invertedHalfPyramid(int... n) {
        int size = 0;

        // Checks if function is called with any size argument
        if(n.length != 0) {
            size = n[0];
        } else {
            System.out.print("Enter size of inverted half pyramid: ");
            size = sc.nextInt();
        }

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

    public static void hollowHalfPyramid(int... n) {
        int size = 0;

        // Checks if function is called with any size argument
        if(n.length != 0) {
            size = n[0];
        } else {
            System.out.print("Enter size of hollow half pyramid: ");
            size = sc.nextInt();
        }
        
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
    
    public static void invertedHollowHalfPyramid(int... n) {
        int size = 0;

        // Checks if function is called with any size argument
        if(n.length != 0) {
            size = n[0];
        } else {
            System.out.print("Enter size of inverted hollow half pyramid: ");
            size = sc.nextInt();
        }

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

    public static void numericHalfPyramid(int... n) {
        int size = 0;

        // Checks if function is called with any size argument
        if(n.length != 0) {
            size = n[0];
        } else {
            System.out.print("Enter size of numeric half pyramid: ");
            size = sc.nextInt();
        }

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

    public static void invertedNumericHalfPyramid(int... n) {
        int size = 0;

        // Checks if function is called with any size argument
        if(n.length != 0) {
            size = n[0];
        } else {
            System.out.print("Enter size of inverted numeric half pyramid: ");
            size = sc.nextInt();
        }

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size-i; j++) {
                System.out.print((j+1) + " ");
            }
            System.out.println();
        }
    }

    // Q11. Numeric Hollow Half Pyramid
    // 1 
    // 1 2 
    // 1   3 
    // 1     4 
    // 1 2 3 4 5

    public static void numericHollowHalfPyramid(int... n) {
        int size = 0;

        // Checks if function is called with any size argument
        if(n.length != 0) {
            size = n[0];
        } else {
            System.out.print("Enter size of numeric hollow half pyramid: ");
            size = sc.nextInt();
        }
        
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < i+1; j++) {
                if (i == size-1 || j == 0 || j == i)
                    System.out.print((j+1)+" ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }

    // Q12. Inverted numeric hollow half pyramid
    // 1 2 3 4 5 
    // 1     4 
    // 1   3 
    // 1 2 
    // 1 
    
    public static void invertedNumericHollowHalfPyramid(int... n) {
        int size = 0;

        // Checks if function is called with any size argument
        if(n.length != 0) {
            size = n[0];
        } else {
            System.out.print("Enter size of inverted numeric hollow half pyramid: ");
            size = sc.nextInt();
        }

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size-i; j++) {
                if (i == 0 || j == 0 || j == size-i-1) 
                    System.out.print((j+1) + " ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }

    // Q13. Numeric Palindrome Full Pyramid
    //         1
    //       1 2 1
    //     1 2 3 2 1
    //   1 2 3 4 3 2 1
    // 1 2 3 4 5 4 3 2 1

    public static void numericPalindromeFullPyramid(int... n) {
        int size = 0;

        // Checks if function is called with any size argument
        if(n.length != 0) {
            size = n[0];
        } else {
            System.out.print("Enter size of the pyramid: ");
            size = sc.nextInt();
        }

        for (int i = 0; i < size; i++) {
            // Initialize a variable for printing palindrome numbers
            int count = 1;

            // Print spaces
            for (int j = 0; j < size-i-1; j++) {
                System.out.print("  ");
            }

            // Print palindrome numbers
            // 2*i+1 -> for 1, 3, 5, 7, ...
            for (int j = 0; j < 2*i+1; j++) {
                // edge case: 
                // for j==0: just print the count without increment or decrement
                if ( j==0 ) {
                    System.out.print(count + " ");
                } else {
                    count = (j>i) ? --count : ++count;
                    System.out.print(count + " ");
                }

            }
            System.out.println();
        }
    }

    // Q14. Solid Half Dimond
    // *
    // * *
    // * * *
    // * * * *
    // * * * * *
    // * * * *
    // * * *
    // * *
    // *

    public static void soldiHalfDimond(int... n) {
        int size = 0;

        // Checks if function is called with any size argument
        if(n.length != 0) {
            size = n[0];
        } else {
            System.out.print("Enter size: ");
            size = sc.nextInt();
        }

        // Printint a half pyramid for first part with size n
        halfPyramid(size);
        // Printing a inverted half pyramid for second part with size (n-1)
        invertedHalfPyramid(size-1);
    }

    // Q15. Fancy Pattern 1
    // * * * * * * * * 1 * * * * * * * * 
    // * * * * * * * 2 * 2 * * * * * * * 
    // * * * * * * 3 * 3 * 3 * * * * * * 
    // * * * * * 4 * 4 * 4 * 4 * * * * * 
    // * * * * 5 * 5 * 5 * 5 * 5 * * * *

    public static void fancyPattern1(int... n) {
        int size = 0;

        // Checks if function is called with any size argument
        if(n.length != 0) {
            size = n[0];
        } else {
            System.out.print("Enter size between (1 - 9): ");
            size = sc.nextInt();  
        }

        if (size < 0 || size > 9) {
            System.out.println("You entered a invalid size.");
            return;
        } 

        for (int i = 0; i < size; i++) {
            int start_num_index = 8-i;
            int num = i+1;
            int num_count = num;

            for (int j = 0; j < 17; j++) {
                if (j == start_num_index && num_count > 0) {
                    System.out.print(num + " ");
                    start_num_index+=2;
                    num_count--;
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }


    }

    // Q16. Fancy Pattern 2
    // 1
    // 2 * 3
    // 4 * 5 * 6
    // 7 * 8 * 9 * 10
    // 7 * 8 * 9 * 10
    // 4 * 5 * 6
    // 2 * 3
    // 1

    public static void fancyPattern2(int... n) {
        int size = 0;

        // Checks if function is called with any size argument
        if(n.length != 0) {
            size = n[0];
        } else {
            System.out.print("Enter size of the pattern: ");
            size = sc.nextInt();  
        }

        // Growing phase
        int count = 1;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < i+1; j++) {
                System.out.print(count++ + " ");
                if (j<i) {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }

        // Checks count value at this stage
        // System.out.println("count: " + count);

        // Srinking phase
        int start = count - size;
        for (int i = 0; i < size; i++) {
            int k = start;
            for (int j = 0; j < size-i; j++) {
                System.out.print(k++ + " ");
                if (j < size-i-1) {
                    System.out.print("* ");
                }
            }
            start -= (size-i-1);
            System.out.println();
        }
    }

    // Q17. Fancy Pattern 3
    // *
    // * 1 *
    // * 1 2 1 *
    // * 1 2 3 2 1 *
    // * 1 2 1 *
    // * 1 *
    // *

    public static void fancyPattern3(int... n) {
        int size = 0;

        // Checks if function is called with any size argument
        if(n.length != 0) {
            size = n[0];
        } else {
            System.out.print("Enter size of the pattern (odd numbers only): ");
            size = sc.nextInt();  

        }
        
        // validate input for odd numbers
        // (size & 1) == 0 ? even : odd
        if ((size&1) == 0) {
            System.out.println("Invalid output. Try again.");
            return;
        }

        for (int i = 0; i < size; i++) {

            if (i==0) {
                System.out.println("* ");
            }

            int cond = i <= (size/2) ? 2*i : 2*(size-i-1); 

            for (int j = 0; j <= cond; j++) {
                
                if (j==0) {
                    System.out.print("* ");
                }
                
                if (j<=(cond/2)) {
                    System.out.print(j+1 + " ");
                } else {
                    System.out.print(cond-j+1 + " ");
                }

                if (j == cond)
                    System.out.print("* ");
            }
            System.out.println();

            if (i==size-1) {
                System.out.println("* ");
            }

        }





    }

    // Q18. Floyd's Triangle Pattern
    // 1 
    // 2 3 
    // 4 5 6 
    // 7 8 9 10 
    // 11 12 13 14 15

    public static void floydsTrianglePattern(int... n) {
        int size = 0;

        // Checks if function is called with any size argument
        if(n.length != 0) {
            size = n[0];
        } else {
            System.out.print("Enter size of the pattern: ");
            size = sc.nextInt();  

        }
        
        int count = 1;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < i+1; j++) {
                System.out.print(count++ + " ");
            }
            System.out.println();
        }
    }

    // Q19. Pascal's Triangle Pattern
    // 1
    // 1 1
    // 1 2 1
    // 1 3 3 1
    // 1 4 6 4 1
    // 1 5 10 10 5 1

    public static void pascalTrianglePattern(int... n) {
        int size = 0;

        // Checks if function is called with any size argument
        if(n.length != 0) {
            size = n[0];
        } else {
            System.out.print("Enter size of the pattern: ");
            size = sc.nextInt();  
        }

        // initialize i with 1 for this pattern
        for (int i = 1; i <= size; i++) {
            int count = 1;
            // intialize j with 1 for this pattern
            for (int j = 1; j <= i; j++) {
                System.out.print(count + " ");

                // The Formula: count = count * (i-j) / j
                count = count * (i-j) / j;
            }
            System.out.println();
        }
    }

    // Q20. Butterfly Pattern
    // *                 * 
    // * *             * *
    // * * *         * * *
    // * * * *     * * * *
    // * * * * * * * * * *
    // * * * * * * * * * *
    // * * * *     * * * *
    // * * *         * * *
    // * *             * *
    // *                 *

    public static void butterflyPattern(int... n) {
        int size = 0;

        // Checks if function is called with any size argument
        if(n.length != 0) {
            size = n[0];
        } else {
            System.out.print("Enter size of the pattern: ");
            size = sc.nextInt();  

        }

        // First Phase
        for (int i = 0; i < size; i++) {
            // Printing left wing stars
            for (int j = 0; j < i+1; j++) {
                System.out.print("* ");
            }

            // Printing spaces
            for (int j = 0; j < 2*(size-i-1); j++) {
                System.out.print("  ");
            }

            // Printing right wing starts
            for (int j = 0; j < i+1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Second Phase
        for (int i = 0; i < size; i++) {
            // Printing left wing stars
            for (int j = 0; j < size-i; j++) {
                System.out.print("* ");
            }

            // Printing spaces
            for (int j = 0; j < 2*i; j++) {
                System.out.print("  ");
            }

            // Printing right wing stars
            for (int j = 0; j < size-i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // Q21. Full Pyramid
    //     * 
    //    * * 
    //   * * * 
    //  * * * * 
    // * * * * *

    public static void fullPyramid(int... n) {
        int size = 0;

        // Checks if function is called with any size argument
        if(n.length != 0) {
            size = n[0];
        } else {
            System.out.print("Enter size of the pyramid: ");
            size = sc.nextInt();  
        }

        for (int i = 0; i < size; i++) {
            // Print spaces
            for (int j = 0; j < size-i-1; j++) {
                System.out.print(" ");
            }

            // Print Stars
            for (int j = 0; j < i+1; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }

    // Q22. Inverted Full Pyramid
    // * * * * *
    //  * * * *
    //   * * *
    //    * *
    //     *

    public static void invertedFullPyramid(int... n) {
        int size = 0;

        // Checks if function is called with any size argument
        if(n.length != 0) {
            size = n[0];
        } else {
            System.out.print("Enter size of the pattern: ");
            size = sc.nextInt();  
        }

        for (int i = 0; i < size; i++) {
            // Printing spaces
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            // Printing stars
            for (int j = 0; j < size-i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // Q23. Dimond Pattern
    //      * 
    //     * * 
    //    * * * 
    //   * * * * 
    //  * * * * *    
    // * * * * * * 
    // * * * * * *  
    //  * * * * *
    //   * * * *
    //    * * *
    //     * *
    //      *

    public static void dimond(int... n) {
        int size = 0;

        // Checks if function is called with any size argument
        if(n.length != 0) {
            size = n[0];
        } else {
            System.out.print("Enter size of the pattern: ");
            size = sc.nextInt();  
        }

        // Full Pyramid + Inverted Pyramid = Dimond
        fullPyramid(size);
        invertedFullPyramid(size);
    }

    // Q24. Hollow Pyramid
    //       * 
    //      * * 
    //     *   * 
    //    *     * 
    //   *       * 
    //  *         * 
    // * * * * * * *

    public static void hollowPyramid(int... n) {
        int size = 0;

        // Checks if function is called with any size argument
        if(n.length != 0) {
            size = n[0];
        } else {
            System.out.print("Enter size of the pyramid: ");
            size = sc.nextInt();  
        }

        for (int i = 0; i < size; i++) {
            // Printing spaces
            for (int j = 0; j < size-i-1; j++) {
                System.out.print(" ");
            }

            // Printing Stars
            for (int j = 0; j < i+1; j++) {
                if (i==0 || i==size-1 || j==0|| i==j) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.println();
        }
    }

    // Q25. Inverted Hollow pyramid
    // * * * * * * * 
    //  *         * 
    //   *       * 
    //    *     * 
    //     *   * 
    //      * * 
    //       *

    public static void invertedHollowPyramid(int... n) {
        int size = 0;

        // Checks if function is called with any size argument
        if(n.length != 0) {
            size = n[0];
        } else {
            System.out.print("Enter size of the pyramid: ");
            size = sc.nextInt();  
        }

        for (int i = 0; i < size; i++) {
            // Printing Spaces
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }            

            // Printing Stars
            for (int j = 0; j < size-i; j++) {
                if (i==0 || i==size-1 || j==0 || j==size-i-1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.println();
        }
    }

    // Q27. Hollow Dimond
    //      * 
    //     * *
    //    *   *
    //   *     *
    //  *       *
    // *         *
    // *         *
    //  *       *
    //   *     *
    //    *   *
    //     * *
    //      *
    
    public static void hollowDiamond(int... n) {
        int size = 0;

        // Checks if function is called with any size argument
        if(n.length != 0) {
            size = n[0];
        } else {
            System.out.print("Enter size: ");
            size = sc.nextInt();  
        }
        
        // Printing Growing Phase
        for (int i = 0; i < size; i++) {
            // Printing spaces
            for (int j = 0; j < size-i-1; j++) {
                System.out.print(" ");
            }

            // Printing Stars
            for (int j = 0; j < i+1; j++) {
                if (i==0 || j==0|| i==j) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.println();
        }

        // Printing Shrinking Phase
        for (int i = 0; i < size; i++) {
            // Printing Spaces
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }            

            // Printing Stars
            for (int j = 0; j < size-i; j++) {
                if (i==size-1 || j==0 || j==size-i-1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.println();
        }

    }

    // Q28. Mix Pyramid
    // * * * * *   * * * * * 
    // * * * *       * * * *
    // * * *           * * *
    // * *               * *
    // *                   *
    // *                   *
    // * *               * *
    // * * *           * * *
    // * * * *       * * * *
    // * * * * *   * * * * *

    public static void mixPyramid(int... n) {
        int size = 0;

        // Checks if function is called with any size argument
        if(n.length != 0) {
            size = n[0];
        } else {
            System.out.print("Enter size: ");
            size = sc.nextInt();  
        }

        // Upright part
        for (int i = 0; i < size; i++) {
            // Printing left Stars
            for (int j = 0; j < size-i; j++) {
                System.out.print("* ");
            }

            // Printing Spaces
            for (int j = 0; j < 2*i+1; j++) {
                System.out.print("  ");
            }

            // Printing right stars
            for (int j = 0; j < size-i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }

        // Inverted Part
        for (int i = 0; i < size; i++) {
            // Printing left stars
            for (int j = 0; j < i+1; j++) {
                System.out.print("* ");
            }

            // Printing Spaces
            for (int j = 0; j < (2*(size-i))-1; j++) {
                System.out.print("  ");
            }

            // Printing right stars
            for (int j = 0; j < i+1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    // Q29. Half Fancy 12 Pattern
    // 1 
    // 2 * 2
    // 3 * 3 * 3
    // 4 * 4 * 4 * 4
    // 5 * 5 * 5 * 5 * 5

    public static void half_fancy_12_pattern(int... n) {
        int size = 0;

        // Checks if function is called with any size argument
        if(n.length != 0) {
            size = n[0];
        } else {
            System.out.print("Enter size of the pattern: ");
            size = sc.nextInt();  
        }

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < i+1; j++) {
                System.out.print(i+1 + " ");
                if (i>j) {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }

    }

    // Q30. Full Fancy 12 Pattern
    // 1 
    // 2 * 2
    // 3 * 3 * 3
    // 4 * 4 * 4 * 4
    // 5 * 5 * 5 * 5 * 5
    // 4 * 4 * 4 * 4
    // 3 * 3 * 3
    // 2 * 2
    // 1 

    public static void full_fancy_12_pattern(int... n) {
        int size = 0;

        // Checks if function is called with any size argument
        if(n.length != 0) {
            size = n[0];
        } else {
            System.out.print("Enter size: ");
            size = sc.nextInt();  
        }

        // Upright pattern
        half_fancy_12_pattern(size);

        // Inverted Part
        for (int i = 0; i < size-1; i++) {
            for (int j = 0; j < size-i-1; j++) {
                System.out.print(size-i-1 + " ");
                if (j<size-i-2) {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }

    }

    // Q31. ABCBA Pattern
    // A 
    // A B A
    // A B C B A
    // A B C D C B A
    // A B C D E D C B A

    public static void ABCBA_pattern(int... n) {
        int size = 0;

        // Checks if function is called with any size argument
        if(n.length != 0) {
            size = n[0];
        } else {
            System.out.print("Enter size of the pyramid: ");
            size = sc.nextInt();  
        }

        for (int i = 0; i < size; i++) {
            // initialize ch with char 'A' - 1 or 64 (ASCII Value)
            char ch = 'A' - 1;
            for (int j = 0; j < 2*i+1; j++) {   
                ch = j>i ? (char)(ch-1) : (char)(ch+1);
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
}