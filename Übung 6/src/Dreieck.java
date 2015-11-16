/**
 * Created by frank on 16.11.15.
 */
public class Dreieck {

    public static void main(String[] args) {
        dreieckRecht(5);
        dreieckGleich(5);
    }

    public static void dreieckRecht (int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println(new String(new char[i]).replace("\0", "* "));
        }
    }

    public static void dreieckGleich (int n) {
        for (int i = 1; i <= n; i++) {
            System.out.print(new String(new char[n-i]).replace("\0", " "));
            System.out.println(new String(new char[i]).replace("\0", "* "));
        }
    }
}
