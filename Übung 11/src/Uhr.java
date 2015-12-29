/**
 * Created by Frank on 29.12.2015.
 */
public class Uhr {

    private int sekunden;

    public Uhr (int std, int min, int sek) {
        if (!correct(std, min, sek)) {std = 12; min = 0; sek = 0;}
        setUhr(std, min, sek);
    }

    private boolean correct (int std, int min, int sek) {
        boolean stdCorrect = std >= 0 && std < 24;
        boolean minCorrect = min >= 0 && min < 60;
        boolean sekCorrect = sek >= 0 && sek < 60;
        return stdCorrect && minCorrect && sekCorrect;
    }

    public int getStd () {
        return sekunden / 3600;
    }

    public int getMin () {
        return (sekunden % 3600) / 60;
    }

    public int getSek () {
        return sekunden % 60;
    }

    public void setUhr (int std, int min, int sek) {
        if (!correct(std, min, sek)) return;
        sekunden = (std * 3600) + (min * 60) + sek;
    }

    public void naechsteSek () {
        sekunden = (sekunden + 1) % 86400;
    }

    public long getTagesSek () {
        return sekunden;
    }

    public boolean wecker (Uhr weckzeit) {
        return sekunden == weckzeit.getTagesSek();
    }
}
