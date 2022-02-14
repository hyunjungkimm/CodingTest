package codeUp;

import java.util.Scanner;

public class CodeUp_1021 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        System.out.println(s);

        char data[] = new char[s.length()];
        for(int i = 0;i<data.length; i++){
            data[i] = s.charAt(i);
        }
        System.out.println(data);
    }
}
