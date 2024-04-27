import java.util.Scanner;

class DecimalToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a decimal number: ");
        int decimal = scanner.nextInt();
        scanner.close();

        // Method 1
        System.out.println("The binary representation is: " + decimalTooBinaryBitwise(decimal));

        // Method 2
        System.out.println("The binary representation is: " + decimalToBinaryDivision(decimal));
    }

    // Method 1: Using bitwise operators (optimal)
    public static int decimalTooBinaryBitwise(int dec) {
        int binary = 0;
        int i = 0;

        while (dec > 0) {
            int rem = (dec & 1);
            // typecase to int because -
            // Math.pow may returns a double number
            binary = (int) (rem * Math.pow(10, i++)) + binary;
            dec = (dec >> 1);
        }

        return binary;
    }

    // Method 2: Using division method
    public static int decimalToBinaryDivision(int dec) {
        int binary = 0;
        int i = 0;

        while (dec > 0) {
            int remainder = dec % 2;
            // typecase to int because -
            // Math.pow may returns a double number
            binary = (int) (remainder * Math.pow(10, i++)) + binary;
            dec /= 2;
        }

        return binary;
    }
}
