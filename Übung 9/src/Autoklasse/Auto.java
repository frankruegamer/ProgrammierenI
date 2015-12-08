package Autoklasse;

/**
 * Created by frank on 08.12.15.
 */
public class Auto {

    private String marke;
    private String modell;
    private int hubraum;
    private String farbe;

    public static Auto DUMMY = new Auto() {
        private int hubraum = 0;
    };

    private Auto () { }

    public Auto (String marke, String modell, int hubraum, String farbe) {
        this.marke = marke;
        this.modell = modell;
        this.hubraum = hubraum > 0 ? hubraum : 1600;
        this.farbe = farbe;
    }

    @Override
    public String toString () {
        return String.format("%s %s, %d ccm (%s)", this.marke, this.modell, this.hubraum, this.farbe);
    }

    public int getHubraum () {
        return this.hubraum;
    }

    public void setHubraum (int ccm) {
        if (ccm > 0)
            this.hubraum = ccm;
    }
}
