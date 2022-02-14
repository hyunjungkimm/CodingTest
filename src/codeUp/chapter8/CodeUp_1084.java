package codeUp.chapter8;

import java.util.Scanner;

public class CodeUp_1084 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int check = 0;

        for(int i = 0; i<a; i++){
            for(int j = 0; j<b; j++){
                for(int z = 0; z<c; z++){
                    System.out.println(i +" " + j + " " +z);
                    check++;
                }
            }
        }
        System.out.println(check);
    }
}
