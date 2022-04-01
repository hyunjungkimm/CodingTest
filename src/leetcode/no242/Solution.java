package leetcode.no242;

import java.util.Arrays;

public class Solution {
    public boolean isAnagram(String s, String t) {
        boolean answer = true;

        char[] sToChar = s.toCharArray();
        Arrays.sort(sToChar);

        char[] tToChar = t.toCharArray();
        Arrays.sort(tToChar);

        if(sToChar.length == tToChar.length) {
            for(int i = 0; i<tToChar.length; i++){
                if(sToChar[i] != tToChar[i]){
                    answer =false;
                    break;
                }
            }
        }else{
            answer = false;
        }
        return answer;
    }
}
