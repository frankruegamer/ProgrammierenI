package Hochschule;

/**
 * Created by frank on 15.12.15.
 */
public class Student {

    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        boolean result = false;
        if (o instanceof Student)
            result = this.name.equals(((Student) o).getName());
        return result;
    }
}
