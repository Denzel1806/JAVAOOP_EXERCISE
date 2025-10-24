
class Rectangle {
    
    private double width;
    private double height;


    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    
    public double getArea() {
        return width * height;
    }

    
    public double getPerimeter() {
        return 2 * (width + height);
    }

    
    public void display() {
        System.out.println("Width: " + width);
        System.out.println("Height: " + height);
        System.out.println("Area: " + getArea());
        System.out.println("Perimeter: " + getPerimeter());
    }
}

class MainApp {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(5.0, 3.0);
        rect.display();
    }
}