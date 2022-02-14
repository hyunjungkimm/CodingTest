package codeUp.chapter8;

import java.util.Scanner;

public class CodeUp_1091 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int m = scanner.nextInt();
        int d = scanner.nextInt();
        int n = scanner.nextInt();

        for(int i = 1; i<n; i++){
            a=a*m+d;
        }
        System.out.println(a);
    }
}
