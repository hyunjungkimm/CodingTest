package leetcode.no64;

public class Solution {
    public int minPathSum(int[][] grid) {
        int[][] arr = new int[grid.length][grid[0].length];

        for(int i = 0; i<grid.length; i++){
            for(int j = 0; j<grid[i].length; j++){
                if(i == 0 && j ==0 ){
                    arr[0][0] = grid[0][0];
                }else if(j == 0){
                    arr[i][j] = grid[i][j] + arr[i-1][j];
                }else if(i == 0){
                    arr[i][j] = grid[i][j] + arr[i][j-1];
                }else{
                    arr[i][j] = Math.min((grid[i][j] + arr[i][j-1]),(arr[i-1][j] + grid[i][j]));
                }
            }
        }
        return arr[grid.length-1][grid[0].length-1];
    }

}


/*

public class Solution {
    static int min = Integer.MAX_VALUE;

    public int minPathSum(int[][] grid) {
        def(0,0, grid,0);
        int answer = min;
        min = Integer.MAX_VALUE;
        return answer;
    }

    public static void def(int row, int column, int[][] grid, int sum){
        if(row == grid.length || column == grid[0].length){
            if(row == grid.length && column == grid[0].length-1){
                min = Math.min(sum, min);
            }
            return;
        }

        def(row+1, column, grid, sum+grid[row][column]);
        def(row, column+1, grid, sum+grid[row][column]);
    }
}
*/
