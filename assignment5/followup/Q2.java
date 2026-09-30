class Point2D {
    int x;
    int y;

    // Default constructor
    Point2D() {
        x = 0;
        y = 0;
    }

    // Parameterized constructor
    Point2D(int x, int y) {
        this.x = x;
        this.y = y;
    }

    void display() {
        System.out.println("X = " + x);
        System.out.println("Y = " + y);
    }
}

class Point3D extends Point2D {
    int z;

    Point3D() {
        super();
        z = 0;
    }

    Point3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    void show() {
        System.out.println("X = " + x);
        System.out.println("Y = " + y);
        System.out.println("Z = " + z);
    }
}

public class Q2 {
    public static void main(String[] args) {

        Point2D p1 = new Point2D();

        System.out.println("Point2D using default constructor:");
        p1.display();

        System.out.println();

        Point2D p2 = new Point2D(10, 20);

        System.out.println("Point2D using parameterized constructor:");
        p2.display();

        System.out.println();

        Point3D p3 = new Point3D(10, 20, 30);

        System.out.println("Point3D:");
        p3.show();
    }
}