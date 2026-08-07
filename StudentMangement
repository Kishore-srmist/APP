import java.util.Scanner;

class Student {
    String name;
    int rollNo;
    String department;

    void getData() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student Name: ");
        name = sc.nextLine();

        System.out.print("Enter Roll Number: ");
        rollNo = sc.nextInt();
        sc.nextLine(); // Consume newline

        System.out.print("Enter Department: ");
        department = sc.nextLine();
    }

    void displayData() {
        System.out.println("\n----- Student Details -----");
        System.out.println("Student Name : " + name);
        System.out.println("Roll Number  : " + rollNo);
        System.out.println("Department   : " + department);
    }
}

public class StudentManagement {
    public static void main(String[] args) {
        Student s = new Student();   // Create object

        s.getData();                 // Read details
        s.displayData();             // Display details
    }
}
