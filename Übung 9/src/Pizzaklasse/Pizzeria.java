package Pizzaklasse;

/**
 * Created by frank on 14.12.15.
 */
public class Pizzeria {
    public static void main(String[] args) {
        Pizza[] pizzen = new Pizza[5];
        pizzen[0] = new Pizza("Margherita", 30, 8f);
        pizzen[1] = new Pizza("Vegetale", 30, 9f);
        pizzen[2] = new Pizza("Quattro Formaggi", 30, 9.50f);
        pizzen[3] = new Pizza("Mozzarella", 30, 9f);
        pizzen[4] = new Pizza("Peperone", 30, 9.50f);
    }
}
