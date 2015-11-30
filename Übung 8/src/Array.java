import java.util.Arrays;
import java.util.function.Predicate;

/**
 * Created by frank on 30.11.15.
 */
public class Array {
    public static void main(String[] args) {
        System.out.println(spielen("spiel mit mir"));
        System.out.println(spielen("Apfel"));
    }

    public static String spielen(String text) {
        /*  Darf nicht wegen String-Methode 'indexOf( )' verwendet werden... : */
        // Predicate<Character> isVocal = c -> "AEIOUaeiou".indexOf(c) != -1;
        Predicate<Character> isVocal = Arrays.asList('A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u')::contains;

        String resultString = "";
        for (char c : text.toCharArray())
            resultString += c + (isVocal.test(c) ? "b" + Character.toLowerCase(c) : "");
        return resultString;
    }
}
