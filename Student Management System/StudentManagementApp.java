import java.util.ArrayList;
import java.util.List;

class Student {
    private String studentId;
    private String name;

    public Student(String studentId, String name) {
        this.studentId = studentId;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // Other attributes (e.g., courses enrolled, grades)...
    // Getters and setters for other attributes...
}

class Course {
    private String courseId;
    private String courseName;
    private List<Student> enrolledStudents = new ArrayList<>();
    private Teacher teacher;

    public Course(String courseId, String courseName) {
        this.courseId = courseId;
        this.courseName = courseName;
    }

    public void enrollStudent(Student student) {
        enrolledStudents.add(student);
    }

    public void assignGrade(Student student, String grade) {
        // Implement grade assignment logic here
        // For example: store grades in a map or list
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public List<Student> getEnrolledStudents() {
        return enrolledStudents;
    }

    public String getGrade(Student student) {
        // Retrieve the grade for the given student
        // Implement logic to fetch the grade
        return "N/A"; // Placeholder value
    }

    public Teacher getTeacher() {
        return teacher;
    }
}

class Teacher {
    private String teacherId;
    private String name;

    public Teacher(String teacherId, String name) {
        this.teacherId = teacherId;
        this.name = name;
    }

    // Other attributes (e.g., courses taught)...
    // Getters and setters for other attributes...
}

public class StudentManagementApp {
    public static void main(String[] args) {
        // Create students
        Student student1 = new Student("S101", "Alice");
        Student student2 = new Student("S102", "Bob");

        // Create courses
        Course mathCourse = new Course("C101", "Mathematics");
        Course physicsCourse = new Course("C102", "Physics");

        // Create teachers
        Teacher mathTeacher = new Teacher("T201", "Dr. Smith");
        Teacher physicsTeacher = new Teacher("T202", "Prof. Johnson");

        // Enroll students in courses
        mathCourse.enrollStudent(student1);
        mathCourse.enrollStudent(student2);
        physicsCourse.enrollStudent(student2);

        // Assign grades (you can add this method in the Course class)
        mathCourse.assignGrade(student1, "A");
        mathCourse.assignGrade(student2, "B");
        physicsCourse.assignGrade(student2, "B");

        // Manage teacher information (you can add this method in the Course class)
        mathCourse.setTeacher(mathTeacher);
        physicsCourse.setTeacher(physicsTeacher);

        // Display information
        System.out.println("Math Course:");
        System.out.println("Enrolled students: " + mathCourse.getEnrolledStudents());
        System.out.println("Assigned grade for " + student1.getName() + ": " + mathCourse.getGrade(student1));
        System.out.println("Assigned grade for " + student2.getName() + ": " + mathCourse.getGrade(student2));
        System.out.println("Teacher: " + mathCourse.getTeacher().getName());

        System.out.println("\nPhysics Course:");
        System.out.println("Enrolled students: " + physicsCourse.getEnrolledStudents());
        System.out.println("Assigned grade for " + student2.getName() + ": " + physicsCourse.getGrade(student2));
        System.out.println("Teacher: " + physicsCourse.getTeacher().getName());
    }
}







