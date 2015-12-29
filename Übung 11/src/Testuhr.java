/**
 * Created by Frank on 29.12.2015.
 */
public class Testuhr {

    public static void main(String[] args) {
        Uhr[] weltzeit = new Uhr[24];
        for (int i = 0; i < weltzeit.length; i++)
            weltzeit[i] = new Uhr(i, 23, 7);
        // Zählt alle Uhren um eine Sekunde hoch
        for (Uhr zeit : weltzeit)
            zeit.naechsteSek();

        Uhr uhr = new Uhr (0, 0, 0);
        //noinspection InfiniteLoopStatement
        do {
            System.out.printf("%02d.%02d:%02d%n", uhr.getStd(), uhr.getMin(), uhr.getSek());
            try { Thread.sleep(1000); }
            catch (InterruptedException ignored) { }
            uhr.naechsteSek();
        } while (true);
    }
}
