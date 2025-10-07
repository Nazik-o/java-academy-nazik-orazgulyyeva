package com.pluralsight;
import java.io.*;
//import java.io.BufferedReader;
//import java.io.InputStreamReader;

public class PayrollCalculator {
    public static void main(String[] args) throws FileNotFoundException {
        try {
            // Load file from resources
            InputStream inputStream = PayrollCalculator.class.getResourceAsStream("/employees.csv");

            if (inputStream == null) {
                throw new FileNotFoundException("employees.csv not found in resources!");
            }

            BufferedReader bufReader = new BufferedReader(new InputStreamReader(inputStream));
            bufReader.readLine();
            String line;

            while ((line = bufReader.readLine()) != null) {
                String[] tokens = line.split("\\|");
                System.out.println(line);

                int id = Integer.parseInt(tokens[0]);
                String name = tokens[1];
                double hoursWorked = Double.parseDouble(tokens[2]);
                double payRate = Double.parseDouble(tokens[3]);

                Employee employee = new Employee(id, name, hoursWorked, payRate);
                System.out.printf("ID: %d | Name : %s | Gross Pay :$%.2f\n", employee.getEmployeeId(), employee.getName(), employee.getGrossPay());
            }

            bufReader.close();
        } catch (IOException e) {
            System.out.println("Error reading file!");
            e.printStackTrace();
        }
    }

}

