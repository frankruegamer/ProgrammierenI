package Ausweise;

/**
 * Created by Frank on 29.12.2015.
 */
public class Studentenausweis extends Ausweis {

    private int kNummer;

    public Studentenausweis(String vorname, String nachname, String geschlecht, int kNummer) {
        super(vorname, nachname, geschlecht);
        this.kNummer = kNummer;
    }

    @Override
    public String toString() {
        return super.toString() + " k-Nummer: " + kNummer;
    }

    public int getkNummer() {
        return kNummer;
    }

    public void setkNummer(int kNummer) {
        this.kNummer = kNummer;
    }
}
