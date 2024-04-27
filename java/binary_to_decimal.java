import java.util.Scanner;

class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a binary number: ");
        long binary = scanner.nextLong();
        scanner.close();

        // Method 1
        System.out.println("The decimal representation is: " + binaryToDecimalBitwise(binary));

        // Method 2
        System.out.println("The decimal representation is: " + binaryToDecimalDivision(binary));
    }

    // Method 1: Using bitwise operators (optimal)
    public static int binaryToDecimalBitwise(long binary) {
        int decimal = 0;
        int i = 0;

        while (binary > 0) {
            long remainder = (binary & 1);
            decimal = (int) (remainder * Math.pow(2, i++)) + decimal;
            binary /= 10;
        }

        return decimal;
    }

    // Method 2: Using division method
    public static int binaryToDecimalDivision(long binary) {
        int decimal = 0;
        int i = 0;

        while (binary > 0) {
            long remainder = binary % 10;   // to remove the last bit
            decimal = (int) (remainder * Math.pow(2, i++)) + decimal;
            binary /= 10;
        }

        return decimal;
    }
}
