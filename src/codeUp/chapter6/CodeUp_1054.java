package codeUp.chapter6;

import java.util.Scanner;

public class CodeUp_1054 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        boolean check = (a==1 && b==1)? true:false;

        if(check) System.out.println(1);
        else System.out.println(0);
    }
}
