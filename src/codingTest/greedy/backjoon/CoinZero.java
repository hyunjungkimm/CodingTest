package codingTest.greedy.backjoon;

import java.util.Arrays;
import java.util.Collections;

import java.util.Scanner;

public class CoinZero {
    public static void main(String[] args) {
        int answer = 0;
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int K = scanner.nextInt();

        int[] coin = new int[N];

        for(int i = 0; i<N; i++){
            coin[i] = scanner.nextInt();
        }

        for(int i = N-1; i>=0; i--){
            if(coin[i] <= K){
                answer += K/coin[i];
                K = K%coin[i];
            }
        }
        System.out.println(answer);
    }
}
