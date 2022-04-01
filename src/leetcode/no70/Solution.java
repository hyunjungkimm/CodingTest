package leetcode.no70;

public class Solution {
    public int climbStairs(int n) {
        int answer = 0;

        int[] arr = new int[n+1];

        for(int i = 0; i<=n; i++){
            if(i == 0 || i == 1){
                arr[i] = 1;
            }else{
                arr[i] = arr[i-1] + arr[i-2];
            }
        }


        return arr[n];
    }

}
