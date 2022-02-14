package codeUp.chapter9;

import java.util.Scanner;

public class CodeUp_1094 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        String[] arr = scanner.nextLine().split(" ");

        for(int i = arr.length-1; i>=0;i--){
            System.out.print(arr[i]+" ");
        }
    }
}
