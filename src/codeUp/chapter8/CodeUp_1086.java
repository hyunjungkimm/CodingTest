package codeUp.chapter8;

import java.util.Scanner;

public class CodeUp_1086 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int w = scanner.nextInt();
        int h = scanner.nextInt();
        int b = scanner.nextInt();

        double a= 8*1024 * 1024;
        double size = 1/a;

        size*=w*h*b;
        System.out.printf("%.2f MB" , size);
    }
}
