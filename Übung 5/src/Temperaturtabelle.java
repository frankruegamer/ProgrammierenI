import java.util.function.DoubleUnaryOperator;

/**
 * Created by Frank on 09.11.2015.
 */
public class Temperaturtabelle {

    public static void main(String[] args) {
        temperaturtabelle();
    }

    public static void temperaturtabelle() {
        DoubleUnaryOperator degreeFtoC = f -> (5./9) * (f-32);
        System.out.println("Fahrenheit\tCelsius");
        for (int f = 0; f <= 300; f++)
            System.out.printf("%-10d\t%.2f%n", f, degreeFtoC.applyAsDouble(f));
    }
}
