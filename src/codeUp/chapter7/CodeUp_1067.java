package codeUp.chapter7;

import java.util.Scanner;

public class CodeUp_1067 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();


        String minusOrPlus = (a>=0) ?"plus" : "minus";
        String oddOrEven = (a%2 ==0) ? "even" : "odd";

        System.out.println(minusOrPlus);
        System.out.println(oddOrEven);
    }
}
