import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by frank on 26.11.15.
 */
public class Sinusberechnung {

    public static void main(String[] args) {
        DecimalFormat numberFormat = new DecimalFormat("0.######");
        System.out.print("sin(x) <- ");
        try (Scanner sc = new Scanner(System.in)) {
            double input = sc.nextDouble();
            System.out.printf("sin(%s) ≈ %s", numberFormat.format(input), numberFormat.format(sinus(input)));
        } catch (InputMismatchException ignored) { }
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
