
class Employee {
    private String name;
    private String jobTitle;
    private double salary;

    
    public Employee(String name, String jobTitle, double salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }


    public String getName() {
        return name;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public double getSalary() {
        return salary;
    }


    public void updateSalary(double percentageIncrease) {
        double increaseAmount = salary * (percentageIncrease / 100);
        salary += increaseAmount;
        System.out.println(" Salary updated by " + percentageIncrease + "%.");
    }

    
    public void displayInfo() {
        System.out.println("Employee Name: " + name);
        System.out.println("Job Title: " + jobTitle);
        System.out.println("Salary: ₱" + salary);
        System.out.println("-------------------------");
    }
}


class EmployeeTest {
    public static void main(String[] args) {
    
        Employee emp1 = new Employee("Balagat", "Software Engineer", 50000);
        Employee emp2 = new Employee("Mj", "Project Manager", 70000);

        
        System.out.println("Initial Employee Information:");
        emp1.displayInfo();
        emp2.displayInfo();

        
        emp1.updateSalary(10); 
        emp2.updateSalary(5);  

        
        System.out.println("After Salary Update:");
        emp1.displayInfo();
        emp2.displayInfo();
    }
}
