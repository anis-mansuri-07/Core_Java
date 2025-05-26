package YtCollection;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache<K, V> extends LinkedHashMap<K, V> {
    private int cap;

    public LRUCache(int cap) {
        super(cap, 0.3f, true);
        this.cap = cap;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return size() > cap;
    }

    public static void main(String[] args) {
        LRUCache<String, Integer> lru = new LRUCache<>(3);
        lru.put("Std1", 1);
        lru.put("Std2", 2);
        lru.put("Std3", 3);
        lru.get("Std1");
        lru.put("Std4", 4);

//        lru.get("Std1");
        // this will not consider because this entry was deleted when cap increase to 4
        System.out.println(lru + " " + lru.size());
    }
}
