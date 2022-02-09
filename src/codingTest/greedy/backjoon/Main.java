package codingTest.greedy.backjoon;

import java.util.Arrays;
import java.util.Collections;

public class Coin {
    public int solution(int k) {
        int answer = 0;

        Integer[] coin = {1, 5, 10, 50, 100, 500, 1000, 5000, 10000, 50000};

        Arrays.sort(coin, Collections.reverseOrder());

        while(k != 0){
            for(int i = 0 ; i<coin.length; i++){
                if(k <= coin[i]){
                    answer += k/coin[i];
                    k = k%coin[i];
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Coin coin = new Coin();
        int answer = coin.solution(4790);
        System.out.println(answer);
    }
}
