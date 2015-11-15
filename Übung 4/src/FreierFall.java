/**
 * Created by Frank on 02.11.2015.
 */

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.function.IntConsumer;

public class FreierFall {

    public static void main(String[] args) {
        System.out.print("Bitte Falldauer in Sekunden eingeben: ");
        try (Scanner sc = new Scanner(System.in)) {
            freierFall(sc.nextInt());
        } catch (InputMismatchException e) {
            System.out.println("Bitte eine Zahl eingeben!");
        }
    }

    public static void freierFall(int t) {
        IntConsumer sleep = s -> {
            try   {Thread.sleep(s * 1000);}
            catch (InterruptedException e) { }
        };

        // The number of steps between calculated heights
        final int step = 1;

        final double g = 9.80665;
        sleep.accept(1);
        for (int i = 1; i <= t; i += step) {
            double s = (1./2) * g * i*i;
            System.out.printf("Zeit: %d Sekunden: Zurückgelegte Strecke: %.4f m%n", i, s);
            if (i <= t - step) sleep.accept(step);
        }
    }
}
