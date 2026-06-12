package generics_06.pair;

public class Pair<K, V> {
    private K key;
    private V value;
    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public void print()
    {
        System.out.println("key = " + getKey() + " value = " + getValue());
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }
}
