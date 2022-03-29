package programmers.matrix_multiplication;

import java.util.Collections;

public class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[Math.max(arr1.length, arr2.length)][Math.max(arr1[0].length, arr2[0].length)];
        int i = 0;
        int y = 0;

        while(i != arr1.length){
            int sum = 0;
            for(int j = 0; j<arr1[i].length; j++){
               sum +=  arr1[i][j] * arr2[j][i];
            }
            answer[i][y] = sum;
            y++;

            if(y % 2 ==0) i++;
        }



        return answer;
    }
}
