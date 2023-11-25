import java.util.Scanner;
public class DaysConverter{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("ENter the number of days");
        int days=sc.nextInt();

        int years= days/365;
        int remainingDays= days%365;
        int weeks= remainingDays/7;
        int tdays= remainingDays%7;

        System.out.println(days+"days is equal to");
        System.out.println("years"+years);
        System.out.println("week"+weeks);
        System.out.println("Days"+tdays);
        sc.close();
    }
}