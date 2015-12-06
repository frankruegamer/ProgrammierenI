/**
 * Created by frank on 06.12.15.
 */
public class Parameterübergabe {

    public static void main(String[] args) {
        if (args.length != 2) {
            System.err.printf("*** Usage: %s number1 number2%n", Parameterübergabe.class.getCanonicalName());
            System.exit(1);
        }
        try {
            System.out.println(Integer.parseInt(args[0]) * Integer.parseInt(args[1]));
        } catch (NumberFormatException ignored) {
        }
    }
}