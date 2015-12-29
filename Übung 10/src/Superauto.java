/**
 * Created by frank on 15.12.15.
 */
public class Superauto extends Autoklasse.Auto{

    /**
     * Erweitert das Auto aus Übung 9
     */

    public static int produzierteAutos = 0;

    public Superauto(String marke, String modell, int hubraum, String farbe) {
        super(marke, modell, hubraum, farbe);
        produzierteAutos++;
    }

    public int berechneUmsatz (int duchschnittspreis) {
        return Superauto.produzierteAutos*duchschnittspreis;
    }
}
