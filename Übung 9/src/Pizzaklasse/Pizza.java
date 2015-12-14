package Pizzaklasse;

import java.util.ArrayList;

/**
 * Created by frank on 14.12.15.
 */

public class Pizza {

    private String name;
    private ArrayList<Integer> durchmesser = new ArrayList<>();
    private ArrayList<Float> preis = new ArrayList<>();

    public Pizza(String name, int durchmesser, float preis) {
        this.name = name;
        addPizzaCombo(durchmesser, preis);
    }

    public void addPizzaCombo(int durchmesser, float preis) {
        this.durchmesser.add(durchmesser);
        this.preis.add(preis);
    }
}
