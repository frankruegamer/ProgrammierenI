package Hochschule;

import java.util.Arrays;

/**
 * Created by frank on 15.12.15.
 */
public class Raum {

    //region Aufgabe 2
    private String kennung;
    private int maxStudenten;
//    private boolean belegt = false;
    //endregion

    //region Aufgabe 3
    private Vorlesung belegung;

    //region Aufgabe 4
    private Student[] studenten;


    public Raum(String kennung, int maxStudenten) {
        this.kennung = kennung;
        this.maxStudenten = maxStudenten;
        studenten = new Student[maxStudenten];
    }

    //region Aufgabe 2
//    public void belegen () {
//        belegt = true;
//    }
//
//
//    public boolean istBelegt () {
//        return belegt;
//    }
    //endregion

    //region Aufgabe 3
    public void belegen (Vorlesung v) {
        belegung = v;
    }

    public Vorlesung istBelegt () {
        return belegung;
    }
    //endregion

    //region Aufgabe 4
    public void betreteRaum (Student s) {
        for (int i = 0 ; i < maxStudenten; i++)
            if (studenten[i] == null) {
                System.out.printf("%s betritt %s.%n", s, this.kennung);
                studenten[i] = s;
                break;
            } else if (studenten[i].equals(s)) break;
    }

    public void verlasseRaum (Student s) {
        for (int i = 0; i < maxStudenten; i++) {
            boolean repeat = false;
            do if (studenten[i] == null) {
                repeat = false;
                if (i + 1 == maxStudenten) continue;
                studenten[i] = studenten[i + 1];
                studenten[i + 1] = null;
            } else if (studenten[i].equals(s)) {
                System.out.printf("%s verlässt %s.%n", s, this.kennung);
                studenten[i] = null;
                repeat = true;
            } while (repeat);
        }
    }
    //endregion

    public void listStudenten () {
        System.out.println(Arrays.toString(studenten));
    }
}
