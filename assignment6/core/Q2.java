import java.util.*;
abstract class Bank {
    abstract double getROI();
}

class SBI extends Bank {

    
    double getROI() {
        return 7.0;
    }
}

class PNB extends Bank {

    
    double getROI() {
        return 7.5;
    }
}

class BOI extends Bank {

    
    double getROI() {
        return 7.2;
    }
}

class Q2 {
    public static void main(String[] args) {

        Bank b;

        b = new SBI();
        System.out.println("SBI Rate of Interest = " + b.getROI() + "%");

        b = new PNB();
        System.out.println("PNB Rate of Interest = " + b.getROI() + "%");

        b = new BOI();
        System.out.println("BOI Rate of Interest = " + b.getROI() + "%");
    }
}