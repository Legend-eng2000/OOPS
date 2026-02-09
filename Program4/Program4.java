package Program4;

import java.util.Scanner;

public class Program4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str=sc.nextLine();
        EnhancedString strOP=new EnhancedString(str);
        System.out.println("String Reversed: "+EnhancedString.reverseString(str));
        System.out.println("Word Reversed: "+strOP.revWord());
        System.out.print("Enter the character: ");
        char ch=sc.next().charAt(0);
        System.out.println("Character "+ch+" occured "+strOP.charCount(ch)+" times");
        strOP.titleCase();
        sc.close();
    }
}
