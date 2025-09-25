package com.pluralsight;

public class MathApp {
    public static void main(String[] args) {
// Question 1:
// declare variables here
        //Question: 1
        double bobSalary = 80000;
        double garySalary = 100000;
        double highestSalary = Math.max(bobSalary,garySalary);
        System.out.println("The highest salary is " + highestSalary);


        //Question 2:
        int carPrice = 50000;
        int truckPrice = 200000;
        System.out.println("The car price is :" + carPrice);
        System.out.println("The truck price is :" + truckPrice);
        int smallestPrice = Math.min(carPrice, truckPrice);
        System.out.println("The smallest price is: " + smallestPrice);

        //Question 3:
        double radius = 7.25;
        double areaOfTheCircle = Math.PI * Math.pow(radius, 2);
        //"A = pi * r^2"
        System.out.println("The area of a circle with radius 7.25 is: " + areaOfTheCircle);
        /*char area = 'A';
        double pie = 3.1415;
        double radius = givenRadius * 2;
        String findSolution;
        findSolution = (area == pie * (givenRadius + radius);
        System.out.println("Solution to find Area of the circle is :" + findSolution);*/

        //Question 4:
        double givenNumber = 5.0;
        double squareRoot = Math.sqrt(givenNumber);
        System.out.println("The square root of " + givenNumber + "is = " + squareRoot);

        //Question 5:
        double x1 = 5;
        double y1 = 10;
        double x2 = 85;
        double y2 = 50;
        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        System.out.println("Distance between points " + distance);

        //Question 6:
        double negativeValue = -3.8;
        double absValue = Math.abs(negativeValue);
        System.out.println("The absolute value of " + negativeValue + " is: " + absValue);

        //Question 7:
        double randomNumbers = Math.random();
        System.out.println("Random number between 0 and 1 is :" + randomNumbers );

        //Question 8:
        int minutesInHour = 60;
        int hoursInDay = 24;
        int days = 24;

        int minutesIn24Days = minutesInHour * hoursInDay * days;
        long millisecondsIn24Days = minutesIn24Days * 60L * 1000L;

        System.out.println("Minutes in 24 days: " + minutesIn24Days);
        System.out.println("Milliseconds in 24 days: " + millisecondsIn24Days);







// then code solution
// then use System.out.println() to display results
// ex: System.out.println("The answer is " + answer);
// REPEAT FOR NEXT EXERCISE
    }
}