/**
 * Created by Frank on 26.10.2015.
 */
public class W�rfelwurf {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            wuerfelwurf();
        }

    }

    public static void wuerfelwurf () {
        final String[] zahlen = {"Eins", "Zwei", "Drei", "Vier", "F�nf", "Sechs"};
        int random = (int) (Math.random()*6);
        System.out.printf("%s gew�rfelt%n", zahlen[random]);
    }
}
