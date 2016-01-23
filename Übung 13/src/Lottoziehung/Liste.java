package Lottoziehung;

/**
 * Created by Frank on 20.01.2016.
 */
public class Liste<T> {

    Listenelement<T> anfang = new Schlusselement<T>();

    public void push(T data) {
        anfang = anfang.push(data);
    }

    public T get (int n) {
        return anfang.get(n, 0);
    }

    public T take (int n) {
        T element = get(n);
        delete(n);
        return element;
    }

    public void delete (int n) {
        anfang = anfang.delete(n, 0);
    }

    @Override
    public String toString() {
        return ("[" + anfang).replaceFirst(",", "");
    }

    public String join(String s) {
        return (anfang.join(s)).replaceFirst(s, "");
    }
}
