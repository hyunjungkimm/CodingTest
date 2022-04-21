package leetcode.no200;


import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int numIslands(char[][] grid) {
        int answer = 0;

        boolean[][] visited = new boolean[grid.length][grid[0].length];

        for(int i = 0; i<grid.length; i++){
            for(int j = 0; j<grid[i].length; j++){
                if(grid[i][j] == '1' && !visited[i][j]){
                    checking(grid, visited, i, j);
                    answer++;
                }
            }

        }


        return answer;
    }

    private void checking(char[][] grid, boolean[][] visited, int i, int j) {
        Queue<int[][]> queue = new LinkedList<>();
        visited[i][j] = true;
        queue.add(new int[][]{{i,j}});

        while(queue.size()!=0){
            int[][] now = queue.poll();
            i = now[0][0];
            j = now[0][1];

            for(int x = i+1; x<grid.length; x++){
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

            for(int x = j+1; x<grid[0].length; x++){
                if(!visited[i][x] && grid[i][x] == '1'){
                    visited[i][x] = true;
                    queue.add(new int[][]{{i,x}});
                }else{
                    break;
                }
            }

            if(j!=0){
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
