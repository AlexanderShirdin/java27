package lesson14;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class MultiMapImpl<K, V> extends HashMap<K, V> implements MultiMap<K, V> {
    private HashMap<K, List<V>> multiMap = new HashMap<>();

    @Override
    public int countValues(K key) {
        if (multiMap.get(key) == null) {
            return 0;
        }
        return multiMap.get(key).size();
    }

    @Override
    public V put(K key, V value) {
        if (multiMap.containsKey(key)) { // проверка если такой ключ есть
            List<V> values = multiMap.get(key); // достать коллекцию значений из этого ключа
            values.add(value); // добавить новое значение в конец этой коллекции
            multiMap.put(key, values); // вернуть обновленную коллекцию значений обратно в ключ
        } else {
            List<V> values = new LinkedList<>();
            values.add(value);
            multiMap.put(key, values);
        }
        return value;
    }

    @Override
    public Iterator<V> valuesIterator(K key) {
        return null;
    }
}