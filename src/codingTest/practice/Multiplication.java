package codingTest.practice;

import java.util.Arrays;

public class Multiplication {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr1[0].length];

        for(int i = 0; i<arr1.length; i++){
            int sum = 0;
            for(int j = 0; j<arr1[i].length; j++){
                sum += arr1[i][j] * arr2[j][i];
            }
            System.out.println(sum);
        }
        return answer;
    }

    public static void main(String[] args) {
        int[][] arr1 = {{2,3,2},{4,2,4},{3,1,4}};
        int[][] arr2 = {{5,4,3},{2,4,1},{3,1,1}};

        Multiplication multiplication = new Multiplication();
        System.out.println(Arrays.toString(multiplication.solution(arr1, arr2)));
    }
}
