package codeUp.chapter2;

import java.util.Scanner;

public class CodeUp_1019 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String date = scanner.nextLine();
        String[] a = date.split("\\.");
        int year = Integer.parseInt(a[0]);
        int month = Integer.parseInt(a[1]);
        int day = Integer.parseInt(a[2]);
        System.out.printf("%04d.%02d.%02d", year, month, day);
    }
}
