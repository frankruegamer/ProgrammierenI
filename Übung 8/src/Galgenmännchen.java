import java.util.*;
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
        char[] temp = loesung.toCharArray();
        char[] eingabe = new char[temp.length];
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
                do {
                    int index = String.valueOf(temp).toLowerCase().indexOf(input);
                    if (index == -1) break;
                    eingabe[index] = temp[index];
                    temp[index] = '\0';
                } while (true);
            } catch (InputMismatchException ignored) {
            }
            if (new String(temp).replace("\0", "").equals("")) {
                System.out.println("Glückwunsch!");
                break;
            }
        }
        System.out.println("Richtige Lösung: " + loesung);
    }
}
