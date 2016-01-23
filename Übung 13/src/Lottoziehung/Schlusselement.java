package Lottoziehung;

/**
 * Created by Frank on 20.01.2016.
 */
public class Schlusselement<T> extends Listenelement<T> {

    @Override
    public Datenelement<T> push(T daten) {
        return new Datenelement<T>(daten);
    }

    @Override
    public T get(int n, int x) {
        return null;
    }

    @Override
    public Listenelement<T> delete(int n, int x) {
        return this;
    }

    @Override
    public String toString() {
        return "]";
    }

    @Override
    public String join(String s) {
        return "";
    }
}
