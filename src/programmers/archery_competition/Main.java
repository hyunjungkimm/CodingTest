package programmers.archery_competition;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int n = 10;
        int[] info = {0,0,0,0,0,0,0,0,3,4,3};
        int[] arr = solution.solution(n, info);
        System.out.println(Arrays.toString(arr));
    }
}
