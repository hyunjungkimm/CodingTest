package codingTest.greedy.backjoon;

import java.util.Scanner;

public class CompetitionOrIntern {
    public static void main(String[] args) {
        int answer = 0;
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();//여학생 수
        int M = scanner.nextInt();//남학생 수
        int K = scanner.nextInt();//인턴쉽 참여 인원(대회x)

        for(int i = M; K>0; i--){
            if(M*2 >= N) {
                M--;
                K--;
            }else{
                N--;
                K--;
            }
        }
        if(Math.min(M,N) == M) answer = M;
        else answer = N/2;

        System.out.println(answer);
    }
}
