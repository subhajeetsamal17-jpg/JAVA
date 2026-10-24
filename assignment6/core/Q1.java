import java.util.*;
abstract class Figure {
    double dim1, dim2;

    Figure(double dim1, double dim2) {
        this.dim1 = dim1;
        this.dim2 = dim2;
    }

    abstract void getArea();
}

class Rectangle extends Figure {

    Rectangle(double length, double breadth) {
        super(length, breadth);
    }

   
    void getArea() {
        System.out.println("Area of Rectangle = " + (dim1 * dim2));
    }
}

class Triangle extends Figure {

    Triangle(double base, double height) {
        super(base, height);
    }

    
    void getArea() {
        System.out.println("Area of Triangle = " + (0.5 * dim1 * dim2));
    }
}

class Q1 {
    public static void main(String[] args) {

        Figure f;

        f = new Rectangle(10, 5);
        f.getArea();

        f = new Triangle(10, 5);
        f.getArea();
    }
}