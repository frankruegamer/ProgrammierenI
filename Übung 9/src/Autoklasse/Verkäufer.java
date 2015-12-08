package Autoklasse;

import java.util.ArrayList;

/**
 * Created by frank on 08.12.15.
 */
public class Verkäufer {

    public static void main(String[] args) {
        ArrayList<Auto> autoliste  = new ArrayList<>();
        autoliste.add(new Auto("VW", "Käfer", 1193, "weiß"));
        autoliste.add(new Auto("VW", "Golf I", 1093, "schwarz"));
        autoliste.add(new Auto("VW", "Typ 2 T1", 1131, "bunt"));
        Auto greatest = Auto.DUMMY;
        for (Auto car : autoliste)
            greatest = car.getHubraum() > greatest.getHubraum() ? car : greatest;
        System.out.println(greatest);
    }
}
