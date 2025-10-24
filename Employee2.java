import java.time.LocalDate;
import java.time.Period;


class Employee {
    
    private String name;
    private double salary;
    private LocalDate hireDate;

    
    public Employee(String name, double salary, LocalDate hireDate) {
        this.name = name;
        this.salary = salary;
        this.hireDate = hireDate;
    }

    public int calculateYearsOfService() {
        LocalDate currentDate = LocalDate.now(); 
        Period period = Period.between(hireDate, currentDate);
        return period.getYears();
    }

    public void displayInfo() {
        System.out.println("Employee Name: " + name);
        System.out.println("Salary: ₱" + salary);
        System.out.println("Hire Date: " + hireDate);
        System.out.println("Years of Service: " + calculateYearsOfService());
        System.out.println("-------------------------------");
    }
}


public class Employee2 {
    public static void main(String[] args) {
        
        Employee emp1 = new Employee("KAREN JAY", 50000, LocalDate.of(2016, 4, 15));
        Employee emp2 = new Employee("DENZEL ", 60000, LocalDate.of(2019, 9, 10));

        
        emp1.displayInfo();
        emp2.displayInfo();
    }
}
