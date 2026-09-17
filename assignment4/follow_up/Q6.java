import java.util.Scanner;

class Complex {
    int real, imaginary;

    void initialise() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Real Part: ");
        real = sc.nextInt();

        System.out.print("Imaginary Part: ");
        imaginary = sc.nextInt();
    }

    void show() {
        System.out.println(real + "+" + imaginary + "i");
    }

    Complex add(Complex c) {
        Complex temp = new Complex();

        temp.real = this.real + c.real;
        temp.imaginary = this.imaginary + c.imaginary;

        return temp;
    }
}
public class Q6{
    public static void main(String[] args) {

        Complex c1 = new Complex();
        Complex c2 = new Complex();

        c1.initialise();
        c2.initialise();

        Complex sum = c1.add(c2);

        System.out.print("Result = ");
        sum.show();
    }
}