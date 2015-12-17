package Pizzaklasse;

import java.util.ArrayList;

/**
 * Created by frank on 14.12.15.
 */

public class Pizza {

    private String name;
    private ArrayList<Pizzacombo> kombinationen = new ArrayList<>();

    private class Pizzacombo {
        int durchmesser;
        float preis;

        public Pizzacombo(int durchmesser, float preis) {
            this.durchmesser = durchmesser;
            this.preis = preis;
        }
    }

    public Pizza(String name, int durchmesser, float preis) {
        this.name = name;
        addPizzaCombo(durchmesser, preis);
    }

    public void addPizzaCombo(int durchmesser, float preis) {
        kombinationen.add(new Pizzacombo(durchmesser, preis));
    }
}
