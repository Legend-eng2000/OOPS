import java.util.Scanner;

public class Program13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String correctUsername = "Admin";
        String correctPassword = "1234";

        System.out.print("Enter username: ");
        String username = sc.nextLine();
        System.out.print("Enter password: ");
        String password = sc.nextLine();

        try {
            if (!username.equals(correctUsername) && !password.equals(correctPassword)) {
                throw new InvalidLoginException("Invalid Username and Password!");
            }else if(!username.equals(correctUsername)){
                throw new InvalidLoginException("Invalid Username!");
            }else if(!password.equals(correctPassword)){
                throw new InvalidLoginException("Invalid Password!");
            }
            System.out.println("Login Successful!");

        } catch (InvalidLoginException e) {
            System.out.println("Exception: " + e.getMessage());
        }
        sc.close();
    }    
}
