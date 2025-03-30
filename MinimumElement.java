import java.util.Scanner;
import java.util.Arrays;

public class MinimumElement {

    // ✅ Method to read a positive integer
    private static int readInteger() {
        Scanner scanner = new Scanner(System.in);
        int count;

        // Validate that count is positive
        do {
            System.out.print("Enter count (positive integer): ");
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter a positive integer.");
                scanner.next();
            }
            count = scanner.nextInt();

            if (count <= 0) {
                System.out.println("Count must be greater than 0.");
            }
        } while (count <= 0);

        return count;
    }

    // ✅ Method to read the elements of the array
    private static int[] readElements(int count) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[count];

        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter a number: ");

            // Validate integer inputs
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter an integer:");
                scanner.next();
            }

            array[i] = scanner.nextInt();
        }
        return array;
    }

    // ✅ Method to find the minimum value using an enhanced for-loop
    private static int findMin(int[] array) {
        int min = Integer.MAX_VALUE;

        for (int num : array) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    // ✅ Main method to run the program
    public static void main(String[] args) {

        // Read the count and elements
        int count = readInteger();
        int[] numbers = readElements(count);

        // Display the array
        System.out.println("\nArray: " + Arrays.toString(numbers));

        // Find and display the minimum value
        int min = findMin(numbers);
        System.out.println("Minimum value: " + min);
    }
}
