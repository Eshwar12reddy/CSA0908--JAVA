import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Initialize denominations and their respective counts
        int[] denominations = {2000, 500, 200, 100};
        int[] notesCount = new int[4];

        // Take input from the user
        for (int i = 0; i < denominations.length; i++) {
            System.out.print("Enter the " + (i + 1) + " Denomination: ");
            int denomination = scanner.nextInt();

            // Validate user input for denomination
            if (isValidDenomination(denomination, denominations)) {
                System.out.print("Enter the " + (i + 1) + " Denomination number of notes: ");
                notesCount[i] = scanner.nextInt();
            } else {
                System.out.println("Invalid denomination. Please enter a valid denomination.");
                i--; // Decrement i to re-enter the current denomination
            }
        }

        // Calculate total available balance
        int totalBalance = calculateTotalBalance(denominations, notesCount);

        // Display the result
        System.out.println("Total Available Balance in ATM: " + totalBalance);
    }

    // Helper method to check if the entered denomination is valid
    private static boolean isValidDenomination(int denomination, int[] denominations) {
        for (int validDenomination : denominations) {
            if (denomination == validDenomination) {
                return true;
            }
        }
        return false;
    }

    // Helper method to calculate the total available balance
    private static int calculateTotalBalance(int[] denominations, int[] notesCount) {
        int totalBalance = 0;
        for (int i = 0; i < denominations.length; i++) {
            totalBalance += denominations[i] * notesCount[i];
        }
        return totalBalance;
    }
}
