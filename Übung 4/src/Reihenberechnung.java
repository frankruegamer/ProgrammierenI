/**
 * Created by Frank on 02.11.2015.
 */

import java.util.function.Function;

public class Reihenberechnung {

    public static void main(String[] args) {
        /**
         * Rechnet die Rekursive und die Iterative Variante aus
         * und gibt deren Laufzeiten aus
         */
        long timeStart, timeEnd;

        // rekursive Methode
        timeStart = System.currentTimeMillis();
        System.out.println(reiheRek());
        timeEnd = System.currentTimeMillis();
        long time1 = (timeEnd - timeStart);

        // iterative Methode
        timeStart = System.currentTimeMillis();
        System.out.println(reiheIter());
        timeEnd = System.currentTimeMillis();
        long time2 = (timeEnd - timeStart);

        System.out.printf("Rekursiv: %dms, Iterativ: %dms", time1, time2);
    }

    public static double reiheRek() {
        return 6 * reiheRek(1);
    }

    private static double reiheRek(int k) {
        /**
         * This method should not be called directly
         * Use reiheRek() instead!
         */
        Function<Integer, Double> kFunc = x -> 1. / (x * x);
        if (Math.abs(kFunc.apply(k) - kFunc.apply(k - 1)) <= 10E-5) {
            return kFunc.apply(k);
        } else {
            return kFunc.apply(k) + reiheRek(k + 1);
        }
    }

    public static double reiheIter() {
        Function<Integer, Double> kFunc = x -> 1. / (x * x);
        double sum = 0;
        for (int k = 1; ; k++) {
            sum += kFunc.apply(k);
            if (Math.abs(kFunc.apply(k) - kFunc.apply(k - 1)) <= 10E-5) break;
        }
        return 6 * sum;
    }
}
