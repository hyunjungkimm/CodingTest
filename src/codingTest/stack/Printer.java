package codingTest.stack;

import java.util.*;

public class Printer {
    public int solution(int[] priorities, int location) {
        int answer = 0;//3

        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());

        for(int num : priorities){
            queue.add(num);
        }

        while(!queue.isEmpty()){
            for(int i = 0; i<priorities.length; i++){
                if(queue.peek() == priorities[i]){
                    if(i == location){
                        answer++;
                        return answer;
                    }
                    queue.poll();
                    answer++;
                }
            }
        }

        return -1;
    }
}
