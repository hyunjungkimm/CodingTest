package codeUp.chapter6;

import java.util.Scanner;

public class CodeUp_1057 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        boolean check = (a==b)? true : false;
        if(check) System.out.println(1);
        else System.out.println(0);
    }
}
