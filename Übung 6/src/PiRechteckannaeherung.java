import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by frank on 16.11.15.
 */
public class PiRechteckannaeherung {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Wie viele Rechtecke möchten Sie für die Annäherung verwenden?");
            System.out.printf("Pi ≈ %f", piAnnaeherung(sc.nextInt()));
        } catch (InputMismatchException e) {
        }
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
