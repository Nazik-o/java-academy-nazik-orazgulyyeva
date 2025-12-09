package com.pluralsight;

import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//        WalterWhite walterWhite = new WalterWhite();
//        walterWhite.cook();
//        Chemist heisenberg = new WalterWhite();
//        heisenberg.cook();
        Chemist walt = new WalterWhite();
        Chemist jesse = new JessePinkman();

        ArrayList<Chemist> team = new ArrayList<>();
        team.add(walt);
        team.add(jesse);

        for (Chemist c : team) {
            c.cook();  // Polymorphic call
        }




    }
}