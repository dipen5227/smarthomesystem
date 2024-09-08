package com.medaviebluecross.coding;

// The Fan class implements the Appliance interface
public class Fan implements Appliance {

    // Variable to store the current speed of the fan (range 0 to 2)
    private int fanSpeed;

    // Constructor to initialize the fan with a default speed of 1
    public Fan() {
        this.fanSpeed = 1; // assume fan starts at speed 1
        System.out.println("Fan speed is now set to 1");
    }

    // Method to turn off the fan by setting the speed to 0
    @Override
    public void turnOffAppliance() {
        this.fanSpeed = 0;
        System.out.println("Fan is turned off.");
    }

    // Method to set the fan speed (acceptable range 0 to 2)
    public void setFanSpeed(int fanSpeed) {
        if (fanSpeed >= 0 && fanSpeed <= 2) {
            this.fanSpeed = fanSpeed;
            System.out.println("Fan speed is now set to " + fanSpeed);
        }
    }
}
