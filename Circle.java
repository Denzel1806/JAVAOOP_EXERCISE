public class Circle { 
    
    private double radius;

    
    public Circle(double radius) {
        this.radius = radius;
    }

    
    public void setRadius(double radius) {
        this.radius = radius;
    }

    
    public double getRadius() {
        return radius;
    }

    
    public double getArea() {
        return Math.PI * radius * radius;
    }

    
    public double getCircumference() {
        return 2 * Math.PI * radius;
    }


    public void display() {
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + getArea());
        System.out.println("Circumference: " + getCircumference());
    }
}


class CircleTest {
    public static void main(String[] args) {
        
        Circle circle = new Circle(5.0);

        
        System.out.println("Initial Circle Details:");
        circle.display();

    
        circle.setRadius(7.0);

        
        System.out.println("\nAfter Modifying Radius:");
        circle.display();
    }
    }


