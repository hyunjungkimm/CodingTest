package codingTest.heap;

import java.util.PriorityQueue;
import java.util.Queue;

public class Scoville {
    public int solution(int[] scoville, int K) {
        int answer = 0;

        Queue pq = new PriorityQueue();

        for(int i : scoville){
            if(i <= K){
                pq.offer(i);
            }
        }

        Object obj = null;
        while((int)(obj = pq.peek()) < K){
            int num = 0;
            if(pq.size() >= 2) {
                num = (int) pq.poll() + ((int) pq.poll() * 2);
            }else{
                return -1;
            }

            pq.offer(num);
            answer++;

            if(answer > scoville.length) return -1;

        }
        return answer;
    }
}
