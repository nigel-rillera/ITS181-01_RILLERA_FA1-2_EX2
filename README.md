# ABC Job Sourcing Payroll Calculator

A Java desktop application built with JavaFX that calculates the weekly or project-based payroll for temporary service contractors (Programmers, Analysts, and Testers) at ABC Job Sourcing. 

## Features
* **User Input Form:** A clean JavaFX GUI that accepts the contractor's name, role, number of dependents, and number of hours worked.
* **Standardized Pay Rate:** Automatically calculates gross pay based on a flat rate of Php 1,000.00 per hour.
* **Automated Deductions:** * Social Security (7.85% of gross pay)
  * Company Membership Fee (15% of gross pay)
  * Federal Tax (Calculated dynamically based on the number of dependents)
* **Summary Output:** Displays a detailed breakdown of the contractor's role, gross pay, total deductions, and net take-home pay using a native `JOptionPane` dialog window.

## Technology Stack
* **Language:** Java
* **UI Framework:** JavaFX (FXML)
* **Dialog Component:** Java Swing (`javax.swing.JOptionPane`)

## How to Run
1. Ensure you have the **Java Development Kit (JDK)** installed (Java 11 or higher recommended).
2. Ensure you have **JavaFX** configured in your environment or IDE.
3. Clone this repository:
   ```bash
   git clone [https://github.com/YourUsername/ITS181-01_RILLERA_FA1-2_EX2.git](https://github.com/YourUsername/ITS181-01_RILLERA_FA1-2_EX2.git)
