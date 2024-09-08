# Smart Home System

This project simulates a **Smart Home System** where multiple appliances, including Lights, Fans, and Air Conditioners, are controlled programmatically. The system allows for basic operations such as toggling a light switch, setting fan speed, and changing the mode of an air conditioner. Additionally, the system supports scheduled updates where all appliances are turned off during system maintenance.

## Table of Contents
- [Project Overview](#project-overview)
- [Technologies Used](#technologies-used)
- [Features](#features)
- [Setup and Installation](#setup-and-installation)
- [Running the Application](#running-the-application)
- [Expected Results](#expected-results)
- [Contributors](#contributors)

## Project Overview

The **Smart Home System** is designed as a Java-based Spring Boot application. It contains several appliance classes that implement basic functionalities like turning appliances on and off. The system also includes a scheduled task that turns off all appliances at a specified time using Spring's scheduling framework.

## Technologies Used

- **Java 8**
- **Spring Boot 2.7.0**
- **Maven** for dependency management
- **JUnit 5** for unit testing

## Features

1. **Appliance Classes:**
    - `Light`: Can toggle the light switch on/off.
    - `Fan`: Supports setting fan speed (range 0 to 2).
    - `AirConditioner`: Can change the thermostat mode (e.g., cool, fan).
    
2. **Scheduled System Update:**
    - All appliances are turned off at a scheduled time (configured to run on January 1st every year).

3. **Unit Tests:**
    - Includes basic tests to verify that the Spring context loads correctly.

## Setup and Installation

1. **Pre-requisites:**
    - JDK 8 or later
    - Maven 3.6+
    
2. **Clone the repository:**
    ```bash
    git clone https://github.com/dipen5227/smarthomesystem.git
    cd smarthomesystem
    ```

3. **Build the project:**
    ```bash
    mvn clean install
    ```

4. **Run the project:**
    ```bash
    mvn spring-boot:run
    ```

## Running the Application

After running the application, the following will occur:
- Instances of `Light`, `Fan`, and `AirConditioner` will be created.
- Operations will be performed on these appliances, such as toggling the light, setting the fan speed, and changing the air conditioner mode.
- The scheduled task will be set to turn off all appliances at 1 AM on January 1st each year.

## Expected Results

- **Console Output:**
    - "Light is turned on now."
    - "Fan speed is now set to 1."
    - "Air Conditioner is turned on now."
    - "Light is off now."
    - "Fan speed is now set to 2."
    - "Air Conditioner mode is now set to fan."
    - On system update (if triggered manually or scheduled): 
      "All appliances have been turned off for system update."

## Contributors

- **Dipen Patel**

