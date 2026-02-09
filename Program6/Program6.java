package Program6;

import java.util.Scanner;

public class Program6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        AreaCalculator ar=new AreaCalculator();
        System.out.println("----------Area of Circle----------");
        System.out.print("Enter the radius:");
        float radius=sc.nextFloat();
        System.err.println(ar.area(radius));

        System.out.println("----------Area of Square----------");
        System.out.print("Enter the side:");
        double side=sc.nextDouble();
        System.err.println(ar.area(side));

        System.out.println("----------Area of Rectangle----------");
        System.out.print("Enter the length:");
        double length=sc.nextDouble();
        System.out.print("Enter the breadth:");
        double breadth=sc.nextDouble();
        System.err.println(ar.area(length,breadth));

        System.out.println("----------Area of Triangle----------");
        System.out.print("Enter the base:");
        double base=sc.nextDouble();
        System.out.print("Enter the height:");
        double height=sc.nextDouble();
        System.err.println(ar.area(base,height,true));
        sc.close();
    }
}
