package codeUp.chapter8;

import java.util.Scanner;

public class CodeUp_1080 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int answer = 0;
        for(int i = 1; i<=num; i++){
            answer += i;
            if(num <= answer){
                System.out.println(i);
                break;
            }
        }

    }
}
