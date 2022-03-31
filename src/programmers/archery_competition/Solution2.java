package programmers.archery_competition;

import java.util.*;

public class Solution2 {
    public int[] solution(int n, int[] info) {
        int[] answer = {};
        int count = 0;
        int[] arr = new int[info.length];

        for(int i = 0; i<info.length; i++){
            if(i ==0 && n == 1 && info[0] >= 1){
                answer = new int[]{-1};
                break;
            }else if(n > 0){
                if(info[i] == 0){
                    if(n > 0){
                        arr[i] = 1;
                        n-=1;
                    }
                }else if(info[i] == 1){
                    if(n > 1){
                        arr[i] = 2;
                        n-=2;
                    }
                }
                count++;
            }else{
                break;
            }
        }

        if(n != 0){
            arr[10] = n;
        }

        if(count != 0){
            answer = new int[info.length];
            answer = arr;
        }
        return answer;
    }
}
