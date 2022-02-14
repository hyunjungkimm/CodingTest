package codeUp.chapter7;

import java.util.Scanner;

public class CodeUp_1076 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char a = scanner.next().charAt(0);
        char b ='a';
        do{
            System.out.print(b+" ");
            b++;
        }while(b<=a);
    }
}
