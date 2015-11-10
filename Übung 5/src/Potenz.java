import java.text.DecimalFormat;
import java.util.function.DoubleSupplier;
import java.util.function.IntUnaryOperator;

/**
 * Created by frank on 10.11.15.
 */
public class Potenz {

    public static void main(String[] args) {
        DecimalFormat zero = new DecimalFormat("0.######");
        System.out.println(zero.format(pow(5,-3)));
        System.out.println("Test");
    }

    public static double pow (double a, int b) {
        IntUnaryOperator abs = x -> x < 0 ? -x : x;
        DoubleSupplier pow = () -> {
            double ergebnis = 1;
            for (int y = abs.applyAsInt(b); y > 0; y--)
                ergebnis *= a;
            return ergebnis;
        };
        if (b < 0)
            return 1 / pow.getAsDouble();
        else if (b == 0)
            return 1;
        else {
            return pow.getAsDouble();
        }
    }
}
