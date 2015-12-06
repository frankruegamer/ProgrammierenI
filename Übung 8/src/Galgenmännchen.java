import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Random;
import java.util.Scanner;
import java.util.function.Consumer;

/**
 * Created by frank on 30.11.15.
 */
public class Galgenmännchen {

    private static final String[] wordList = {
            "Programmiersprache",
            "Fachhochschule",
            "Vorlesung",
            "Deklaration",
            "Methode",
            "Attribut",
            "Referenz",
            "Parameter",
            "Operator",
            "Interface",
            "Klasse",
            "Objekt",
            "Enumeration",
            "Rekursion",
            "Datentyp",
            "",
            "",
            "",
            "",
            ""
    };

    public static void main(String[] args) {
        String loesung = wordList[new Random().nextInt(wordList.length)];
        char[] eingabe = new char[loesung.length()];
        Arrays.fill(eingabe, '_');

        /* Rateschliefe */
        int versuch = 1;
        while (!String.valueOf(eingabe).equals(loesung) && versuch <= 15) {
            Consumer<char[]> display = (cc) -> {
                for (char c : cc)
                    System.out.printf("%s ", c);
            };
            System.out.printf("%d. Versuch: ", versuch);
            display.accept(eingabe);
            System.out.println();
            try (Scanner sc = new Scanner(System.in)) {
                char input = sc.nextLine().charAt(0);
                int localindex = 0;
                int index = loesung.indexOf(input, localindex);
                while (index != 0) {
                    eingabe[index] = loesung.charAt(index);
                    index = loesung.indexOf(input, ++localindex);
                }
            }
            versuch++;
        }
    }
}
