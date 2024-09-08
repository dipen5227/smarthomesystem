package com.medaviebluecross.coding;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CodingApplication {

	public static void main(String[] args) {
		SpringApplication.run(CodingApplication.class, args);
		
		Light light = new Light();
        Fan fan = new Fan();
        AirConditioner ac = new AirConditioner();
        
        light.toggleLightSwitch();
        fan.setFanSpeed(2);
        ac.setACThermostateMode("fan");
        
        Appliance[] allAppliances = {light,fan,ac};
        
        SystemUpdate updateTask = new SystemUpdate(allAppliances);
        
        
	}

}
