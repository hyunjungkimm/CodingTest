package codeUp;

import java.util.Scanner;

public class CodeUp_1020 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String number = scan.nextLine();
        String[] arr = number.split("\\-");
        System.out.printf(arr[0]+arr[1]);
        System.out.println();
        System.out.println(number.replace("-", ""));

    }
}

