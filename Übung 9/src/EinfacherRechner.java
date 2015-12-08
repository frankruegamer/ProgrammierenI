/**
 * Created by frank on 08.12.15.
 */
public class EinfacherRechner {

    public static void main(String[] args) {
        int ergebnis = 0;
        for (int i = 1; i < args.length-1; i++)
            ergebnis += Integer.parseInt(args[i]);
        ergebnis = Integer.parseInt(args[0]) + (args[args.length-1].equals("+") ? ergebnis : -ergebnis);
        System.out.println(ergebnis);
    }
}
