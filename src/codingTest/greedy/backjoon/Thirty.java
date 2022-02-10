package codingTest.greedy.backjoon;

import java.util.Arrays;
import java.util.Scanner;

public class Thirty {
    public static void main(String[] args) {
        int total = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("N 입력 : ");
        String str= scanner.nextLine();//10만자리의 수 - int, long 불가능

        int[] arr= new int[10]; //0-9

        for(int i= 0; i<str.length(); i++){
            int num = Integer.parseInt(str.substring(i, i+1));
            arr[num] += 1;
            total += num;
        }
        //0이 포함 안되있거나, 자리수의 합이 3으로 안나눠지면 30배수 아니다.
        if(!str.contains("0") || total % 3 !=0) System.out.println(-1);
        else{
            StringBuffer sb = new StringBuffer();
            for(int i = arr.length-1; i>=0 ; i--){
               while(arr[i] > 0){
                   sb.append(i);
                   arr[i]--;
               }
            }

            System.out.println(sb.toString());
        }

    }
}
