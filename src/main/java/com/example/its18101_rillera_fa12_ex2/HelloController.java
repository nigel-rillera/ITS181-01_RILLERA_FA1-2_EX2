package com.example.its18101_rillera_fa12_ex2;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javax.swing.JOptionPane;

public class HelloController {

    @FXML private TextField nameField;
    @FXML private TextField roleField;
    @FXML private TextField dependentsField;
    @FXML private TextField hoursField;

    @FXML
    protected void onSubmitButtonClick() {
        try {
            String name = nameField.getText();
            String role = roleField.getText();
            int dependents = Integer.parseInt(dependentsField.getText());
            double hours = Double.parseDouble(hoursField.getText());

            double grossPay = hours * 1000.00;
            double ssDeduction = grossPay * 0.0785;
            double membershipFee = grossPay * 0.15;
            double federalTax = (grossPay - (grossPay * 0.05 * dependents)) * 0.15;
            double totalDeductions = ssDeduction + membershipFee + federalTax;
            double netPay = grossPay - totalDeductions;

            String outputMessage = String.format(
                    "Role : %s\nGross = Php %,.2f\nDeductions = Php %,.2f\nNet = Php %,.2f",
                    role, grossPay, totalDeductions, netPay
            );

            JOptionPane.showMessageDialog(null, outputMessage);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Please enter valid numbers for dependents and hours.", "Input Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}