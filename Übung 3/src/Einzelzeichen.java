/**
 * Created by Frank on 26.10.2015.
 */
public class Einzelzeichen {

    public static void main(String[] args) {
        einzelzeichen2('m');
        einzelzeichen2('a');
        einzelzeichen2('A');
        einzelzeichen2('1');

    }

    public static void einzelzeichen(char zeichen) {
        boolean def = false;
        System.out.print(zeichen + ":");
        if (Character.isUpperCase(zeichen)) {
            System.out.println("\tGroßbuchstabe");
            def = true;
        }
        if (Character.digit(zeichen, 16) != -1) {
            System.out.println("\tHexadezimale Ziffer");
            def = true;
        }
        if (Character.digit(zeichen, 8) != -1) {
            System.out.println("\toktale Ziffer");
        }
        if (Character.digit(zeichen, 2) != -1) {
            System.out.println("\tbinäre Ziffer");
        }
        if (!def) {
            System.out.println("\tUnbekannt");
        }
    }

    public static void einzelzeichen2 (char zeichen) {
        boolean def = false;
        System.out.print(zeichen + ":");
        if (zeichen >= 0x41 && zeichen <= 0x5A) {
            System.out.println("\tGroßbuchstabe");
            def = true;
        }
        if (zeichen >= 0x30 && zeichen <= 0x39 || zeichen >= 0x41 && zeichen <= 0x46 || zeichen >= 0x61 && zeichen <= 0x66) {
            System.out.println("\tHexadezimale Ziffer");
            def = true;
        }
        if (zeichen >= 0x30 && zeichen <= 0x37) {
            System.out.println("\toktale Ziffer");
        }
        if (zeichen == 0x30 || zeichen == 0x31) {
            System.out.println("\tbinäre Ziffer");
        }
        if (!def) {
            System.out.println("\tUnbekannt");
        }
    }
}
