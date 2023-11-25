import java.util.Scanner;
public class LCM_GCD{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first num");
        int a=sc.nextInt();
        System.out.print("Enter the second number");
        int b = sc.nextInt();
        int gcd=findGCD(a,b);
        int lcm=findLcm(a,b);
        System.out.println("The Gcd of a and b is "+ gcd);
        System.out.println("THe lcm of a and b is "+lcm);
        sc.close();
    }
    public static int findGCD(int a, int b){
        if(b==0)
        {
            return a;
        }
        return findGCD(b, a%b);
    }
    public static int findLcm(int a,int b){
        return(a*b)/findGCD(a, b);
    }
}