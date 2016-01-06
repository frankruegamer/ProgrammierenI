package Hochschule;

/**
 * Created by frank on 16.12.15.
 */
public class Hochschule {

    public static void main(String[] args) {
        Raum raum1 = new Raum("I.2.15", 20);
        Raum raum2 = new Raum("I.2.1", 20);
        for (int i = 0; i <= 1; i++) {
            System.out.println("Raum 1: " + raum1.istBelegt());
            System.out.println("Raum 2: " + raum2.istBelegt());
            if (i == 0) raum1.belegen(new Vorlesung("Programmieren I", "Heinzl", "BIN"));
        }
        Student[] studenten = {
                new Student("Peter"),
                new Student("Hans"),
                new Student("Elisabeth"),
                new Student("Franz"),
                new Student("Hildegard")
        };
        for (int i = 0; i <= 1; i++) {
            for (Student s : studenten)
                if (i == 0) raum1.betreteRaum(s);
                else raum1.verlasseRaum(s);
            raum1.listStudenten();
        }
    }
}
