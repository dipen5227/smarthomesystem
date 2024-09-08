package com.medaviebluecross.coding;

public class Light implements Appliance{

	private boolean isLightOn;
	
	  public Light() {
	        this.isLightOn = true;
	        System.out.println("Light is turned on now.");
	    }

	
	public void toggleLightSwitch() {
        this.isLightOn = !this.isLightOn;
        System.out.println(isLightOn ? "Light is on now." : "Light is off now.");
    }


	@Override
	public void turnOffAppliance() {
		
			this.isLightOn = false;
	        System.out.println("Light is turned off now.");
		
	}

}
