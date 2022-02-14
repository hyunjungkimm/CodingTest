package codeUp.chapter9;

import java.util.Scanner;

public class CodeUp_1099 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] b = new int[10][10];
        for(int i =0; i<10; i++){
            String[] arr = scanner.nextLine().split(" ");
            for(int j = 0; j<10; j++){
                int num = Integer.parseInt(arr[j]);
                b[i][j] = num;
            }
        }
        int i = 2-1;
        int j = 2-1;

        int check = 0;
        while(b[i][j] != 2){
          if(b[i][j] == 0){
              b[i][j] = 9;
              if((b[i][j+1])==0) j++;
              else i++;
          }
        }
        b[i][j] = 9;
        for(int y = 0; y<10; y++){
            for(int z = 0; z<10; z++){
                System.out.print(b[y][z]+" ");
            }
            System.out.println();
        }

    }
}
