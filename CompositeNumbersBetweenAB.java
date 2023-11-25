import java.util.Scanner;

public class CompositeNumbersBetweenAB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input from the user
        System.out.print("A = ");
        int A = scanner.nextInt();

        System.out.print("B = ");
        int B = scanner.nextInt();

        // Validate input and print composite numbers
        if (A < B) {
            printCompositeNumbers(A, B);
        } else {
            System.out.println("Invalid input. A should be less than B.");
        }
    }

    // Helper method to check if a number is composite
    private static boolean isComposite(int num) {
        if (num <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return true;
            }
        }

        return false;
    }

    // Helper method to print composite numbers between A and B
    private static void printCompositeNumbers(int A, int B) {
        System.out.print("Composite Numbers between " + A + " and " + B + ": ");
        for (int i = A; i <= B; i++) {
            if (isComposite(i)) {
                System.out.print(i + " ");
            }
        }
    }
}
