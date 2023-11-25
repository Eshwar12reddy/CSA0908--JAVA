import java.util.Scanner;
public class SIC {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);

        System.out.print("Enter the principal amount\n");
        double principal=scanner.nextDouble();

        System.out.print("Enter the number of years\n");
        int year =scanner.nextInt();

        System.out.print("Is customer is a senior citizen (y/n)\n");
        char senior=scanner.next().charAt(0);

        double interest = calculateSIC(principal,year,senior);
        System.out.println("Interes="+interest);
        scanner.close();
    }
    private static double calculateSIC(double principal,int year,char senior){
        double rateofinterest;
        if (senior == 'y'||senior=='Y'){
            rateofinterest= 0.12;
        }
        else{
            rateofinterest=0.10;
        }
        return principal*rateofinterest*year;
    }
}