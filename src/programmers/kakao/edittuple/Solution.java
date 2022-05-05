package programmers.kakao.edittuple;


import java.util.*;

class Solution {
    public String solution(int n, int k, String[] cmd) {
        String answer = "";
        Stack <Integer> deleteIndex = new Stack<>();

        for(int i = 0; i<cmd.length; i++){
            String[] sArr = cmd[i].split(" ");

            if(sArr[0].equals("D")){
                k+=Integer.parseInt(sArr[1]);
            }else if(sArr[0].equals("U")){
                k-=Integer.parseInt(sArr[1]);
            }else if(sArr[0].equals("C")){
                deleteIndex.add(k);
                n-=1;
                if(k == n) k-=1;
            }else{
                if(deleteIndex.pop() <= k) k++;
                n+=1;
            }
        }

        StringBuffer sb = new StringBuffer();

        for(int i = 0; i<n; i++){
            sb.append("O");
        }

        while(!deleteIndex.empty()){
            sb.insert(deleteIndex.pop(), "X");
        }

        return answer=sb.toString();
    }
}

class Main{
    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] cmd = {"D 2","C","U 3","C","D 4","C","U 2","Z","Z"};
        String answer = solution.solution(8, 2, cmd);
        System.out.println(answer);
    }
}