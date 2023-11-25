import java.util.Scanner;

public class UsernameValidator {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the user name: ");
        String username1 = scanner.nextLine();
        
        System.out.print("Reenter the user name: ");
        String username2 = scanner.nextLine();
        
        
        if (username1.equals(username2) && isUsernameValid(username1)) {
            System.out.println("User name is valid");
        } else {
            System.out.println("User name is Invalid");
        }
        
        scanner.close();
    }

    
    private static boolean isUsernameValid(String username) {
        return username.matches("[a-zA-Z0-9]+@[0-9]+");
    }
}
