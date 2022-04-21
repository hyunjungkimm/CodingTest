package leetcode.no146;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class LRUCache {

    Map<Integer,Integer> map = new HashMap();
    int size = 0;
    int lateKey = -1;
    Queue<Integer> queue = new LinkedList<>();

    public LRUCache(int capacity) {
        map = new HashMap<>(capacity);
        size = capacity;
    }

    public int get(int key) {
        System.out.println(map.get(key));
        if(map.get(key)!=null){
            queue.poll();
            queue.add(key);
            return map.get(key);
        }else{
            return -1;
        }
    }


    public void put(int key, int value) {
        if(map.size()!=size){
            map.put(key, map.getOrDefault(map.get(key),value));
            queue.add(key);
        }else{
            if(map.get(queue.peek())!= null){
                map.remove(queue.poll());
                map.put(key, map.getOrDefault(map.get(key),value));
                queue.add(key);
            }
        }
        System.out.println(map);
    }
}


