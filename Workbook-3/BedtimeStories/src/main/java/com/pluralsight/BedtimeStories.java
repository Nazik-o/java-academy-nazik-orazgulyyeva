package com.pluralsight;
import java.io.*;
import java.net.URL;

import java.util.Scanner;

public class BedtimeStories {
    public static void main(String[] args) {
        //implementing scanner to get the user input for choosing a file
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose a bedtime story to read:");
        System.out.println("1. Goldilocks");
        System.out.println("2. Hansel and Gretel");
        System.out.println("3. Mary Had a Little Lamb");
        System.out.print("Enter the number of the story you want to read: ");
        int choice = scanner.nextInt();
        scanner.nextLine();

        String fileName;

        switch (choice) {
            case 1:
                fileName = "goldilocks.txt";
                break;
            case 2:
                fileName = "hansel_and_gretel.txt";
                break;
            case 3:
                fileName = "mary_had_a_little_lamb.txt";
                break;
            default:
                System.out.println("Invalid choice. Enter either 1,2,3");
                scanner.close();
                return;  // exit program
        }


        //Using Java’s built-in resource finder .It can find : .txt, .csv, .properties

            ClassLoader classLoader = BedtimeStories.class.getClassLoader();
            URL resource = classLoader.getResource(fileName);

            if (resource == null) {
                //throw new FileNotFoundException("Resource not found: " + fileName);
                System.out.println("File not found!" + fileName);
                return;
            }

            File file = new File(resource.getFile());

            try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                String line;
                int lineNumber = 1;

                while ((line = reader.readLine()) != null) {
                    System.out.println(lineNumber + ". " + line);
                    lineNumber++;
                }


            } catch (FileNotFoundException e) {
                System.out.println("Oops! The file '" + fileName + "' was not found.");
            } catch (IOException e) {
                System.out.println("Something went wrong while reading the file.");
                e.printStackTrace();  //for debugging
            }

            scanner.close();  // Closing the scanner
        }
    }



