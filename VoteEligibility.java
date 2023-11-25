import java.util.Scanner;
public class VoteEligibility{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the age:\n");
        if(scanner.hasNextInt()){
        int age=scanner.nextInt();
        
        if (age>=18){
            System.out.println("You are eligible to vote");
        }
        else{
            System.out.println("You are not eligible to vote ");
        }
        }
        else{
            System.out.println("This is a invalid format ");
        }
        
        scanner.close();
    }
}