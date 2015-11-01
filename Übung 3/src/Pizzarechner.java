/**
 * Created by Frank on 26.10.2015.
 */
import java.util.Scanner;

public class Pizzarechner {

    private static class Pizza {
        private int durchmesser;
        private double preis;

        public Pizza (int durchmesser, double preis) {
            /**
             * @param   durchmesser der Durchmesser der Pizza in cm
             * @param   preis       der Preis der Pizza in Euro
             */
            this.durchmesser = durchmesser;
            this.preis = preis;
        }

        public double ratio () {
            /**
             * Gibt das Größen-/Preisverhältnis der Pizzaz zurück
             */
            double area = Math.pow(this.durchmesser/200.0, 2) * Math.PI;
            return preis/area;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Durchmesser Pizza 1 [cm]:");
        int p1d = sc.nextInt();
        System.out.println("Preis Pizza 1:");
        double p1p = sc.nextDouble();
        System.out.println("Durchmesser Pizza 2:");
        int p2d = sc.nextInt();
        System.out.println("Preis Pizza 2:");
        double p2p = sc.nextDouble();
        sc.close();
        Pizza p1 = new Pizza(p1d, p1p);
        Pizza p2 = new Pizza(p2d, p2p);

        pizzaVergleichen(p1, p2);
    }

    public static void pizzaVergleichen (Pizza p1, Pizza p2) {
        double[] ratio = {p1.ratio(), p2.ratio()};
        int better = (ratio[0] - ratio[1]) < 0 ? 0 : 1;
        System.out.printf("Pizza %d hat das bessere Preis-/Größenverhältnis von %.2f\u20ac/m²", better+1, ratio[better]);
    }
}


