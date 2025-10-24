class Airplane {
    private String flightNumber;
    private String destination;
    private String departureTime;
    private boolean delayed;


    public Airplane(String flightNumber, String destination, String departureTime) {
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureTime = departureTime;
        this.delayed = false;
    }
    public void checkStatus() {
        if (delayed) {
            System.out.println("Flight " + flightNumber + " to " + destination + " is delayed.");
        } else {
            System.out.println("Flight " + flightNumber + " to " + destination + " is on schedule.");
        }
    }

    
    public void delayFlight(String newTime) {
        delayed = true;
        this.departureTime = newTime;
        System.out.println("Flight has been delayed. New departure time: " + departureTime);
    }

    
    public void displayInfo() {
        System.out.println("Flight Number: " + flightNumber);
        System.out.println("Destination: " + destination);
        System.out.println("Departure Time: " + departureTime);
    }
}


class AirplaneApp {
    public static void main(String[] args) {
        Airplane plane1 = new Airplane("PR123", "Tokyo", "10:30 AM");

        plane1.displayInfo();
        plane1.checkStatus();

        System.out.println("\nUpdating flight status...");
        plane1.delayFlight("12:00 PM");
        plane1.checkStatus();
    }
}
