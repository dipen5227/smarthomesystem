package com.medaviebluecross.coding;

// The Light class implements the Appliance interface
public class Light implements Appliance {

    // Variable to track whether the light is on or off
    private boolean isLightOn;

    // Constructor to initialize the light in the "on" state
    public Light() {
        this.isLightOn = true;
        System.out.println("Light is turned on now.");
    }

    // Method to toggle the light switch (on/off)
    public void toggleLightSwitch() {
        this.isLightOn = !this.isLightOn; // Flip the light state
        System.out.println(isLightOn ? "Light is on now." : "Light is off now.");
    }

    // Implementation of the turnOffAppliance method from the Appliance interface
    @Override
    public void turnOffAppliance() {
        this.isLightOn = false; // Turn the light off
        System.out.println("Light is turned off now.");
    }
}
