import java.util.Scanner;

class ComplexNum {
    int real, img;

    // Parameterized constructor
    ComplexNum(int real, int img) {
        this.real = real;
        this.img = img;
    }

    void displayCompNumber() {
        System.out.println(real + "+" + img + "i");
    }

    ComplexNum addCompNumber(ComplexNum c) {
        return new ComplexNum(this.real + c.real,
                              this.img + c.img);
    }
}

public class Q3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter real part of first complex number: ");
        int r1 = sc.nextInt();

        System.out.print("Enter imaginary part of first complex number: ");
        int i1 = sc.nextInt();

        System.out.print("Enter real part of second complex number: ");
        int r2 = sc.nextInt();

        System.out.print("Enter imaginary part of second complex number: ");
        int i2 = sc.nextInt();

        ComplexNum c1 = new ComplexNum(r1, i1);
        ComplexNum c2 = new ComplexNum(r2, i2);

        System.out.print("First Complex Number: ");
        c1.displayCompNumber();

        System.out.print("Second Complex Number: ");
        c2.displayCompNumber();

        ComplexNum result = c1.addCompNumber(c2);

        System.out.print("Sum: ");
        result.displayCompNumber();

        sc.close();
    }
}