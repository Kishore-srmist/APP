class Student {
    int rollNo;
    String name;
    int age;

    Student(int rollNo, String name, int age) {
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
    }

    void displayStudent() {
        System.out.println("Student Details");
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Course {
    int courseId;
    String courseName;
    int credits;

    Course(int courseId, String courseName, int credits) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.credits = credits;
    }

    void displayCourse() {
        System.out.println("Course Details");
        System.out.println("Course ID: " + courseId);
        System.out.println("Course Name: " + courseName);
        System.out.println("Credits: " + credits);
    }
}

public class Main {
    public static void main(String[] args) {

        Student s = new Student(101, "Arun", 19);
        Course c = new Course(501, "Java Programming", 4);

        s.displayStudent();

        System.out.println();

        c.displayCourse();
    }
}
