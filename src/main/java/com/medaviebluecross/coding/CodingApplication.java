package com.medaviebluecross.coding;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CodingApplication {

    // The main method to start the Spring Boot application
    public static void main(String[] args) {
        SpringApplication.run(CodingApplication.class, args);
        
        // Creating instances of appliances: Light, Fan, and Air Conditioner
        Light light = new Light();
        Fan fan = new Fan();
        AirConditioner ac = new AirConditioner();
        
        // Toggling the light switch, setting fan speed, and changing AC mode
        light.toggleLightSwitch();
        fan.setFanSpeed(2); // Set fan speed to 2
        ac.setACThermostateMode("fan"); // Set AC mode to "fan"
        
        // Storing all appliances in an array
        Appliance[] allAppliances = {light, fan, ac};
        
        // Creating a system update task for all appliances
        SystemUpdate updateTask = new SystemUpdate(allAppliances);
    }
}
