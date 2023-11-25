import java.util.Scanner;

public class SquareRoot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input from the user
        System.out.print("Enter the number: ");
        int number = scanner.nextInt();

        // Find the square root
        String squareRoots = findSquareRoots(number);

        // Display the result
        System.out.println("Square Root: " + squareRoots);
    }

    // Helper method to find square roots (positive and negative) of a perfect square
    private static String findSquareRoots(int number) {
        if (number < 0) {
            return "No square roots for negative numbers.";
        }

        double squareRoot = Math.sqrt(number);

        // Check if the number is a perfect square
        if (squareRoot == (int) squareRoot) {
            int positiveRoot = (int) squareRoot;
            int negativeRoot = -positiveRoot;

            return positiveRoot + ", " + negativeRoot;
        } else {
            return "No square roots for non-perfect square numbers.";
        }
    }
}
