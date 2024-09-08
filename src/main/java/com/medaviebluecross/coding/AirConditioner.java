package com.medaviebluecross.coding;

// The AirConditioner class implements the Appliance interface
public class AirConditioner implements Appliance {

    // Variable to store the current mode of the AC (e.g., cool, heat, off)
    private String acThermostatMode; 

    // Constructor that initializes the AC in 'cool' mode and turns it on
    public AirConditioner() {
        this.acThermostatMode = "cool";
        System.out.println("Air Conditioner is turned on now.");
    }

    // Method to change the thermostat mode of the AC (e.g., cool, heat)
    public void setACThermostateMode(String mode) {
        this.acThermostatMode = mode;
        System.out.println("Air Conditioner mode is now set to " + mode);
    }

    // Implementation of the turnOffAppliance method from the Appliance interface
    @Override
    public void turnOffAppliance() {
        this.acThermostatMode = "off";
        System.out.println("Air Conditioner is turned off now.");
    }
}
