import java.util.Scanner;

public class NumberPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input from the user
        System.out.print("Enter the number to be printed:\n");
        int number = scanner.nextInt();

        System.out.print("Max Number of times printed:\n");
        int maxTimes = scanner.nextInt();

        // Print the pattern
        printPattern(number, maxTimes);
    }

    // Helper method to print the pattern
    private static void printPattern(int number, int maxTimes) {
        for (int i = 1; i <= maxTimes * 2 - 1; i++) {
            int count = (i <= maxTimes) ? i : maxTimes * 2 - i;

            for (int j = 1; j <= count; j++) {
                System.out.print(number + " ");
            }

            System.out.println();
        }
    }
}
