package codeUp.chapter8;

import java.util.Scanner;

public class CodeUp_1089 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int d = scanner.nextInt();
        int n = scanner.nextInt();

        System.out.println(a + (n-1)*d);
    }
}
