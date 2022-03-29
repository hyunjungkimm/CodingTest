package programmers.rotate_matrix_borders;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int rows = 6;
        int columns = 6;
        int[][] queries = {{2,2,5,4},{3,3,6,6},{5,1,6,3}};
        int[] result = solution.solution(rows, columns, queries);
        System.out.println(result);
    }
}
