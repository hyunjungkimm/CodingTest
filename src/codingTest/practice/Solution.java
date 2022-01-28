package codingTest.practice;

import java.awt.print.Pageable;

public class Solution {
    int solution(int[][] land) {
        int answer = 0;


        for(int i = 0; i<land.length; i++) {
            for(int j = 0; j<land[i].length; j++){
                if(land[i][j] == 0){
                    answer++;
                }
            }
        }
        System.out.println(land.length);
        for(int i = land.length; i>0; i--){
            if(answer >= i*i) {
                answer = i * i;
                break;
            }

        }

        return answer;
    }
}
