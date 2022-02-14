package codeUp.chapter9;

import java.util.Scanner;

public class CodeUp_1098 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] s = scanner.nextLine().split(" ");
        int first = Integer.parseInt(s[0]);
        int second = Integer.parseInt(s[1]);
        int[][] arr  = new int[first][second];

        String a = scanner.nextLine();
        for(int i = 0; i<Integer.parseInt(a); i++){
            s = scanner.nextLine().split(" ");
            int l= Integer.parseInt(s[0]);
            int d = Integer.parseInt(s[1]);
            int y = Integer.parseInt(s[2])-1;
            int x = Integer.parseInt(s[3])-1;

            if(d==0){
                for(int j = 0; j<l;j++) {
                    arr[y][x] = 1;
                    x++;
                }
            }else{
                for(int j = 0; j<l;j++) {
                    arr[y][x] = 1;
                    y++;
                    System.out.println(x);
                }
            }

        }

        for(int i = 0; i<first; i++){
            for(int j = 0; j<second; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
