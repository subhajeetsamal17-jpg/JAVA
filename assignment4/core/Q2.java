class Box {
    double width, height, depth;

    Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    double volume() {
        return width * height * depth;
    }
}

public class Q2 {
    public static void main(String[] args) {
        Box b = new Box(5, 4, 3);

        System.out.println("Volume = " + b.volume());
    }
}