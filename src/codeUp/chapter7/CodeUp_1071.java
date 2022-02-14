package codeUp.chapter7;

import java.util.Scanner;

public class CodeUp_1071 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] a = scanner.nextLine().split(" ");

        for(String check : a){
            if(check.equals("0")) break;
            else System.out.println(check);
        }
    }
}
