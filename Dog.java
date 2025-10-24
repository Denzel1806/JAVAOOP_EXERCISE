
class Dog {
    // Attributes
    private String name;
    private String breed;

    // Constructor
    public Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    // Setter methods
    public void setName(String name) {
        this.name = name;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    // Method to display dog info
    public void displayInfo() {
        System.out.println("Dog Name: " + name + ", Breed: " + breed);
    }
}

// Main class
class Main {
    public static void main(String[] args) {
        // Create two Dog objects using constructor
        Dog dog1 = new Dog("Buddy", "Golden Retriever");
        Dog dog2 = new Dog("Max", "Bulldog");

        // Display initial info
        System.out.println("Initial Dog Info:");
        dog1.displayInfo();
        dog2.displayInfo();

        // Modify attributes using setter methods
        dog1.setName("Charlie");
        dog1.setBreed("Labrador");
        dog2.setName("Rocky");
        dog2.setBreed("Pug");

        // Display updated info
        System.out.println("\nUpdated Dog Info:");
        dog1.displayInfo();
        dog2.displayInfo();
    }
}
