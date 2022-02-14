package codeUp.chapter7;

import java.util.Scanner;

public class CodeUp_1063 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int answer = a>b ? a : b;
        System.out.println(answer);

    }
}
