/**
 * Created by frank on 16.11.15.
 */
public class PiRechteckannaeherung {

    public static void main(String[] args) {
        System.out.println(piAnnaeherung(1));
        // -> 4.0
        System.out.println(piAnnaeherung(5));
        // -> 3.4370488288835515
        System.out.println(piAnnaeherung(1000000));
        // -> 3.1415946524138207
    }

    public static double piAnnaeherung (int anzahl) {
        double a = 1d/anzahl;
        double summe = 0;
        for (int i = 0; i < anzahl; i++) {
            summe += a*Math.sqrt(1-Math.pow(a*i,2));
        }
        return 4*summe;
    }
}
