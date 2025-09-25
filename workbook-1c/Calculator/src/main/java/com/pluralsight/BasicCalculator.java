package com.pluralsight;
import java.util.Scanner;
public class BasicCalculator {
    public static void main(String[] args){
        Scanner scanner = new Scanner (System.in);
        //user input for first number
        System.out.print("Enter the first number: ");
        double firstNumber = scanner.nextDouble();
        //user input for second number
        System.out.print("Enter the second number: ");
        double secondNumber = scanner.nextDouble();
        //Showing calculating options
        System.out.println("Available calculations");
        System.out.println("(A) addition");
        System.out.println("(S) subtraction");
        System.out.println("(D) division");
        System.out.println("(M) multiplication");
        //User choice
        System.out.print("Please select an option: ");
        String choice = scanner.next().toUpperCase();//so user could input upper case too
        double result;
        //Now actual calculation starts here
        if (choice.equals("A")) {
            result = firstNumber + secondNumber;
            System.out.println(firstNumber + " + " + secondNumber + " = " + result);
        } else if (choice.equals("S")) {
            result = firstNumber - secondNumber;
            System.out.println(firstNumber + " - " + secondNumber + " = " + result);
        } else if (choice.equals("M")) {
            result = firstNumber * secondNumber;
            System.out.println(firstNumber + " * " + secondNumber + " = " + result);
        } else if (choice.equals("D")) {
            if (secondNumber != 0) {
                result = firstNumber / secondNumber;
                System.out.println(firstNumber + " / " + secondNumber + " = " + result);
            } else {
                System.out.println("Error: Division by zero is not allowed.");
            }
        } else {
            System.out.println("Invalid choice. Please select A, S, M, or D.");
        }







    }
}
