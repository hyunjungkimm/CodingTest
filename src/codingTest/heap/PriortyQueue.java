package codingTest.heap;

import java.util.*;

public class PriortyQueue {
    public int[] solution(String[] operations) {
        int[] answer = {};

        ArrayDeque<Integer> queue =  new ArrayDeque<>();
        for(String s : operations){
            if(s.indexOf("I") != -1) {
                int intStr = Integer.parseInt(s.replaceAll("I ", ""));
                if(queue.isEmpty()) queue.offer(intStr);
                else if(intStr > (int)queue.peekLast()){
                    queue.addLast(intStr);
                }else if(intStr < (int) queue.peekFirst()){
                    queue.addFirst(intStr);
                }
            }else if(s.contains("D 1")){
                queue.pollLast();
            }else if(s.indexOf("D -1") != -1){
                queue.pollFirst();
            }
            System.out.println(queue);
        }

        if(queue.isEmpty()) answer =new int[]{0,0};
        else{
            answer = new int[]{queue.pollLast(), queue.pollFirst()};
        }
        return answer;
    }
}
