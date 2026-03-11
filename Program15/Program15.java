package Program15;

import java.util.HashMap;
import java.util.Scanner;

public class Program15 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        HashMap<Integer,Integer> map=new HashMap<>();
        while (true) {
            System.out.println("\n 1.Push \t 2.Search \t 3.Remove \t 4.Update \t 5.Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    HashFunctions.pushValue(map,sc);
                    break;
                case 2:
                    int mark=HashFunctions.searchMark(map,sc);
                    if(mark != -1){
                        System.out.println("Mark is: "+mark);
                    }else{
                        System.out.println("No such student exists.");
                    }
                    break;
                case 3:
                    HashFunctions.removeStudent(map,sc);
                    break;
                case 4:
                    HashFunctions.pushValue(map, sc);
                    break;
                case 5:
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
