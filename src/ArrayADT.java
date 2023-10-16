import java.util.Scanner;

class MyArray {
    private int totalSize;
    private int usedSize;
    private int[] array;

    public MyArray(int tSize, int uSize) {
        totalSize = tSize;
        usedSize = uSize;
        array = new int[tSize];
    }

    public void show() {
        for (int i = 0; i < usedSize; i++) {
            System.out.println(array[i]);
        }
    }

    public void setVal(Scanner scanner) {
        for (int i = 0; i < usedSize; i++) {
            System.out.print("Enter element " + i + ": ");
            int n = scanner.nextInt();
            array[i] = n;
        }
    }
}

public class ArrayADT {
    public static void main(String[] args) {
        MyArray marks = new MyArray(10, 2);
        System.out.println("We are running setVal now");
        Scanner scanner = new Scanner(System.in);
        marks.setVal(scanner);

        System.out.println("We are running show now");
        marks.show();

        scanner.close();
    }
}
