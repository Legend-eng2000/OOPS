package Program8;

import java.util.Scanner;

public class Program8 {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of instructors: ");
        int n=Integer.parseInt(sc.nextLine());
        Instructor[] instuctors=new Instructor[n];
        for(int i=0;i<n;i++){
            System.out.print("Enter instructor ID: ");
            int instructorId=Integer.parseInt(sc.nextLine());
            System.out.print("Enter Name: ");
            String name=sc.nextLine();
            System.out.print("Enter Gender: ");
            String gender=sc.nextLine();
            System.out.print("Enter age: ");
            int age=Integer.parseInt(sc.nextLine());
            System.out.print("Enter salary: ");
            double salary=Double.parseDouble(sc.nextLine());
            System.out.print("Enter address: ");
            String address=sc.nextLine();
            System.out.print("Enter department: ");
            String department=sc.nextLine();
            System.out.print("Enter Subject: ");
            String subject=sc.nextLine();
            instuctors[i]=new Instructor(i,instructorId, name, gender, age, salary, address, subject, department);
            System.out.println("==========================");
        }
        System.out.println("\nCONTACT DETAILS: \n");
        for(int i=0;i<n;i++){
            instuctors[i].display();
            System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        }
        sc.close();
    }
}
