/**
 * Created by Frank on 02.11.2015.
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class Primzahlen {

    public static void main(String[] args) {
        System.out.print("Bitte die untersuchende Zahl eingeben: ");
        try (Scanner sc = new Scanner(System.in)) {
            if (primzahl(sc.nextInt())) {
                System.out.println("Untersuchte Zahl ist eine Primzahl !");
            } else {
                System.out.println("Untersuchte Zahl ist keine Primzahl !");
            }
        } catch (InputMismatchException e) {
        }
    }

    public static boolean primzahl(int zahl) {
        boolean prime = true;
        for (int i = 2; i <= Math.sqrt(zahl); i++) {
            if (zahl % i == 0) prime = false;
        }
        return prime;
    }
}
