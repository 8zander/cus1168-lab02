package academy.javapro;

public class Main {
    public static void main(String[] args) {
        // Step 1: Create a new Tesla Model S, 2024
        Tesla tesla = new Tesla("Model S", 2024);

        // Step 2: Display initial status
        System.out.println("Initial Status:");
        tesla.displayStatus();

        // Step 3: Start the car and test basic vehicle functions
        System.out.println("\nTesting basic vehicle functions:");
        tesla.startEngine();
        tesla.accelerate();
        tesla.brake();

        // Step 4: Test autonomous features
        System.out.println("\nTesting autonomous features:");
        tesla.enableAutopilot();
        System.out.println("Autopilot enabled: " + tesla.isAutopilotEnabled());
        tesla.disableAutopilot();
        System.out.println("Autopilot enabled: " + tesla.isAutopilotEnabled());

        // Step 5: Test electric features
        System.out.println("\nTesting electric features:");
        tesla.startCharging();
        System.out.println("Charging: " + tesla.isCharging());
        tesla.stopCharging();
        System.out.println("Charging: " + tesla.isCharging());

        // Step 6: Stop the car and display final status
        System.out.println("\nFinal car status:");
        tesla.stopEngine();
        tesla.displayStatus();
    }
}