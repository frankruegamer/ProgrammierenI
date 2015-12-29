package Ausweise;

/**
 * Created by Frank on 29.12.2015.
 */
public class Ausweis {

    private String vorname, nachname, geschlecht;

    public Ausweis(String vorname, String nachname, String geschlecht) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.geschlecht = geschlecht;
    }

    @Override
    public String toString() {
        return String.format("%s %s (%s)", vorname, nachname, geschlecht);
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public String getGeschlecht() {
        return geschlecht;
    }

    public void setGeschlecht(String geschlecht) {
        this.geschlecht = geschlecht;
    }
}
