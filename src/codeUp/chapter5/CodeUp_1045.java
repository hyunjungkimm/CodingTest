package codeUp.chapter5;

import java.util.Scanner;

public class CodeUp_1045 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int sum = a+b;
        int minus = a-b;
        int mul = a*b;
        double div = (double)a/b;
        int share = a%b;

        System.out.printf("%d\n%d\n%d\n%d\n%d\n%.2f",sum, minus, mul, (int)div, share, div);
    }
}
