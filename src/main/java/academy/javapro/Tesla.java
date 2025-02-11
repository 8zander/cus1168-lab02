package academy.javapro;

public class Tesla extends Vehicle implements Electric, Autonomous {
    private boolean autopilotEnabled;
    private boolean charging;

    public Tesla(String model, int year) {
        super("Tesla", model, year);
        this.autopilotEnabled = false;
        this.charging = false;
    }

    @Override
    public void startEngine() {
        if (!isRunning) {
            isRunning = true;
            System.out.println("Engine started.");
        } else {
            System.out.println("Engine is already running.");
        }
    }

    @Override
    public void stopEngine() {
        if (isRunning) {
            isRunning = false;
            System.out.println("Engine stopped.");
        } else {
            System.out.println("Engine is already stopped.");
        }
    }

    @Override
    public void accelerate() {
        if (isRunning) {
            System.out.println("Accelerating...");
        } else {
            System.out.println("Cannot accelerate. Engine is not running.");
        }
    }

    @Override
    public void brake() {
        if (isRunning) {
            System.out.println("Braking...");
        } else {
            System.out.println("Cannot brake. Engine is not running.");
        }
    }

    @Override
    public void enableAutopilot() {
        if (!autopilotEnabled) {
            autopilotEnabled = true;
            System.out.println("Autopilot enabled.");
        } else {
            System.out.println("Autopilot is already enabled.");
        }
    }

    @Override
    public void disableAutopilot() {
        if (autopilotEnabled) {
            autopilotEnabled = false;
            System.out.println("Autopilot disabled.");
        } else {
            System.out.println("Autopilot is already disabled.");
        }
    }

    @Override
    public boolean isAutopilotEnabled() {
        return autopilotEnabled;
    }

    @Override
    public void startCharging() {
        if (!charging) {
            charging = true;
            System.out.println("Charging started.");
        } else {
            System.out.println("Charging is already in progress.");
        }
    }

    @Override
    public void stopCharging() {
        if (charging) {
            charging = false;
            System.out.println("Charging stopped.");
        } else {
            System.out.println("Charging is already stopped.");
        }
    }

    @Override
    public boolean isCharging() {
        return charging;
    }

    public void displayStatus() {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Engine Running: " + isRunning);
        System.out.println("Autopilot Enabled: " + autopilotEnabled);
        System.out.println("Charging: " + charging);
    }
}