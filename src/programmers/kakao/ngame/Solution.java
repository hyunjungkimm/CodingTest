package programmers.kakao.ngame;


class Solution {
    public String solution(int n, int t, int m, int p) {
        String answer = "";
        StringBuffer temp = new StringBuffer();
        int[] indexArr = new int[t];

        for(int i = 0; i<t; i++){
            indexArr[i] = p-1;
            p+=m;
        }
        for(int i = 0; i<t*m ; i++){
            temp.append(Integer.toString(i, n).toUpperCase());
        }

        for(int i = 0; i<indexArr.length; i++){
            answer += temp.charAt(indexArr[i]);
        }
        return answer;
    }
}

class Main{
    public static void main(String[] args) {
        Solution solution = new Solution();
        String answer = solution.solution(16,16,2,1);
        System.out.println(answer);
    }
}
