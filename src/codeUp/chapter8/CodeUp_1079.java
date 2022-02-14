package codeUp.chapter8;

import java.util.Scanner;

public class CodeUp_1079 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] arr= scanner.nextLine().split(" ");

        for(int i = 0; i<arr.length; i++){
            System.out.println(arr[i]);
            if(arr[i].equals("q")){
                break;
            }
        }

    }
}
