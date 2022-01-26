package codingTest.heap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Hotter {
    public static void main(String[] args) {
        int answer = 0;
        int[] scoville = {1, 2, 3, 9, 10, 12};
        int K = 7;

        Arrays.sort(scoville);
        List<Integer> list = new ArrayList<>();

        for(int i : scoville){
           if(i<7) list.add(i);
        }

        for(int i = 0; i<list.size(); i++) {
            for(int j = i+1; j<list.size(); j++) {
                if (list.get(i) + (list.get(j) * 2) >= 7) {
                    answer++;
                    list.remove(i);
                    list.remove(i);
                    i--;
                } else {
                    answer++;
                    list.set(i, list.get(i) + (list.get(j) * 2));
                    list.remove(j);
                    i--;
                }
            }
        }
        System.out.println(list);
        System.out.println(answer);
    }

}


