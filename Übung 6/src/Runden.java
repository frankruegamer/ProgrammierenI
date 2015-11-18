import java.util.function.DoubleToIntFunction;
import java.util.function.DoubleUnaryOperator;

/**
 * Created by frank on 16.11.15.
 */
public class Runden {

    public static void main(String[] args) {
        double zahl = 7.123456;
        for (int i = 0; i < 10; i++) {
            double test = -(50 + i) / 10d;
            System.out.printf("Eigen: %.1f: %d%n", test, runden(test));
        } for (int i = 0; i < 10; i++) {
            double test = -(50 + i) / 10d;
            System.out.printf("Math: %.1f: %d%n", test, Math.round(test));
        }
        System.out.println(runden(5.4));
        System.out.println(runden(-5.4));
        System.out.println(Math.round(5.4));
        System.out.println(Math.round(-5.4));
        System.out.println(runden(zahl, 4));
        // -> 7.1235
        System.out.println(runden(zahl, 3));
        // -> 7.123
    }

    public static int runden (double zahl) {
        DoubleUnaryOperator abs = x -> x < 0 ? -x : x;
        DoubleToIntFunction floor = x -> x < 0 ? (int) x-1 : (int) x;
        DoubleToIntFunction ceil = x -> x < 0 ? (int) x : (int) x+1;
        System.out.printf("Ceiling %d = %d", 5, ceil.applyAsInt(5));
        int ergebnis = abs.applyAsDouble(zahl - (int)zahl) < 0.5 ? floor.applyAsInt(zahl) : ceil.applyAsInt(zahl);
        return ergebnis;
    }

    public static double runden (double zahl, int stellen) {
        double factor = Double.parseDouble(Integer.toBinaryString(2<<stellen-1));
        return runden(zahl*factor) / factor;
    }
}
