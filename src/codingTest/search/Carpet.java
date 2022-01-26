package codingTest.search;

import java.util.*;

public class Carpet {
    public static void main(String[] args) {
        int brown = 10;
        int yellow = 2;
        int[] answer = new int[2];//가로 세로 길이

        //brown * yellow
        int sum = brown + yellow;
        for(int i = sum; i > 0 ; i--){
            if(sum/i > i) break;

            if(sum % i == 0){
                if(yellow == (i-2) * (sum/i-2)){
                    answer[0] = i;
                    answer[1] = sum/i;
                }
            }
        }
        System.out.println(Arrays.toString(answer));
    }
}
