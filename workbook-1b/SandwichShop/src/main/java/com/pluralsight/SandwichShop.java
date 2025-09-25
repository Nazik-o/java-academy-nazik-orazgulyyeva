package com.pluralsight;
import java.util.Scanner;

public class SandwichShop {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        //Sandwich size
        System.out.println("Enter your sandwich size ,please: ");
        System.out.println("1: Regular: base price $5.45");
        System.out.println("2: Large: base price $8.95");
        System.out.println("Your choice is :");
        int sizeChoice = scanner.nextInt();

        double basePrice;

        if (sizeChoice == 1){
            basePrice = 5.45;
        }
        else if ( sizeChoice == 2){
            basePrice = 8.95;
        } else {
            System.out.println("You have entered invalid choice ,defaulting to regular");
            basePrice = 5.45;
        }
        //Ask for their age for discount
        System.out.println("Enter your age,for eligibility for a discount");
        int age = scanner.nextInt();

        //Now applying discounts
        double discount = 0.0;
        if (age <= 17){
            discount = 0.10;
            System.out.println("You have just earned 10% off");
        }
        else if (age >= 65){
           discount = 0.20;
           System.out.println("You have just earned 20% off");
        }
        else{
            discount = 0.00;
            System.out.println("No discount,sorry!");
        }
        //calculation
        double finalPrice = basePrice - (basePrice * discount);
        System.out.println("Final price of your sandwich is $ :" + finalPrice);

        //closing scanner ,to limit memory leak
        scanner.close();



    }
}
