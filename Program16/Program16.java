package Program16;

import java.util.HashMap;
import java.util.Scanner;

public class Program16 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        HashMap<String,Student> map=new HashMap<>();
        while (true) {
            System.out.println("\n1.Push \t 2.Search \t 3.Remove \t 4.Exit");
            System.out.print("Enter your choice: ");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    HashFunctions.pushValue(map);
                    break;
                case 2:
                    Student s=HashFunctions.searchStudent(map,sc);
                    if(s != null){
                        s.display();
                    }else{
                        System.out.println("No such student exists.");
                    }
                    break;
                case 3:
                    HashFunctions.removeStudent(map,sc);
                    break;
                case 4:
                    System.out.println("Exiting the program...");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid Choice !");
                    break;
            }
        }
    }
}
