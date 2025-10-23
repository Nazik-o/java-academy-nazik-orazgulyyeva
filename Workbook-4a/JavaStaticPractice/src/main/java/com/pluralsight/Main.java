package com.pluralsight;

public class Main {
    public static void main(String[] args) {

        Saiyan sonic = new Saiyan("Sonic",  100);
        Saiyan goku = new Saiyan("Goku", 10000);
        Saiyan s5 = new Saiyan("Vegta", 9999);
        Saiyan s3 = new Saiyan ("Brock", 9000);
        Saiyan s4 = new Saiyan("Mario", 1001);
        sonic.setPowerlevel(200);
        goku.setPowerlevel(5000);

        //goku.showStats();
        // sonic.showStats();


        Saiyan.showTotalSaiyans();
        Saiyan.showAllSaiyansStats();
        //static method is not connected to a specific Saiyan,
        //but it's a generic method for all Saiyans
        //It's a class method

        System.out.println("Let's save the princess!");
    }
}