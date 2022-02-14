package codeUp.chapter8;

import java.util.Scanner;

public class CodeUp_1087 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int sum = 0;

        for(int i = 1; i<=a;i++){
            if(sum < a){
                sum+=i;
            }else{
                System.out.println(sum);
                break;
            }
        }
    }
}
