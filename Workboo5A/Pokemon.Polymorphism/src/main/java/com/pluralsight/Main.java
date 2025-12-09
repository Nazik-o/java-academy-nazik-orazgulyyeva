package com.pluralsight;

import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ArrayList<Pokemon> pokemons = new ArrayList<Pokemon>();

        pokemons.add(new Pikachu("Pika"));
        pokemons.add(new Mewto("Mewto"));

        for (int i = 0; i < pokemons.size() ; i++) {
            pokemons.get(i).attack();
        }

    }
}