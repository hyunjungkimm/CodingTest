package codeUp.chapter5;

import java.util.Scanner;

public class CodeUp_1046 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int sum = a+b+c;
        double avg = sum/3;
        System.out.println(sum);
        System.out.printf("%.1f",avg);
    }
}
