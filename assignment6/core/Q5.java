abstract class Employee {

    int empId;
    String name;
    double basicSalary;

    Employee(int empId, String name, double basicSalary) {
        this.empId = empId;
        this.name = name;
        this.basicSalary = basicSalary;
    }

    abstract double calculateSalary();

    void displayDetails() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Name: " + name);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("Total Salary: " + calculateSalary());
        System.out.println();
    }
}

class Manager extends Employee {

    Manager(int empId, String name, double basicSalary) {
        super(empId, name, basicSalary);
    }

    @Override
    double calculateSalary() {
        double allowance = 0.20 * basicSalary;
        return basicSalary + allowance;
    }
}

class Developer extends Employee {

    Developer(int empId, String name, double basicSalary) {
        super(empId, name, basicSalary);
    }

    @Override
    double calculateSalary() {
        double allowance = 0.10 * basicSalary;
        return basicSalary + allowance;
    }
}

class Q5 {
    public static void main(String[] args) {

        Employee e1 = new Manager(101, "Rahul", 50000);
        Employee e2 = new Developer(102, "Amit", 40000);

        e1.displayDetails();
        e2.displayDetails();
    }
}