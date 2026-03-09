package Program16;

import java.util.Scanner;

public class Student {
    String name;
    Integer age;
    int rank;
    void getValues(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter name: ");
        name=sc.nextLine();
        System.out.print("Enter Age: ");
        age=Integer.parseInt(sc.nextLine());
        System.out.print("Enter rank: ");
        rank=Integer.parseInt(sc.nextLine());
        
    }
    void display(){
        System.out.println("NAME: "+name);
        System.out.println("AGE: "+age);
        System.out.println("RANK: "+rank);
    }
}
 