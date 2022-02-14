package codeUp;

import java.util.Scanner;

public class CodeUp_1025 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int[] data = new int[s.length()];
        for(int i = 0; i<s.length(); i++){
            data[i] = s.charAt(i)-'0';
        }
        System.out.println("[" + data[0] * 10000 +"]");
        System.out.println("[" + data[1] * 1000 +"]");
        System.out.println("[" + data[2] * 100 +"]");
        System.out.println("[" + data[3] * 10 +"]");
        System.out.println("[" + data[4]  +"]");

    }
}
