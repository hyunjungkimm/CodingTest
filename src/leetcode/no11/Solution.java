package leetcode.no11;

/*
class Solution {
    public int maxArea(int[] height) {
        int[] arr = new int[height.length];
        int index = 0;
        int num = 0;
        int max = 0;

        for(int i = 0; i<height.length; i++){
            index = i;
            num = height[i];
            if(num < height.length){
                arr[i] = (Math.abs(num - index)) * height[num];
            }
        }

        for(int i = 0; i<arr.length; i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }

        return max;

    }
}
*/
public class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int result = 0;

        while(left < right){
            int limit = Math.min(height[right],height[left]);
            result = Math.max(result, limit *(right-left));

            if(height[left] == limit) left++;
            else right--;

        }
        return result;
    }
}
