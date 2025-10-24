
class Dog {
    
    private String name;
    private String breed;


    public Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }


    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    
    public void displayInfo() {
        System.out.println("Dog Name: " + name + ", Breed: " + breed);
    }
}


class Main {
    public static void main(String[] args) {
        
        Dog dog1 = new Dog("Buddy", "Golden Retriever");
        Dog dog2 = new Dog("Max", "Bulldog");

        
        System.out.println("Initial Dog Info:");
        dog1.displayInfo();
        dog2.displayInfo();

        
        dog1.setName("Charlie");
        dog1.setBreed("Labrador");
        dog2.setName("Rocky");
        dog2.setBreed("Pug");
        System.out.println("\nUpdated Dog Info:");
        dog1.displayInfo();
        dog2.displayInfo();
    }
}
