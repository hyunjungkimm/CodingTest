package codeUp.chapter6;

import java.util.Scanner;

public class CodeUp_1058 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        boolean check = (a==0 && b==0)? true: false;
        if(check) System.out.println(1);
        else System.out.println(0);
    }
}
