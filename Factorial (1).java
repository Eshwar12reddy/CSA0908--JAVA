import java.util.Scanner;
public class Factorial{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);

        System.out.print("Enter the number");
        if(scanner.hasNextInt()){
            int n = scanner.nextInt();
            if (n >=0){
                long fact = calculateFact(n);
                System.out.println("Factorial="+fact);
            }
            else{
                System.out.print("Enter a non negative number");
            }
        }
        else{
            System.out.println("Enter a Valid number");
        }
        scanner.close();
    }
    private static long calculateFact(int n){
        if (n==1 || n==0)
        {
            return 1;
        }
        else{
            return n*calculateFact(n-1);
        }
    }
}