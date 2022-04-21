package leetcode.no344;

class Solution {
    public void reverseString(char[] s) {
        char[] output = new char[s.length];
        int index = 0;

        for(int i = s.length-1; i>=0; i--){
            output[index] = s[i];
            index++;
        }

        for(int i = 0; i<s.length; i++){
            s[i] = output[i];
        }
    }
}