package leetcode.no7;


public class Solution {
    public int reverse(int x) {
        int answer = 0;
        String temp ="";
        boolean minus = false;

        char[] arr = (x+"").toCharArray();


        for(int i = arr.length-1 ; i>=0; i--){
            if(arr[i] != '-'){
                temp+=arr[i];
            }else{
                minus = true;
            }
        }
        if(-2147483647 <= Long.parseLong(temp) && Long.parseLong(temp)<=2147483647) {
            if (!minus) {
                answer = Integer.parseInt(temp);
            } else {
                answer = -Integer.parseInt(temp);
            }
        }else{
            return 0;
        }


        return answer;
    }
}
