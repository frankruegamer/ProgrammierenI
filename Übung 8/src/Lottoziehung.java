import java.util.Arrays;

/**
 * Created by frank on 06.12.15.
 */
public class Lottoziehung {

    private static Integer[] lottozahlen = new Integer[6];

    public static void main(String[] args) {
        /* Initialisieren */
        for (int i = 0; i < lottozahlen.length; i++) {
            int newRandomint;
            do newRandomint = (int) (Math.random() * 49 + 1);
            while (Arrays.asList(lottozahlen).contains(newRandomint));
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
