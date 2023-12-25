import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class ParkingSpot {
    private int spotNumber;
    private boolean occupied;
    private String vehicleType;

    public ParkingSpot(int spotNumber) {
        this.spotNumber = spotNumber;
        this.occupied = false;
        this.vehicleType = null;
    }

    public int getSpotNumber() {
        return spotNumber;
    }

    public boolean isOccupied() {
        return occupied;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void occupySpot(String vehicleType) {
        this.vehicleType = vehicleType;
        this.occupied = true;
    }

    public void vacateSpot() {
        this.vehicleType = null;
        this.occupied = false;
    }
}

class ParkingLot {
    private Map<String, Integer> vehicleCount; // Count of each vehicle type
    private Map<String, Double> vehicleRates;  // Parking rates for each vehicle type
    private ParkingSpot[] spots;

    public ParkingLot(int capacity) {
        spots = new ParkingSpot[capacity];
        for (int i = 0; i < capacity; i++) {
            spots[i] = new ParkingSpot(i + 1);
        }

        vehicleCount = new HashMap<>();
        vehicleRates = new HashMap<>();
        vehicleCount.put("Car", 0);
        vehicleCount.put("Motorcycle", 0);

        // Set parking rates for different vehicle types
        vehicleRates.put("Car", 5.0); // Example rate for cars in dollars per hour
        vehicleRates.put("Motorcycle", 2.0); // Example rate for motorcycles in dollars per hour
    }

    public void occupySpot(String vehicleType) {
        for (ParkingSpot spot : spots) {
            if (!spot.isOccupied()) {
                spot.occupySpot(vehicleType);
                vehicleCount.put(vehicleType, vehicleCount.get(vehicleType) + 1);
                System.out.println("Spot " + spot.getSpotNumber() + " is now occupied by a " + vehicleType + ".");
                return;
            }
        }
        System.out.println("Parking lot is full. Please try again later.");
    }

    public void vacateSpot(int spotNumber) {
        for (ParkingSpot spot : spots) {
            if (spot.getSpotNumber() == spotNumber && spot.isOccupied()) {
                spot.vacateSpot();
                String vehicleType = spot.getVehicleType();
                vehicleCount.put(vehicleType, vehicleCount.get(vehicleType) - 1);
                System.out.println("Spot " + spotNumber + " is now vacant.");
                return;
            }
        }
        System.out.println("Invalid spot number or the spot is already vacant.");
    }

    public void displayParkingStats() {
        System.out.println("Parking Statistics:");
        for (Map.Entry<String, Integer> entry : vehicleCount.entrySet()) {
            System.out.println(entry.getKey() + " count: " + entry.getValue());
        }
    }

    public double calculateParkingCharge(String vehicleType, int hours) {
        if (vehicleRates.containsKey(vehicleType)) {
            double rate = vehicleRates.get(vehicleType);
            return rate * hours;
        }
        return 0.0;
    }
}

 class ParkingManagementSystem {
    public static void main(String[] args) {
        ParkingLot parkingLot = new ParkingLot(10); // Example: Parking lot with 10 spots
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Welcome to Parking Management System");
            System.out.println("1. Park a vehicle");
            System.out.println("2. Vacate a parking spot");
            System.out.println("3. Display parking statistics");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter the vehicle type (Car/Motorcycle): ");
                    String vehicleType = scanner.nextLine().trim();
                    parkingLot.occupySpot(vehicleType);
                    break;
                case 2:
                    System.out.print("Enter the spot number to vacate: ");
                    int vacateSpotNumber = scanner.nextInt();
                    parkingLot.vacateSpot(vacateSpotNumber);
                    break;
                case 3:
                    parkingLot.displayParkingStats();
                    break;
                case 4:
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
