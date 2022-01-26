package codingTest.greedy;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class Solution2 {
    public int solution(int[] priorities, int location) {
        int answer = 0;

        int target_value = priorities[location];
        int pre_count = 0;

        List<Integer> list = Arrays.stream(priorities).boxed().collect(toList());
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);

        for(int i=0; i<location; i++) {
            if (target_value == priorities[i]) {
                pre_count++;
            }else if(target_value < priorities[i]){
                pre_count = 0;
            }
        }

        for(int i = 0; i<list.size(); i++){
            if(list.get(i) == target_value){
                answer= i + pre_count;
            }
        }

        return answer;
    }
}
