package codingTest;

import java.util.ArrayList;
import java.util.List;

//소수 구하기
public class Decimal {
    public static void main(String[]args){
        //int[]nums = {1,2,3,4};
        int[]nums = {1,2,7,6,4};
        int answer= 0;
        List<Integer> list = new ArrayList<>();

        for(int i =0; i<nums.length; i++){
            if(i+2 >= nums.length) break;
            for(int j = i+1; j<nums.length; j++){
                for(int z = j+1; z<nums.length; z++){
                    list.add(nums[i]+nums[j]+nums[z]);
                }
            }
        }

        for(int i =0; i<list.size(); i++){
            int count = 0;
            for(int j= 2; j<list.get(i); j++){
                if(list.get(i) % j ==0) count++;
            }
            if(count==0){
                answer++;
            }
        }
        System.out.println(answer);
    }
}
