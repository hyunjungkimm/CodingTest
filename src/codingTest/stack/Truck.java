package codingTest.stack;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

class Truck{
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        int sum = 0;

        Queue<Integer> queue = new LinkedList<>();

        for(int i = 0; i<truck_weights.length; i++){
            int truck = truck_weights[i];
            while(true){
                if(queue.isEmpty()){
                    queue.add(truck);
                    answer++;
                    sum+=truck;
                    break;
                }else if(bridge_length == queue.size()){
                    sum-=queue.poll();
                }else{
                    if(sum+truck <= weight){
                        queue.add(truck);
                        answer++;
                        sum+=truck;
                        break;
                    }else{
                        queue.add(0);
                        answer++;
                    }
                }
            }

        }

        return answer+bridge_length;
    }
}
