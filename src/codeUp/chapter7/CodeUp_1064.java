package codeUp.chapter7;

import java.util.Scanner;

public class CodeUp_1064 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int answer = ((a>b)? b:a) > c? c:((a>b)? b:a);
        System.out.println(answer);
    }
}
