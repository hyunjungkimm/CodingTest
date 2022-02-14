package codeUp.chapter2;

import java.util.Scanner;

public class CodeUp_1027 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        String[] arr = s.split("\\.");
        System.out.printf(arr[2]+"-" + arr[1]+"-"+arr[0]);
    }
}
