/**
 * Created by Frank on 02.11.2015.
 */
public class DasKleineEinmaleins {

    public static void main(String[] args) {
        dasKleineEinmalEins();
    }

    public static void dasKleineEinmalEins() {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.printf("%d x %d = %d%n", i, j, i * j);
            }
        }
    }
}
