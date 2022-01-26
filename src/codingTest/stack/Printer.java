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

        priorities = Arrays.stream(priorities).boxed().sorted(Collections.reverseOrder()).mapToInt(Integer::intValue).toArray();

        System.out.println(Arrays.toString(priorities));
        System.out.println(map);
        for(int keySet : map.keySet()) {
            for (int i = 0; i < priorities.length; i++) {
                if (i == keySet) {
                    if (priorities[location] == map.get(keySet)) {
                        answer= i+1;
                    }
                }
            }
        }
        System.out.println(answer);
    }
}
