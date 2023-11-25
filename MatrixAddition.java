import java.util.Scanner;
public class MatrixAddition {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         System.out.print("enter the elements of matrix");

         int mat1=sc.nextInt();
         System.out.print("Enter the columns");
         int col=sc.nextInt();
         
        int[][] a = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] b = {{10, 11, 12}, {13, 14, 15}, {16, 17, 18}};
        int[][] c = new int[3][3];

        for (int i = 0; i < 3; i++) { 
            for (int j = 0; j < 3; j++) {
                c[i][j] = a[i][j] + b[i][j];
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }
}
