package codeUp.chapter9;

import java.util.Scanner;

public class CodeUp_1093 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        String[] arr = scanner.nextLine().split(" ");
        int[] number = new int[23];

        for(int i = 0; i<arr.length;i++){
            int index = Integer.parseInt(arr[i])-1;
            number[index]++;
        }

        for(int i : number){
            System.out.print(i +" ");
        }


    }
}
