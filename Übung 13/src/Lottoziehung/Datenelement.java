package Lottoziehung;

/**
 * Created by Frank on 20.01.2016.
 */
public class Datenelement<T> extends Listenelement<T> {

    T data;
    Listenelement<T> nachfolger = new Schlusselement<T>();

    public Datenelement (T data) {
        this.data = data;
    }

    public Datenelement<T> push(T data) {
        nachfolger = nachfolger.push(data);
        return this;
    }

    public T get(int n, int x) {
        return (n == x) ? data : nachfolger.get(n, x + 1);
    }

    @Override
    public Listenelement<T> delete(int n, int x) {
        if (n == x) {
            return nachfolger;
        } else {
            nachfolger = nachfolger.delete(n, x + 1);
            return this;
        }
    }

    @Override
    public String toString() {
        return String.format(",%s", data) + nachfolger;
    }

    @Override
    public String join(String s) {
        return String.format("%s%s", s, data) + nachfolger.join(s);
    }
}
