package com.pluralsight;
import java.util.Scanner;

public class CarRental {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter the pickup date : ");
        String pickupDate = scanner.nextLine();

        System.out.println("Enter the number of days of the rental: ");
        int rentalDays = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Do you want an electronic toll tag (yes/no)");
        String tollTag = scanner.nextLine();

        System.out.println("Do you want GPS added (yes/no)");
         String gpsAnswer = scanner.nextLine();

        System.out.println("Do you want roadside assistance (yes/no)");
         String roadAssistance = scanner.nextLine();

        System.out.println("What is your age : ");
         int currentAge = scanner.nextInt();

         //Calculation

        System.out.println(rentalDays);
        System.out.println(tollTag);
        System.out.println(gpsAnswer);
        System.out.println(roadAssistance);

        double rentalCost = rentalDays * 29.99;
        double optionsCost = 0.0;
        if (tollTag.equalsIgnoreCase("yes")){
            optionsCost += rentalDays * 3.95;
        }
        if (gpsAnswer.equalsIgnoreCase("yes")){
            optionsCost += rentalDays * 2.95;

        }
        if (roadAssistance.equalsIgnoreCase("yes")){
           optionsCost += rentalDays * 3.95;
        }
        double underAge = 0.0;
        if(currentAge < 25){
            underAge += rentalCost * 0.30;
        }
        double totalCost = rentalCost + optionsCost + underAge ;
        System.out.println("Your pickup date is :" + pickupDate);
        System.out.println("Your rental days are :" + rentalDays);
        System.out.println("Your car rental is :" + rentalCost);
        System.out.println("Your options cost are :" + optionsCost);
        System.out.println("Your underage cost is :" + underAge);
        System.out.println("Your total cost is :" + totalCost);

        scanner.close();
    }
}
