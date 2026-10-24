class Point2D {
    private int x;
    private int y;

    Point2D() {
        x = 0;
        y = 0;
    }

    Point2D(int x, int y) {
        this.x = x;
        this.y = y;
    }

    int getX() {
        return x;
    }

    int getY() {
        return y;
    }

    void setX(int x) {
        this.x = x;
    }

    void setY(int y) {
        this.y = y;
    }

    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}

class Circle extends Point2D {
    private double radius;
    private String color;

    Circle() {
        super();
        radius = 1.0;
        color = "red";
    }

    Circle(int x, int y, double radius, String color) {
        super(x, y);
        this.radius = radius;
        this.color = color;
    }

    double getRadius() {
        return radius;
    }

    void setRadius(double radius) {
        this.radius = radius;
    }

    String getColor() {
        return color;
    }

    void setColor(String color) {
        this.color = color;
    }

    double getArea() {
        return Math.PI * radius * radius;
    }

    public String toString() {
        return "Circle[Center = " + super.toString()
                + ", radius = " + radius
                + ", color = " + color + "]";
    }
}

class Cylinder extends Circle {
    private double height;

    Cylinder() {
        super();
        height = 1.0;
    }

    Cylinder(int x, int y, double radius,
             String color, double height) {

        super(x, y, radius, color);
        this.height = height;
    }

    double getHeight() {
        return height;
    }

    void setHeight(double height) {
        this.height = height;
    }

    double getVolume() {
        return getArea() * height;
    }

    public String toString() {
        return "Cylinder[Base = " + super.toString()
                + ", height = " + height + "]";
    }
}

public class Q1 {
    public static void main(String[] args) {

        Circle c = new Circle(2, 3, 5, "Blue");

        System.out.println(c);
        System.out.println("Radius : " + c.getRadius());
        System.out.println("Color  : " + c.getColor());
        System.out.println("Area   : " + c.getArea());

        System.out.println();

        Cylinder cy =
                new Cylinder(2, 3, 5, "Green", 10);

        System.out.println(cy);
        System.out.println("Radius : " + cy.getRadius());
        System.out.println("Color  : " + cy.getColor());
        System.out.println("Height : " + cy.getHeight());
        System.out.println("Area   : " + cy.getArea());
        System.out.println("Volume : " + cy.getVolume());
    }
}