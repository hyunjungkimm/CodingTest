package programmers.rotate_matrix_borders;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    public int[] solution(int rows, int columns, int[][] queries) {
        int[] answer = new int[queries.length];

        int[][] arr = new int[rows][columns];
        int num = 1;


        for(int i = 0; i< rows; i++){
            for(int j = 0; j< columns; j++){
                arr[i][j]= num;
                num += 1;
            }
        }

        for(int i = 0; i < queries.length;i++) {
            List<Integer> list = new ArrayList<>();
            int x1 = queries[i][0]-1;
            int y1 = queries[i][1]-1;
            int x2 = queries[i][2]-1;
            int y2 = queries[i][3]-1;
            int temp = 0;
            int checkx = 0;
            int checky = 0;


            while (y1 != y2) {
                if(temp == 0){
                    temp = arr[x1][y1+1];
                    arr[x1][y1+1] = arr[x1][y1];
                }else{
                    int temp2 = arr[x1][y1+1];
                    arr[x1][y1+1] = temp;
                    temp = temp2;
                }
                list.add(temp);
                y1++;
                checky++;
            }

            while(x1 != x2){
                int temp2 = arr[x1+1][y1];
                arr[x1+1][y1] = temp;
                temp = temp2;
                x1++;
                checkx++;
                list.add(temp);
            }

            while(checky != 0){
                int temp2 = arr[x1][y1-1];
                arr[x1][y1-1] = temp;
                temp = temp2;
                checky--;
                y1--;
                list.add(temp);
            }

            while(checkx != 0){
                int temp2 = arr[x1-1][y1];
                arr[x1-1][y1] = temp;
                temp = temp2;
                checkx--;
                x1--;
                list.add(temp);
            }

            System.out.println(list);

            answer[i] = Collections.min(list);

        }

        return answer;
    }
}
