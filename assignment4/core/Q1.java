import java.util.Scanner;

class Area {
    int length, breadth;

    void setDim(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    int getArea() {
        return length * breadth;
    }
}

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length: ");
        int l = sc.nextInt();

        System.out.print("Enter breadth: ");
        int b = sc.nextInt();

        Area obj = new Area();
        obj.setDim(l, b);

        System.out.println("Area = " + obj.getArea());
    }
}