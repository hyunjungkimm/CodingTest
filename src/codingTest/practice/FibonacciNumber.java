package codingTest.practice;

import java.util.ArrayList;
import java.util.List;

public class FibonacciNumber {
    public int solution(int n) {
        int answer = 0;

        List<Integer> list = new ArrayList<>();

        for(int i = 0; i<=n ;i ++){
            if(i < 2){
                list.add(i);
            }else{
                list.add((list.get(i-1)+ list.get(i-2)) % 1234567);
            }
        }

        answer = list.get(n);

        return answer;
    }
}
