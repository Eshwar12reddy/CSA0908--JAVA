import java.util.Scanner;

public class DecimalToBinaryOctalConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input from the user
        System.out.print("Decimal Number:\n");
        int decimalNumber = scanner.nextInt();

        // Convert to binary and octal
        String binary = convertToBinary(decimalNumber);
        String octal = convertToOctal(decimalNumber);

        // Display the results
        System.out.println("Binary Equivalent: " + binary);
        System.out.println("Octal Equivalent: " + octal);
    }

    // Helper method to convert decimal to binary
    private static String convertToBinary(int decimalNumber) {
        return Integer.toBinaryString(decimalNumber);
    }

    // Helper method to convert decimal to octal
    private static String convertToOctal(int decimalNumber) {
        return Integer.toOctalString(decimalNumber);
    }
}
