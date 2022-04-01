package leetcode.no1;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] output = new int[2];

        for(int i = 0; i< nums.length; i++){
            int sum = nums[i];
            for(int j = i+1; j<nums.length; j++){
                if((sum+nums[j]) == target){
                    output[0] = i;
                    output[1] = j;
                    return output;
                }
            }
        }
        return output;
    }
}