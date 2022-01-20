package stack;

import java.util.*;

public class Printer {
    public static void main(String[] args) {
        int[] priorities = {1,1,9,1,1,1};
        int location = 0;
        int answer = 0;//5

        int[] arr = Arrays.stream(priorities).boxed().sorted(Collections.reverseOrder()).mapToInt(Integer::intValue).toArray();
        int num = 0;
        for(int i = 0; i<arr.length; i++){
            if(priorities[location] == arr[i]) {
                num++;
            }
        }

        if(num == 1){
            System.out.println(answer+1);//return answer;
        }else{
            System.out.println(answer);
        }

    }
}
