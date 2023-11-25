import java.util.Scanner;

public class NumberPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      
        System.out.print("Enter the number of rows: ");
        int numRows = scanner.nextInt();

        for (int i = 0; i < numRows; i++) {
         
            for (int j = 0; j < numRows - i - 1; j++) {
                System.out.print("\t");
            }
            int number = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(number + "\t\t");
                number = number * (i - j) / (j + 1);
            }


            System.out.println();
        }

        scanner.close();
    }
}
