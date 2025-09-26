package com.pluralsight;

public class CompareNumbers {
    public static void main(String[] args) {
        //Testing isEven
        System.out.println(isEven(5));   // false
        System.out.println(isEven(12));  // true
        //Testing isPositive
        System.out.println(isPositive(3.1415));   // true
        System.out.println(isPositive(-0.05));  // false
        System.out.println(isPositive(0));      // false (0 is not > 0)
    }
    //Checking for isEven
    public static boolean isEven( int number){
        return number % 2 == 0;
    }
    //Checking for isPositive
    public static boolean isPositive(double number){
        return number > 0;
    }

}