public class Personname {
    private String name;
    private int age;
    
    
    public Personname(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
    
    
    public static void main(String[] args) {
        
        Personname person1 = new Personname("Robenn", 25);
        Personname person2 = new Personname("Patric", 30);
        
        person1.displayInfo();
        person2.displayInfo();
    }
}
