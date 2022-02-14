package codeUp.chapter8;

import java.util.Scanner;

public class CodeUp_1092 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int day = 1;

        while(day%a!=0 || day%b!=0 ||day%c !=0){
            day++;
        }
        System.out.println(day);
    }
}
