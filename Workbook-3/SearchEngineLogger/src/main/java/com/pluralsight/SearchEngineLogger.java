package com.pluralsight;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class SearchEngineLogger {
    public static void logAction(String action) {
        try {
            // Create or open the file in append mode
            FileWriter writer = new FileWriter("logs.txt", true);

            // Get current date and time
            LocalDateTime now = LocalDateTime.now();
            DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

            // Write the timestamp and action
            writer.write(now.format(fmt) + " " + action + "\n");

            writer.close();
        } catch (IOException e) {
            System.out.println("Error writing to log file: " + e.getMessage());
        }
    }

    //
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Log the app launch
        logAction("launch");

        boolean running = true;
        while (running) {
            System.out.print("Enter a search term (X to exit): ");
            String term = scanner.nextLine();

            if (term.equalsIgnoreCase("X")) {
                logAction("exit");
                System.out.println("Goodbye!");
                running = false;
            } else {
                logAction("search : " + term);
                System.out.println("Searching for: " + term + " ...");
            }
        }

        scanner.close();
    }

}
