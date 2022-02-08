package codingTest.heap;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class DiskController {
    public int solution(int[][] jobs) {
        int answer = 0;
        int answer2 = 0;

        for(int i = 0; i< jobs.length; i++){
            if(i == 0){
                answer += jobs[i][1];
            }else{
                if(jobs[i-1][1]>jobs[i][0]){
                    answer += jobs[i][1] - jobs[i][0] +((jobs[i-1][1] - jobs[i][0]));
                }else{
                    answer += jobs[i][1];
                }
            }
            System.out.println(answer);
        }

        return answer/ jobs.length;

    }
}
