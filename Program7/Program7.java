package Program7;

import java.util.Scanner;

public class Program7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of instructors: ");
        int n=Integer.parseInt(sc.nextLine());
        Instuctor[] instuctors=new Instuctor[n];
        for(int i=0;i<n;i++){
            System.out.print("Enter Name: ");
            String name=sc.nextLine();
            System.out.print("Enter salary: ");
            double salary=Double.parseDouble(sc.nextLine());
            System.out.print("Enter address: ");
            String address=sc.nextLine();
            System.out.print("Enter department: ");
            String department=sc.nextLine();
            System.out.print("Enter Subject: ");
            String subject=sc.nextLine();
            instuctors[i]=new Instuctor(i, name, salary, address, department, subject);
            System.out.println("==========================");
        }
        System.out.println("\nCONTACT DETAILS: \n");
        for(int i=0;i<n;i++){
            instuctors[i].display();
            System.out.println("-------------------------------------------------------------------------------------------------------");
        }
        sc.close();
    }
}
