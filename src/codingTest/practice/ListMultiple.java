package codingTest.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListMultiple {
    public int solution(int[] arr) {
        int answer = 0;
        int num = 0;
        Arrays.sort(arr);

        for(int i = arr[0]; i<=100; i++){
            boolean check = true;
            for(int j = 0; j<arr.length; j++){
                if(arr[j] % i != 0){
                    check = false;
                    break;
                }
            }

            if(check == true) {
                num = i;
                break;
            }
        }

        for(int i = 0; i <arr.length; i++){
            if(arr[i] == num) {
                answer += num;
            }else{
                answer *= (arr[i] / num);
            }
        }


        return answer;
    }
}
