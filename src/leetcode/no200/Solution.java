package leetcode.no200;

import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int numIslands(char[][] grid) {
        int answer = 0;
        int m = grid.length;
        int n = grid[0].length;
        int count = 0;


        boolean visited[][] = new boolean[m][n]; //방문 여부


        for(int i = 0; i<m; i++){
            for(int j = 0; j<n ; j++){
                if(grid[i][j] == '1' && !visited[i][j]) {
                    bfs_list(i, j, grid, visited);
                    answer++;
                }
            }
        }



        return answer;
    }

    public static void bfs_list(int i, int j, char[][] grid, boolean[][] visited) {
        Queue<int[][]> queue = new LinkedList<>();
        visited[i][j] = true;
        queue.add(new int[][]{{i,j}});

        while(queue.size()!=0){
            int[][] now = queue.poll();
            i = now[0][0];
            j = now[0][1];
            for(int x = i+1 ; x< grid.length ; x++){
                if(!visited[x][j] && grid[x][j] == '1'){
                    visited[x][j] = true;
                    queue.add(new int[][]{{x,j}});
                }else{
                    break;
                }
            }

            if(i != 0){
                for(int x = i-1; x>=0; x--){
                    if(!visited[x][j] && grid[x][j] == '1'){
                        visited[x][j] = true;
                        queue.add(new int[][]{{x,j}});
                    }else{
                        break;
                    }
                }
            }

            for(int x = j+1 ; x< grid[0].length; x++){
                if(!visited[i][x] && grid[i][x] == '1'){
                    visited[i][x] = true;
                    queue.add(new int[][]{{i,x}});
                }else{
                    break;
                }
            }

            if(j != 0){
                for(int x = j-1; x>=0; x--){
                    if(!visited[i][x] && grid[i][x] == '1'){
                        visited[i][x] = true;
                        queue.add(new int[][]{{i,x}});
                    }else{
                        break;
                    }
                }
            }


        }
    }
}
