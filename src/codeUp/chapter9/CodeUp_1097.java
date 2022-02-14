package codeUp.chapter9;

import java.util.Scanner;

public class CodeUp_1097 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] b = new int[19][19];
        for(int i =0; i<19; i++){
            String[] arr = scanner.nextLine().split(" ");
            for(int j = 0; j<19; j++){
                int num = Integer.parseInt(arr[j]);
                b[i][j] = num;
            }
        }

        String a = scanner.nextLine();
        for(int i = 0; i<Integer.parseInt(a); i++){
            String[] arr = scanner.nextLine().split(" ");
            int first = Integer.parseInt(arr[0])-1;
            int second = Integer.parseInt(arr[1])-1;

            for(int j = 0; j<19;j++){
                b[first][j]=(b[first][j])==1? 0:1;
                b[j][second]=(b[j][second])==1? 0:1;
            }
        }

        for(int i = 0; i<19; i++){
            for(int j = 0; j<19; j++){
                System.out.print(b[i][j]+" ");
            }
            System.out.println();
        }
    }
}
