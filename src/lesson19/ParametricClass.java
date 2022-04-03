package lesson19;

public class ParametricClass {
    public static void main(String[] args) {
        Value<String> value = new Value<>("Java");
        Value<Integer> value2 = new Value<>(5);

        Pair<String, Integer> pair = new Pair<>("Vlad", 27);
        Pair<Double, String> pair2 = new Pair<>(3.14, "PI");
        pair.infoPair();
        pair2.infoPair();
//        value.info();
//        value2.info();
    }


}

class Value<T> {

    T value;

    public Value(T value) {
        this.value = value;
    }

    public void info() {
        System.out.println(value);
    }
}

class Pair<K, V> {
    K key;
    V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public void infoPair() {
        System.out.println("key " + key + " = " + "value " + value);
    }
}