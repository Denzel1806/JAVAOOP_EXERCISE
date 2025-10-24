
class TrafficLight {
    
    private String color;
    private int duration; 


    public TrafficLight(String color, int duration) {
        this.color = color;
        this.duration = duration;
    }

    
    public void changeColor(String newColor, int newDuration) {
        this.color = newColor;
        this.duration = newDuration;
        System.out.println(" Traffic light changed to " + color + " for " + duration + " seconds.");
    }

    
    public boolean isRed() {
        return color.equalsIgnoreCase("red");
    }

    public boolean isGreen() {
        return color.equalsIgnoreCase("green");
    }

    
    public void displayStatus() {
        System.out.println("Current Color: " + color);
        System.out.println("Duration: " + duration + " seconds");
        System.out.println("-----------------------------");
    }
}


public class TrafficlLight {
    public static void main(String[] args) {
        
        TrafficLight light = new TrafficLight("Red", 30);

        
        System.out.println("Initial Traffic Light Status:");
        light.displayStatus();

        
        if (light.isRed()) {
            System.out.println(" Stop! The light is red.");
        }

        
        light.changeColor("Green", 25);

        
        if (light.isGreen()) {
            System.out.println("Go! The light is green.");
        }

    
        light.changeColor("Yellow", 5);
        light.displayStatus();
    }
}
