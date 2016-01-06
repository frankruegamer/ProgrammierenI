package Hochschule;

/**
 * Created by frank on 15.12.15.
 */
public class Vorlesung {

    private String name, dozent, studiengang;

    public Vorlesung(String name, String dozent, String studiengang) {
        this.name = name;
        this.dozent = dozent;
        this.studiengang = studiengang;
    }

    @Override
    public String toString() {
        return name;
    }
}
