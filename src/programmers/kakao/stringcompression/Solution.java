package programmers.kakao.stringcompression;

class Solution {
    public int solution(String s) {
        int answer = s.length();

        for(int i = 1; i<=s.length()/2; i++) {
            int count = 1;
            String nowStr = s.substring(0, i);
            StringBuffer sb = new StringBuffer();
            for (int j = i; j <= s.length(); j+=i) {
                String nextStr = s.substring(j, j+i > s.length() ? s.length() : i+j);
                if(nowStr.equals(nextStr)) count++;
                else{
                    sb.append((count != 1 ? count : "") + nowStr);
                    nowStr = nextStr;
                    count = 1;
                }
            }
            sb.append(nowStr);
            answer = Math.min(answer, sb.length());
        }

        return answer;
    }
}

class answer{
    public static void main(String[] args) {
        String s = "aabbaccc";
        Solution solution = new Solution();
        int answer = solution.solution(s);
        System.out.println(answer);
    }
}
