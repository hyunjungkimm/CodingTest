package codeUp.chapter8;

import java.util.Scanner;

public class CodeUp_1088 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        for (int i = 1; i <= a; i++) {
            if(i%3 ==0) continue;
            else System.out.print(i+" ");
        }
    }
}
