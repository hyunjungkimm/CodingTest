package codingTest.heap;

import java.util.*;

public class MoreSpicy {
    public static void main(String[] args) {
        int answer = 0;
        int[] scoville = {1, 2, 3, 9, 10, 12};
        int k = 7;

        Queue pq = new PriorityQueue();

        for(int i : scoville){
            if(i < k){
                pq.offer(i);
            }
        }

        Object obj = null;
        while((obj = pq.peek()) != null){
           int num = 0;
           num = (int)pq.poll() + ((int)pq.poll() * 2);
           if(num <  k){
               pq.offer(num);
               answer++;
           }else{
               answer++;
           }
        }
        System.out.println(answer);
    }

}


