class Figure {
    double dim1;
    double dim2;

    Figure(double dim1, double dim2) {
        this.dim1 = dim1;
        this.dim2 = dim2;
    }

    double area() {
        return dim1 * dim2;
    }
}

class Rectangle extends Figure {

    Rectangle(double length, double breadth) {
        super(length, breadth);
    }

    double area() {
        return dim1 * dim2;
    }
}

class Triangle extends Figure {

    Triangle(double base, double height) {
        super(base, height);
    }

    double area() {
        return 0.5 * dim1 * dim2;
    }
}

class Square extends Figure {

    Square(double side) {
        super(side, side);
    }

    double area() {
        return dim1 * dim1;
    }
}

public class Q4 {
    public static void main(String[] args) {

        Rectangle r = new Rectangle(10, 5);
        Triangle t = new Triangle(10, 6);
        Square s = new Square(5);

        System.out.println("Area of Rectangle : " + r.area());
        System.out.println("Area of Triangle  : " + t.area());
        System.out.println("Area of Square    : " + s.area());
    }
}