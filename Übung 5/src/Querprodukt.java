import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by Frank on 09.11.2015.
 */
public class Querprodukt {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Zahl ∈ [0; 1,000,000]:");
            try {
                int zahl = sc.nextInt();
                if (zahl < 0 || zahl > 1000000) throw new InputMismatchException("");
                System.out.printf("Q(%d) = %d", zahl, querprodukt(zahl));
                break;
            } catch (InputMismatchException e) {
                System.out.println("Geben Sie eine ganze Zahl zwischen 0 und 1 Mio. ein!\n");
                if (e.getMessage() == null) sc.nextLine();
            }
        }
        sc.close();
    }

    public static int querprodukt (int zahl) {
        int produkt = 1;
        do {
            produkt *= (zahl % 10);
            zahl /= 10;
        } while (zahl != 0);
        return produkt;
    }
}
