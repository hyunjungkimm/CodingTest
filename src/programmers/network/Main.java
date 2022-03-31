package programmers.network;


public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int n = 3;
        int[][] computers = {{1, 1, 0}, {1, 1, 0}, {0, 0, 1}};
        int result = solution.solution(n, computers);
        System.out.println(result);
    }
}
