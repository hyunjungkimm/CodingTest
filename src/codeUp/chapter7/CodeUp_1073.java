package codeUp.chapter7;

import java.util.Scanner;

public class CodeUp_1073{
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String[] n = scanner.nextLine().split(" ");

    for(int i = 0; i<n.length; i++){
        if(n[i].equals("0")){
            break;
        }
        System.out.println(n[i]);
    }

    }
}
