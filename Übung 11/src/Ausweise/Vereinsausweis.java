package Ausweise;

/**
 * Created by Frank on 29.12.2015.
 */
public class Vereinsausweis extends Ausweis {

    private String verein;

    public Vereinsausweis(String vorname, String nachname, String geschlecht, String verein) {
        super(vorname, nachname, geschlecht);
        this.verein = verein;
    }

    @Override
    public String toString() {
        return super.toString() + " , Verein: " + verein;
    }

    public String getVerein() {
        return verein;
    }

    public void setVerein(String verein) {
        this.verein = verein;
    }
}
