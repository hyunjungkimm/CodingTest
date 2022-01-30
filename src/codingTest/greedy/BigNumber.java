package codingTest.greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BigNumber {
    public String solution(String number, int k) {
        String answer = "";

        char[] arr = number.toCharArray();
        List<Integer> listPre = new ArrayList<>();
        List<Integer> listAfter = new ArrayList<>();
        int num = (number.length() - k) / 2;
        System.out.println(num);

        for(int i = 0; i<arr.length; i++){
            if(i < arr.length -num){
                listPre.add(arr[i]-48);
            }else{
                listAfter.add(arr[i]-48);
            }
        }
        Collections.sort(listPre, Collections.reverseOrder());

        for(int i = 0; i<num; i++){
            answer+=listPre.get(i);
        }
        if (listPre.get(num) < listAfter.get(0)) {
            for (int i = 0; i < listAfter.size(); i++) {
                answer += listAfter.get(i);
            }
        }

        return answer;
    }
}
