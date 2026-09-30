import java.util.Scanner;

class Vehicle {
    String vehicleNumber;
    double fuelConsumed;

    Vehicle(String vehicleNumber, double fuelConsumed) {
        this.vehicleNumber = vehicleNumber;
        this.fuelConsumed = fuelConsumed;
    }

    void display() {
        System.out.println("Vehicle Number : " + vehicleNumber);
        System.out.println("Fuel Consumed  : " + fuelConsumed);
    }

    double mileage() {
        return 0;
    }
}

class Car extends Vehicle {
    double distanceTravelled;

    Car(String vehicleNumber, double fuelConsumed, double distanceTravelled) {
        super(vehicleNumber, fuelConsumed);
        this.distanceTravelled = distanceTravelled;
    }

    void display() {
        super.display();
        System.out.println("Distance Travelled : " + distanceTravelled);
    }

    double mileage() {
        return distanceTravelled / fuelConsumed;
    }
}

class ElectricCar extends Car {
    double batteryBackup;

    ElectricCar(String vehicleNumber, double fuelConsumed,
                double distanceTravelled, double batteryBackup) {
        super(vehicleNumber, fuelConsumed, distanceTravelled);
        this.batteryBackup = batteryBackup;
    }

    void display() {
        super.display();
        System.out.println("Battery Backup : " + batteryBackup);
        System.out.println("Mileage        : " + mileage());
        System.out.println();
    }
}

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of vehicles: ");
        int n = sc.nextInt();

        ElectricCar[] cars = new ElectricCar[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details of vehicle " + (i + 1));

            sc.nextLine();
            System.out.print("Vehicle Number: ");
            String number = sc.nextLine();

            System.out.print("Fuel Consumed: ");
            double fuel = sc.nextDouble();

            System.out.print("Distance Travelled: ");
            double distance = sc.nextDouble();

            System.out.print("Battery Backup: ");
            double battery = sc.nextDouble();

            cars[i] = new ElectricCar(number, fuel, distance, battery);
        }

        System.out.println("\n--- VEHICLE DETAILS ---");

        int highest = 0;

        for (int i = 0; i < n; i++) {
            cars[i].display();

            if (cars[i].mileage() > cars[highest].mileage()) {
                highest = i;
            }
        }

        System.out.println("--- VEHICLE WITH HIGHEST MILEAGE ---");
        cars[highest].display();

        sc.close();
    }
}