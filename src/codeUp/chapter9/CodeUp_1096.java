package codeUp.chapter9;

import java.util.Arrays;
import java.util.Scanner;

public class CodeUp_1096 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        int[][] b = new int[19][19];
        for(int i = 0; i<Integer.parseInt(a); i++){
            String[] arr = scanner.nextLine().split(" ");
            int first = Integer.parseInt(arr[0])-1;
            int second = Integer.parseInt(arr[1])-1;
            b[first][second]++;
        }

        for(int i = 0; i<19; i++){
            for(int j = 0; j<19; j++){
                System.out.print(b[i][j]+" ");
            }
            System.out.println();
        }

    }
}
