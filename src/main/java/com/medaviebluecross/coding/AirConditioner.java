package com.medaviebluecross.coding;

public class AirConditioner implements Appliance{
	
	private String acThermostatMode; 
	
	public AirConditioner() {
        this.acThermostatMode = "cool";
        System.out.println("Air Conditioner is turned on now.");
    }
	
	public void setACThermostateMode(String mode) {
        this.acThermostatMode = mode;
        System.out.println("Air Conditioner mode is now set to " + mode);
    }

	@Override
	public void turnOffAppliance() {
		 this.acThermostatMode = "off";
	        System.out.println("Air Conditioner is turned off now.");
	}


}
