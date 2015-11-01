/**
 * Created by Frank on 26.10.2015.
 */
public class Modulo {

    public static void main(String[] args) {
        modulo7(5);
        modulo7(-7);
        System.out.println((7)%(-5));
    }

    public static void modulo7(int zahl) {
        switch (zahl % 7) {
            case 0:
                System.out.printf("%d ist durch 7 teilbar.%n", zahl);
                break;
            default:
                System.out.printf("%d ist nicht durch 7 teilbar.%n", zahl);
                break;
        }
    }
}
