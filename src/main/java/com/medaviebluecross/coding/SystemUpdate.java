package com.medaviebluecross.coding;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;


@Configuration
@EnableScheduling
public class SystemUpdate {

	
	  private Appliance[] appliances;

	    public SystemUpdate(Appliance[] appliances) {
	        this.appliances = appliances;
	    }


	    //@Scheduled(cron = "0 */2 * ? * *")
	    
	@Scheduled(cron = "0 0 1 1 1 *")
	public void performSystemUpdate() {
		
		  for (Appliance appliance : appliances) {
	            appliance.turnOffAppliance();
	        }
	        System.out.println("All appliances has been turned off for system update.");
	        
	        
	}
	
	
}

