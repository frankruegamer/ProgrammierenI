import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by frank on 26.11.15.
 */
public class Rekursion {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Geben Sie die Basis ein: ");
            int basis = sc.nextInt();
            System.out.print("Geben Sie den Exponenten ein: ");
            int exponent = sc.nextInt();
            System.out.printf("%d hoch %d ist %d", basis, exponent, potenz(basis, exponent));
        } catch (InputMismatchException ignored) {
        }
    }

    public static int potenz (int x, int n) {
        return n == 0 ? 1 : x * potenz (x, n-1);
    }
}
