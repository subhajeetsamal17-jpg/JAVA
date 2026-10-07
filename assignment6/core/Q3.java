import java.util.*;
abstract class Shape {

    abstract void RectangleArea(double length, double breadth);
    abstract void SquareArea(double side);
	abstract void CircleArea(double radius);
}

class Area extends Shape {

   
    void RectangleArea(double length, double breadth) {
        System.out.println("Area of Rectangle = " + (length * breadth));
    }

    
    void SquareArea(double side) {
        System.out.println("Area of Square = " + (side * side));
    }


    void CircleArea(double radius) {
        System.out.println("Area of Circle = " + (Math.PI * radius * radius));
    }
}
class Q3{
    public static void main(String[] args) {

        Area a = new Area();

        a.RectangleArea(10, 5);
        a.SquareArea(5);
        a.CircleArea(7);
    }
}