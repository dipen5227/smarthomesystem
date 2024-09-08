package com.medaviebluecross.coding;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@Configuration  // Marks this class as a Spring configuration
@EnableScheduling  // Enables scheduling tasks within this class
public class SystemUpdate {

    // Array of appliances that will undergo system updates
    private Appliance[] appliances;

    // Constructor to initialize SystemUpdate with a list of appliances
    public SystemUpdate(Appliance[] appliances) {
        this.appliances = appliances;
    }

    // Scheduled task to perform a system update at the specified cron schedule.
    // The current schedule is set to run at 1 AM on January 1st every year
    @Scheduled(cron = "0 0 1 1 1 *")
    public void performSystemUpdate() {
        // Loop through each appliance and turn it off
        for (Appliance appliance : appliances) {
            appliance.turnOffAppliance();
        }
        // Print a message indicating all appliances have been turned off for the update
        System.out.println("All appliances have been turned off for system update.");
    }
}
