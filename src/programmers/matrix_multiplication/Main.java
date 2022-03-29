package programmers.matrix_multiplication;

public class Main{
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] arr1 = {{1, 4}, {3, 2}, {4, 1}};
        int[][] arr2 = {{3, 3}, {3, 3}};
        int[][] answer = solution.solution(arr1, arr2);
        System.out.println(answer);
    }
}
