package Program5;

import java.util.Scanner;

public class Program5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of contact entries:");
        int num=Integer.parseInt(sc.nextLine());
        Contact[] contacts=new Contact[num];
        for(int i=0; i<num; i++){
            System.out.print("Enter the name: ");
            String name=sc.nextLine();
            System.out.print("Enter the mobile number: ");
            String mob=sc.nextLine();
            contacts[i]=new Contact(name, mob);
        }
        System.out.println("\nEnter the prefix to check:");
        String prefix=sc.nextLine();
        Contact.findByPrefix(contacts,prefix);
        System.out.println("\nAfter sorting, the contact list becomes:");
        Contact.sortByName(contacts);
        Contact.displayAll(contacts);
        sc.close();
    }
}
