package programmers.wordChange;

public class Solution {
    static boolean[] visited;
    static int answer = 0;
    public int solution(String begin, String target, String[] words) {
        visited = new boolean[words.length];
        dfs(words, 0, begin, target);
        return answer;
    }

    static void dfs(String[] words,int depth, String begin, String target) {
        if(begin.equals(target)) {
            if (answer >= depth || answer == 0) {
                answer = depth;
            }
            return;
        }

        for(int i = 0; i<words.length; i++){
            if(visited[i]) continue;

            int count = 0;
            for(int j = 0; j<begin.length(); j++){
                if(begin.charAt(j) == words[i].charAt(j)){
                    count++;
                }
            }

            if(count == begin.length()-1){
                visited[i] = true;
                dfs(words, depth+1,  words[i], target);
                visited[i] = false;
            }
        }

    }

}
