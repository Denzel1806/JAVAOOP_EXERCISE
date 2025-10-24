import java.util.ArrayList;

 
 public class Student {
     // Attributes
     private String name;
     private String grade;
     private ArrayList<String> courses;

     
     public Student(String name, String grade) {
         this.name = name;
         this.grade = grade;
         this.courses = new ArrayList<>();
     }


    public void addCourse(String course) {
        courses.add(course);
        System.out.println(" Added course: " + course);
    }


    public void removeCourse(String course) {
        if (courses.remove(course)) {
            System.out.println(" Removed course: " + course);
        } else {
            System.out.println(" Course not found: " + course);
        }
    }


    public void displayInfo() {
        System.out.println("Student Name: " + name);
        System.out.println("Grade: " + grade);
        System.out.println("Courses Enrolled: " + (courses.isEmpty() ? "No courses enrolled." : courses));
        System.out.println("------------------------------");
    }
}

 
 class StudentDemo {
     public static void main(String[] args) {
         
         Student student = new Student("KJ RADO", "Grade 12");

         
         student.displayInfo();

        
         student.addCourse("Mathematics");
         student.addCourse("Science");
         student.addCourse("English");


         student.displayInfo();

         
         student.removeCourse("Science");

    
         student.displayInfo();
     }
 }
