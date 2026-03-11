
package Program12;

import java.util.Scanner;

public class Program12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter category (1-Literature, 2-Fiction): ");
        int choice = sc.nextInt();
        sc.nextLine();
        if (choice == 1) {
            Literature l = new Literature();
            l.getBook(sc);
            l.display();
        } else if (choice == 2) {
            Fiction f = new Fiction();
            f.getBook(sc);
            f.display();
        } else {
            System.out.println("Invalid choice");
        }
        sc.close();
    }
}