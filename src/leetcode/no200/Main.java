package leetcode.no200;

public class Main {
    public static void main(String[] args) {
        char[][] grid = {{'1','0','1','1','0','1','1'}};
        Solution solution = new Solution();
        int answer = solution.numIslands(grid);
        System.out.println(answer);
    }
}
