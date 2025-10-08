package com.pluralsight;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PayrollCalculator2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Asking user for input file
        System.out.print("Enter the name of the file employee file to process: ");
        String inputFilename = scanner.nextLine();

        // Asking user for output file (csv or json)
        System.out.print("Enter the name of the payroll file to create: ");
        String outputFilename = scanner.nextLine();

        List<Employee> employees = new ArrayList<>();

        try {
            // Step 3: Load from resources
            InputStream inputStream = PayrollCalculator.class.getResourceAsStream("/" + inputFilename);
            if (inputStream == null) {
                throw new FileNotFoundException(inputFilename + " not found in resources!");
            }

            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));

            // Skip header
            reader.readLine();
            String line;

            while ((line = reader.readLine()) != null) {
                String[] tokens = line.split("\\|");
                int id = Integer.parseInt(tokens[0]);
                String name = tokens[1];
                double hoursWorked = Double.parseDouble(tokens[2]);
                double payRate = Double.parseDouble(tokens[3]);

                Employee emp = new Employee(id, name, hoursWorked, payRate);
                employees.add(emp);
            }
            reader.close();

            // Step 4: Write output file
            if (outputFilename.endsWith(".json")) {
                writeJsonFile(employees, outputFilename);
            } else {
                writeCsvFile(employees, outputFilename);
            }

            System.out.println("Payroll file created: " + outputFilename);

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // CSV Writer
    private static void writeCsvFile(List<Employee> employees, String filename) throws IOException {
        PrintWriter writer = new PrintWriter(new FileWriter(filename));
        writer.println("id|name|gross pay");
        for (Employee emp : employees) {
            writer.printf("%d|%s|%.2f\n",
                    emp.getEmployeeId(),
                    emp.getName(),
                    emp.getGrossPay());
        }
        writer.close();
    }

    // JSON Writer
    private static void writeJsonFile(List<Employee> employees, String filename) throws IOException {
        PrintWriter writer = new PrintWriter(new FileWriter(filename));
        writer.println("[");
        for (int i = 0; i < employees.size(); i++) {
            Employee emp = employees.get(i);
            writer.print("  { ");
            writer.printf("\"id\": %d, \"name\": \"%s\", \"grossPay\": %.2f",
                    emp.getEmployeeId(),
                    emp.getName(),
                    emp.getGrossPay());
            writer.print(" }");
            if (i < employees.size() - 1) writer.println(",");
            else writer.println();
        }
        writer.println("]");
        writer.close();
    }

}
