package codeUp.chapter8;

import java.util.Scanner;

public class CodeUp_1083 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for(int i = 1; i<=n; i++){
            if(i%3 == 0){
                System.out.print("X ");
            }else{
                System.out.print(i + " ");
            }
        }
    }
}
