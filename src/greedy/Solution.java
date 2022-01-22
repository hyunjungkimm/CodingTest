package greedy;

import static java.util.stream.Collectors.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;

        int target_value = priorities[location];
        int pre_count = 0;
        int after_count = 0;
        int maxI = 0;

        List<Integer> list = Arrays.stream(priorities).boxed().collect(toList());
        Collections.sort(list, Collections.reverseOrder());

        for(int i = 0; i<list.size(); i++){
            if(list.get(0) == priorities[i]) maxI = i;
        }

        for(int i=0; i<location; i++) {
            if(target_value == priorities[i]) {
                pre_count++;
            }else if(target_value < priorities[i]){
                pre_count = 0;
            }
        }
        for(int i=maxI+1; i<priorities.length; i++) {
            if(target_value == priorities[i] && i != location) {
                after_count++;
            }
        }
        for(int i=0; i<priorities.length; i++) {
            if(target_value == list.get(i)) {
                if(pre_count == 0) {
                    answer = i+1+after_count;
                    break;
                } else{
                    pre_count --;
                }
            }
        }

        return answer;
    }

}