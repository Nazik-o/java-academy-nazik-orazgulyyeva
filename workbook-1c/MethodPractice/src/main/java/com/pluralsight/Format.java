package com.pluralsight;

public class Format {
    public static void main(String[] args) {
        System.out.println("Bob" + " " + "Smith");
        String formatted = formatName("Eve", "Goodwill");
        System.out.println(formatted);
    }
    public static String formatName(String first, String last){
        return last + ", " + first;
    }
}