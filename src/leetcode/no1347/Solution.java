package leetcode.no1347;


public class Solution {
    public int minSteps(String s, String t) {
        int answer = 0;

        int[] arrS = new int[26];
        int[] arrT = new int[26];

        for(int j = 0; j < s.length(); j++){
            for(int i = 0; i<arrS.length; i++){
                if(s.charAt(j)-97 == i) {
                    arrS[i] += 1;
                }
                if(t.charAt(j)-97 == i){
                    arrT[i] += 1;
                }
            }
        }

        for(int i = 0; i<arrS.length; i++){
            if(arrS[i] != 0 || arrT[i] != 0){
                if(arrS[i] > arrT[i]){
                    arrT[i] = 0;
                }else{
                    arrT[i] = arrT[i] - arrS[i];
                }
            }
        }

        for(int i = 0; i<arrT.length; i++){
            answer+= arrT[i];
        }

        return answer;
    }
}
