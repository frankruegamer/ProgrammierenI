/**
 * Created by frank on 16.11.15.
 */
public class Runden {

    public static void main(String[] args) {
        double zahl = 7.123456;
        System.out.println(runden(zahl, 4));
        // -> 7.1235
        System.out.println(runden(zahl, 3));
        // -> 7.123
    }

    public static int runden (double zahl) {
        if ((int) ((zahl - (int)zahl)*10) < 5) {
            return (int) zahl;
        } else {
            return (int) zahl+1;
        }
    }

    public static double runden (double zahl, int stellen) {
        double factor = Double.parseDouble(Integer.toBinaryString(2<<stellen-1));
        return runden(zahl*factor) / factor;
    }
}
