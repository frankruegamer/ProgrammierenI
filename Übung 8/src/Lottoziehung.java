import java.util.Arrays;
import java.util.function.IntPredicate;

/**
 * Created by frank on 06.12.15.
 */
public class Lottoziehung {

    private static int[] lottozahlen = new int [6];

    public static void main(String[] args) {
        IntPredicate contains = x -> {
            for (int lottozahl : lottozahlen)
                if (lottozahl == x) return true;
            return false;
        };

        /* Initialisieren */
        for (int i = 0; i < lottozahlen.length; i++) {
            int newRandomint;
            do newRandomint = (int) (Math.random() * 49 + 1);
            while (contains.test(newRandomint));
            lottozahlen[i] = newRandomint;
        }
        /* Sortieren */
        for (int i = 0; i < lottozahlen.length; i++) {
            int minimum = i;
            for (int j = i; j < lottozahlen.length; j++)
                if (lottozahlen[j] < lottozahlen[minimum]) minimum = j;
            int placeholder = lottozahlen[i];
            lottozahlen[i] = lottozahlen[minimum];
            lottozahlen[minimum] = placeholder;
        }
        /* Ausgeben */
        System.out.println(Arrays.toString(lottozahlen));
    }
}
