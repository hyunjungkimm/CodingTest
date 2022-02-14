package codeUp.chapter8;

import java.util.Scanner;

public class CodeUp_1085 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] arr = scanner.nextLine().split(" ");
        int answer = 1;
        double num = 8*1024*1024;
        double size = 1/num;

        for(int i = 0; i<arr.length; i++){
            answer*=Integer.parseInt(arr[i]);
        }
        size *= answer;

        System.out.printf("%.1f MB", size);
    }
}
