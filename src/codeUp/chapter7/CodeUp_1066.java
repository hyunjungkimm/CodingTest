package codeUp.chapter7;

import java.util.Scanner;

public class CodeUp_1066 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] arr = scanner.nextLine().split(" ");

        for(String a : arr){
            if(Integer.parseInt(a) %2 ==0) System.out.println("even");
            else System.out.println("odd");
        }
    }
}
