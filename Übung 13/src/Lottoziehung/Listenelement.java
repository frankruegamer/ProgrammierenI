package Lottoziehung;

/**
 * Created by Frank on 20.01.2016.
 */
public abstract class Listenelement<T> {

    public abstract Datenelement<T> push(T daten);

    public abstract T get(int n, int x);
    public abstract Listenelement<T> delete(int n, int x);

    @Override
    public abstract String toString();
    public abstract String join(String s);
}
