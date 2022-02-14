package codeUp.chapter9;

import java.util.Arrays;
import java.util.Scanner;

public class CodeUp_1095 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        String[] arr = scanner.nextLine().split(" ");
        int min = Integer.parseInt(arr[0]);
        for(int i = 1; i<arr.length;i++){
            int check = Integer.parseInt(arr[i]);
            if(min>check){
                min = check;
            }
        }

        System.out.println(min);
    }
}
