package programmers.wordChange;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String begin = "hit";
        String target = "hhh";
        String[] words = {"hhh","hht"};

        int result = solution.solution(begin,target,words);
        System.out.println(result);
    }

}
