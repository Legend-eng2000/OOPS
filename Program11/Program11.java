package Program11;

import java.util.Scanner;

public class Program11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter roll number: ");
        int rollNo=sc.nextInt();
        System.out.println("Enter Academic and Sports score: ");
        Result r = new Result(rollNo, sc.nextInt(), sc.nextInt());
        r.display();
        sc.close();
    }
}
