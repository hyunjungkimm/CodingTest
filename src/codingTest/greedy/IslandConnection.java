package codingTest.greedy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class IslandConnection {
    public int solution(int n, int[][] costs) {
        int answer = 0;
        int[] island = new int[100];
        int[] num = new int[n];

        for(int i = 0; i<costs.length; i++){
            if(island[costs[i][1]] > costs[i][2]) {
                island[costs[i][1]] = costs[i][2];
            }else if(island[costs[i][1]] == 0){
                island[costs[i][1]] = costs[i][2];
            }
        }

        for(int i : island){
            answer+=i;
        }

        return answer;
    }

    public static void main(String[] args) {
        int[][] costs = {{0,1,1},{0,2,2},{1,2,5},{1,3,1},{2,3,8}};
        IslandConnection islandConnection = new IslandConnection();
        int answer = islandConnection.solution(8,costs);
        System.out.println(answer);
    }
}
