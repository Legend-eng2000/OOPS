package Program9;

import java.util.Scanner;

public class Program9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the radius of circle:");
        Shape c1=new Circle(sc.nextDouble());
        System.out.println("AREA: "+c1.area()+"\tPERIMETER: "+c1.perimeter());
        System.out.print("Enter the length and breadth of rectangle: ");
        Shape r1=new Rectangle(sc.nextDouble(),sc.nextDouble());
        System.out.println("AREA: "+r1.area()+"\tPERIMETER: "+r1.perimeter());
        sc.close();
    }
}
