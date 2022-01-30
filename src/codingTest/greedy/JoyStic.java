package codingTest.greedy;

import java.util.ArrayList;
import java.util.List;

public class JoyStic {
    public int solution(String name) {
        int answer = 0;
        char[] arr = name.toCharArray();

        List<Integer> list = new ArrayList<>();
        list.add(0);

        for(int i = 0; i<arr.length; i++){
            int num = 0;
            if(arr[i] - 'A' <= 'Z' - arr[i] +1){
                num = arr[i] - 'A';
            }else{
                num = 'Z' - arr[i] + 1;
            }
            answer += num;

            if(arr[i] != 'A') {
                list.add(i);
            }
        }
        System.out.println(answer);

        for(int i = 0; i<list.size()-1; i++){
            int prev = 0;
            int next = 0;
            for(int j = i+1; j<=i+1; j++){
                next = list.get(j)- list.get(i);

            }

            for(int j = list.size()-i-1; j<=list.size()-i-1; j++){
                if(list.get(j) == arr[arr.length-1]){
                    prev = list.get(i) - 0 + 1;
                }else{
                    prev = list.get(j) - list.get(i);
                }
            }

            answer += Math.min(next,prev);
            System.out.println(answer);
        }

        System.out.println(list);
        return answer;
    }
}
