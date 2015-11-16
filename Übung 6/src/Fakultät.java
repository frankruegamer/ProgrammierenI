import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by frank on 16.11.15.
 */
public class Fakultät {

    public static void main(String[] args) {
        System.out.println("Geben Sie eine Zahl ein:");
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println(fak(sc.nextInt()));
        } catch (InputMismatchException e) {
            System.out.println("Geben Sie bitte eine Zahl ein!");
        }
    }

    public static int fak (int n) {
        int produkt = n--;
        for (; n > 0; n--) {
            produkt *= n;
        }
        return produkt;
    }
}
