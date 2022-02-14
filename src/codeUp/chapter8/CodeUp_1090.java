package codeUp.chapter8;

import java.util.Scanner;

public class CodeUp_1090 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int r = scanner.nextInt();
        int n = scanner.nextInt();

        for(int i = 1; i<n; i++){
            a*=r;
        }
        System.out.println(a);
    }
}
