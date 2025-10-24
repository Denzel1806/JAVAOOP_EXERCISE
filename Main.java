import java.util.ArrayList;

class School {
    private ArrayList<String> students;
    private ArrayList<String> teachers;
    private ArrayList<String> classes;

    public School() {
        students = new ArrayList<>();
        teachers = new ArrayList<>();
        classes = new ArrayList<>();
    }

    public void addStudent(String student) {
        students.add(student);
        System.out.println("Student added: " + student);
    }

    public void removeStudent(String student) {
        if(students.remove(student)) {
            System.out.println("Student removed: " + student);
        } else {
            System.out.println("Student not found: " + student);
        }
    }

    public void addTeacher(String teacher) {
        teachers.add(teacher);
        System.out.println("Teacher added: " + teacher);
    }

    public void removeTeacher(String teacher) {
        if(teachers.remove(teacher)) {
            System.out.println("Teacher removed: " + teacher);
        } else {
            System.out.println("Teacher not found: " + teacher);
        }
    }

    public void createClass(String className) {
        classes.add(className);
        System.out.println("Class created: " + className);
    }

    public void showDetails() {
        System.out.println("\n--- School Details ---");
        System.out.println("Students: " + students);
        System.out.println("Teachers: " + teachers);
        System.out.println("Classes: " + classes);
    }
}

public class Main {
    public static void main(String[] args) {
        School school = new School();

        school.addStudent("John");
        school.addStudent("Maria");
        school.addTeacher("Mrs. Reyes");
        school.createClass("Math 101");

        school.showDetails();

        school.removeStudent("John");
        school.removeTeacher("Mr. Cruz");

        school.showDetails();
    }
}
