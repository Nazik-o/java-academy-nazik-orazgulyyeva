package com.pluralsight;
//import java.util.Scanner;

public class Movie {
    public static void main(String[] args){
        String movieTitle = "Demon Slayer";
        int friends = 10;
        int mySelf = 1;
        double pizzaPerSlice = 3.50;
        boolean hasPopcorn = true;
        System.out.println("Arrived by 6 p.m.The movie starts at 7 p.m. It will end at 9:30 p.m");
        System.out.println("The movie for tonight is :" + movieTitle);
        double totalPizzaCost = pizzaPerSlice * (friends + mySelf);
        System.out.println("The total cost for pizza was :" + totalPizzaCost);
        System.out.println("Everybody get some fresh popcorn!" + hasPopcorn);

        //Bonus
        /*
        //Challenge #1
        (Scanner scanner = new Scanner(System.in)
            System.out.println("\nEnter movie title: ");
            movieTitle =scanner.nextLine();

            System.out.print("Enter number of friends: ");
            friends =scanner.nextInt();

            System.out.println("Enter pizza price per slice (e.g., 3.50): ");
            pizzaPerSlice =scanner.nextDouble();

            System.out.println("Is there popcorn? (true/false): ");
            hasPopcorn = scanner.nextBoolean();

            //Challenge 4 — Add Drinks
            System.out.println("Enter drink price per person: ");
            double drinkPrice = scanner.nextDouble();

            int totalPeople = friends + mySelf;
            totalPizzaCost =pizzaPerSlice *totalPeople;

            double totalDrinkCost = drinkPrice * totalPeople;
            double grandTotal = totalPizzaCost + totalDrinkCost;

            // Challenge 2 — Round the Pizza Cost
            long pizzaWholeEuros = Math.round(totalPizzaCost);
            double pizzaTwoDecimals = Math.round(totalPizzaCost * 100.0) / 100.0;

            // Print results

           System.out.println("\n--- Movie Night Summary ---");
           System.out.println("Movie for tonight: "+movieTitle);
           System.out.println("Number of guests (including you): "+totalPeople);
           System.out.println("Fresh popcorn available: "+hasPopcorn);

           System.out.println("\nPizza cost (rounded to whole euros): €"+pizzaWholeEuros);
           System.out.printf("Pizza cost (rounded to two decimals): €%.2f%n",pizzaTwoDecimals);

            // Challenge 3 — Dynamic Message
           if(totalPizzaCost >30)

            {
                System.out.println("Whoa, that's a lot of pizza! 🍕");
            } else

            {
                System.out.println("Nice budget-friendly movie night!");
            }

            // Challenge 5 — String Formatting
           System.out.printf("%nMovie: %s | Guests: %d | Total cost (pizza + drinks): €%.2f%n",
            movieTitle,totalPeople,grandTotal);

            // Close scanner
           scanner.close();
         **/

    }
}

