import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by frank on 27.11.15.
 */
public class ArithmetischesMittel {

    public static void main(String[] args) {
        DecimalFormat numberFormat = new DecimalFormat("0.######");
        System.out.print("Anzahl der einzulesenden Werte: ");
        try (Scanner sc = new Scanner(System.in)) {
            double[] messwerte = new double [sc.nextInt()];
            for (int i = 0; i < messwerte.length; i++) {
                System.out.printf("%d.Wert:\t", (i+1));
                messwerte[i] = sc.nextDouble();
            }

            Arrays.sort(messwerte);
            System.out.printf("Kleinster Wert: %s%n", numberFormat.format(messwerte[0]));
            System.out.printf("Groesster Wert: %s%n", numberFormat.format(messwerte[messwerte.length-1]));
            System.out.printf("Arithmetischer Mittelwert: %s%n", numberFormat.format(mean(messwerte)));
            System.out.printf("Standardabweichung: %f%n", deviation(messwerte));
        }
    }

    public static double mean (double[] array) {
        double sum = 0;
        for (double n : array)
            sum += n;
        return (sum/array.length);
    }

    public static double deviation (double[] array) {
        double mean = mean (array);
        double sum = 0;
        for (double n : array)
            sum += Math.pow(n-mean,2);
        return Math.sqrt(sum/array.length);
    }
}
