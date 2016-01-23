package Lottoziehung;

/**
 * Created by Frank on 20.01.2016.
 */
public class Lottoziehung {

    public static void main(String[] args) {
        Liste<Integer> lottozahlen = new Liste<Integer>();
        Liste<Integer> gezogeneZahlen = new Liste<Integer>();
        for (int i = 1; i <= 49; i++) lottozahlen.push(i);
        for (int i = 49; i >= 43; i--) {
            int randomint = (int) (Math.random() * i);
            gezogeneZahlen.push(lottozahlen.take(randomint));
        }
        System.out.println(gezogeneZahlen.join(", "));
    }
}
