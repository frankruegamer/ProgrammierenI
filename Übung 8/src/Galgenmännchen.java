import java.util.Arrays;
import java.util.InputMismatchException;
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
            "Java",
            "Compiler",
            "Integer",
            "String",
            "Debuggen"
    };

    public static void main(String[] args) {
        String loesung = wordList[new Random().nextInt(wordList.length)];
        char[] template = loesung.toCharArray();
        char[] eingabe = new char[template.length];
        Arrays.fill(eingabe, '_');

        Scanner sc = new Scanner(System.in);
        /* Rateschliefe */
        for (int versuch = 1; versuch <= 15; versuch++) {
            Consumer<char[]> display = (cc) -> {
                for (char c : cc)
                    System.out.printf("%s ", c);
            };
            System.out.printf("%d. Versuch: ", versuch);
            display.accept(eingabe);
            System.out.println();
            try {
                char input = Character.toLowerCase(sc.nextLine().charAt(0));
                while (true) {
                    int index = String.valueOf(template).toLowerCase().indexOf(input);
                    if (index == -1) break;
                    eingabe[index] = template[index];
                    template[index] = '\0';
                }
            } catch (InputMismatchException ignored) {
            }
            if (String.valueOf(template).replace("\0", "").equals("")) {
                System.out.println("Glückwunsch!");
                break;
            }
        }
        System.out.println("Richtige Lösung: " + loesung);
    }
}
