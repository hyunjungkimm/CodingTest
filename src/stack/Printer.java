package stack;

import java.util.*;

public class Printer {
    public static void main(String[] args) {
        int[] priorities = {1,2,3};
        int location = 0;
        int answer = 0;//3

        Map<Integer,Integer> map = new LinkedHashMap<>();

        for(int i = 0; i < priorities.length; i++){
            map.put(i, priorities[i]);
        }
/*

        int pos = 1;
        int value = (new ArrayList<Integer>(map.values())).get(pos);
*/

        for(int i = 0; i < map.size(); i++){
            int value = map.get(i);
            for(int j = i+1; j < map.size(); j++){
                if(map.get(i) < map.get(j)) {
                    map.remove(i);
                    map.put(i, value);
                }

            }
            System.out.println(map);
        }

        Iterator<Integer> iterator = map.keySet().iterator();

        while (iterator.hasNext()){
            int key = iterator.next();

            answer++;
            if(location == key){
                break;
            }
        }

        System.out.println(answer);
    }
}
