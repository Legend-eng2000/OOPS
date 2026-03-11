package Program14;

import java.util.Scanner;

public class Program14 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        MyStack<Integer> intStack = new MyStack<>(5);
        System.out.print("Number of elements to insert:");
        int len=sc.nextInt();
        System.out.println("Enter elements: ");
        for(int i=0;i<len;i++){
            intStack.push(sc.nextInt());
        }
        System.out.print("Elements are: ");
        intStack.display();
        System.out.println("\nDeleted Element: "+intStack.pop());
        System.out.print("Now, Elements are: ");
        intStack.display();
        sc.close();
    }    
}
