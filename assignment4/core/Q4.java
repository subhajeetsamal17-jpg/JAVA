class Point {
    int xCo, yCo;

    Point(int xCo, int yCo) {
        this.xCo = xCo;
        this.yCo = yCo;
    }

    double distanceBetPoints(Point p) {
        return Math.sqrt(
                Math.pow((p.xCo - this.xCo), 2)
              + Math.pow((p.yCo - this.yCo), 2));
    }
}

public class Q4 {
    public static void main(String[] args) {

        Point p1 = new Point(2, 3);
        Point p2 = new Point(6, 7);

        System.out.println("Distance = "
                + p1.distanceBetPoints(p2));
    }
}