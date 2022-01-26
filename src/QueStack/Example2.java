package QueStack;

import java.util.PriorityQueue;
import java.util.Queue;

public class Example2 {
    public static void main(String[] args) {
        Queue pq = new PriorityQueue();

        pq.offer(3); //원래는 pq.offer(new Integer(3));으로 해야 하는데 오토박싱 된 것
        pq.offer(1);
        pq.offer(5);
        pq.offer(2);
        pq.offer(4);
        System.out.println(pq);

        Object obj = null;

        //PriorityQueue에 저장된 요소를 하나씩 꺼낸다
        while((obj = pq.poll()) !=null)
            System.out.println(obj);

    }
}
