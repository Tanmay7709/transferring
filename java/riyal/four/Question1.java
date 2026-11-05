import java.util.ArrayList;
w
public class Question1 {
    public static void main(String[] args) {
        // Collection to store Student objects
        ArrayList<Student> studentList = new ArrayList<>();

        // Adding Student records
        studentList.add(new Student(1, "Alice", "Computer Science"));
        studentList.add(new Student(2, "Bob", "Information Technology"));
        studentList.add(new Student(3, "Charlie", "Data Science"));

        // Displaying all records
        System.out.println("--- Student Records ---");
        for (Student s : studentList) {
            s.display();
        }
    }
}

class Student {
    int rollNo;
    String name;
    String course;

    public Student(int rollNo, String name, String course) {
        this.rollNo = rollNo;
        this.name = name;
        this.course = course;
    }

    public void display() {
        System.out.println("Roll No: " + rollNo + " | Name: " + name + " | Course: " + course);
    }
}