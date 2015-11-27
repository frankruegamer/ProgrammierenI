/**
 * Created by frank on 26.11.15.
 */
public class Sinusberechnung {

    public static void main(String[] args) {
        System.out.println(sinus(Math.PI/2));
    }

    public static double sinus (double x) {
        double zaehler = x;
        double nenner = 1d;
        double summe = x;
        double summand = 1;

        for (int i = 2; summand > 1E-15 || summand < -1E-15; i+=2) {
            zaehler *= -x * x;
            nenner *= i * (i+1);
            summand = zaehler/nenner;
            summe += summand;
        }
        return summe;
    }
}
