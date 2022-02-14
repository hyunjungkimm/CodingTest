package codeUp.chapter8;

import java.util.Scanner;

public class CodeUp_1078 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int answer = 0;

        for(int i = 1; i<=a; i++){
            if(i%2 ==0) answer+=i;
        }

        System.out.println(answer);
    }
}
