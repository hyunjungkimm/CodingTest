package codingTest.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListMultiple {
    public int solution(int[] arr) {
        int answer = 0;
        Arrays.sort(arr);

        int num = arr[0];
        for(int i = 1; i< arr.length ; i++){
            int max = Math.max(num, arr[i]);
            for(int j = max; j<=num*arr[i]; j++){
                if(j % arr[i] == 0 & j % num ==0){
                    num = j;
                    break;
                }
            }
        }

        answer = num;

        return answer;
    }
}
