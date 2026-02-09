package Program6;

public class AreaCalculator {
    double area(double side){
        return side*side;
    }
    double area(double length,double breadth){
        return length*breadth;
    }
    double area(float radius){
        double pi=22.0/7;
        return pi*radius*radius;
    }
    double area(double base,double height,boolean isTriangle){
        return 0.5*base*height;
    }
}
