package codingTest.hash;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Camouflage {
    public static void main(String[] args) {
        int answer= 1;
        String[][] clothes = {{"yellowhat", "headgear"}, {"bluesunglasses", "eyewear"}, {"green_turban", "headgear"}};

        Map<String, Integer> map = new HashMap<>();

        for(String[] clothe: clothes){
            String key = clothe[1];
            map.put(key, map.getOrDefault(key, 0)+1);
        }
        Iterator<Integer> it = map.values().iterator();

        while(it.hasNext()){
            answer *= it.next().intValue() +1;

        }
        System.out.println(answer-1);
    };
}
