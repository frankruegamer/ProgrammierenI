/**
 * Created by frank on 16.11.15.
 */
public class Runden {

    public static void main(String[] args) {
        System.out.println(runden(5.94));
        // -> 6
        System.out.println(runden(5.34));
        // -> 5
        System.out.println(runden(5));
        // -> 5
    }

    public static int runden (double zahl) {
        if ((int) ((zahl - (int)zahl)*10) < 5) {
            return (int) zahl;
        } else {
            return (int) zahl+1;
        }
    }
}
