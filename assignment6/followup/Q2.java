abstract class Student {

    int rollNo;
    String name;
    double marks;

    Student(int rollNo, String name, double marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    abstract char calculateGrade();

    void displayDetails() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + calculateGrade());
        System.out.println();
    }
}

class UndergraduateStudent extends Student {

    UndergraduateStudent(int rollNo, String name, double marks) {
        super(rollNo, name, marks);
    }

    
    char calculateGrade() {

        if (marks >= 90)
            return 'O'
        else if (marks >= 80&&marks<90)
            return 'E'
        else if (marks >= 70&&marks<80)
            return 'A'
        else if (marks >= 60&&marks<70)
            return 'B'
        else
            return 'F';
    }
}

class PostgraduateStudent extends Student {

    PostgraduateStudent(int rollNo, String name, double marks) {
        super(rollNo, name, marks);
    }

   
    char calculateGrade() {

        if (marks >= )
            return 'O';
        else if (marks >= 75)
            return 'B';
        else if (marks >= 65)
            return 'C';
        else if (marks >= 55)
            return 'D';
        else
            return 'F';
    }
}

class Q2{
    public static void main(String[] args) {

        Student s1 =
            new UndergraduateStudent(101, "Rahul", 86);

        Student s2 =
            new PostgraduateStudent(102, "Amit", 78);

        s1.displayDetails();
        s2.displayDetails();
    }
}