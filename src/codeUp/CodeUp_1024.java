package codeUp;

import java.util.Scanner;

public class CodeUp_1024 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String d = scan.next();
        for(int i = 0; i<d.length();i++){
            System.out.println("'"+d.charAt(i)+"'");
        }
    }
}
