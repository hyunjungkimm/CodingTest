package QueStack;

import java.util.Collections;
import java.util.PriorityQueue;

public class Example3 {
    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());

        priorityQueue.add(1);
        priorityQueue.add(2);
        priorityQueue.add(3);
        priorityQueue.add(4);

        System.out.println(priorityQueue);//[4,3,2,1]
    }
}
