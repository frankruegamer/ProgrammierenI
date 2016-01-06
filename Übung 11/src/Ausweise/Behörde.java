package Ausweise;

/**
 * Created by Frank on 29.12.2015.
 */
public class Behörde {

    public Ausweis[] erzeugeAusweise () {
        return new Ausweis[] {
            new Ausweis ("Bilbo", "Beutlin", "männlich"),
            new Ausweis ("Drogo", "Beutlin", "männlich"),
            new Studentenausweis ("Frodo", "Beutlin", "männlich", 3791),
            new Studentenausweis ("Sam", "Gamdschie", "männlich", 2980),
            new Vereinsausweis ("Merry", "Brandybock", "männlich", "Die Gefährten"),
            new Vereinsausweis ("Pippin", "Tuk", "männlich", "Die Gefährten")
        };
    }

    private void datenAusgabe (Ausweis[] aa) {
        for (int i = 0; i < aa.length; i++)
            if (aa[i] == null) System.out.printf("Dieser Index %d ist nicht belegt%n", i);
            else System.out.println(aa[i]);
    }
}
