package com.medaviebluecross.coding;

public class Fan implements Appliance{

	 private int fanSpeed;
	 
	 public Fan() {
	        this.fanSpeed = 1; // assume fan starts at speed 2
	        System.out.println("Fan speed is now setted to 1");
	    }
	
	@Override
	public void turnOffAppliance() {
		 this.fanSpeed = 0;
	        System.out.println("Fan is turned off.");
	}
	
	 public void setFanSpeed(int fanSpeed) {
	        if (fanSpeed >= 0 && fanSpeed <= 2) {
	            this.fanSpeed = fanSpeed;
	            System.out.println("Fan speed is now setted to " + fanSpeed);
	        }
	    }

}
