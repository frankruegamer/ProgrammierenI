/**
 * Created by frank on 16.11.15.
 */
public class Runden {

    public static void main(String[] args) {
        double zahl = 7.123456;
        System.out.println(runden(5.4));
        System.out.println(runden(-5.5));
        System.out.println(runden(zahl, 4));
        // -> 7.1235
        System.out.println(runden(zahl, 3));
        // -> 7.123
    }

    public static int runden (double zahl) {
        double normal = zahl - (int) zahl;
        if (normal >= 0 && normal < 0.5 || normal < 0 && normal >= -0.5) {
            return (int) zahl;
        } else {
            return zahl > 0 ? (int) zahl+1 : (int) zahl-1;
        }
    }

    public static double runden (double zahl, int stellen) {
        double factor = Double.parseDouble(Integer.toBinaryString(2<<stellen-1));
        return runden(zahl*factor) / factor;
    }
}
