package leetcode.no146;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache2 extends LinkedHashMap<Integer,Integer> {

    private final int capacity;

    public LRUCache2(int capacity) {
        super(capacity, 0.75f, true);//order 속성 true , 0.75가 최적값
        this.capacity = capacity;
    }

    public int get(int key) {
        return super.getOrDefault(key, -1);//값이 존재하지 않으면 -1 반환
    }

    public void put(int key, int value) {
        super.put(key, value);
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<Integer, Integer> eldest){
        return size() > capacity;
    }

}
