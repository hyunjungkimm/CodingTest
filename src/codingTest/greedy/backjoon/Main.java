package codingTest.greedy.backjoon;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int answer = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("강의실 수 : ");
        int N = scanner.nextInt();
        int[][] time = new int[N][2];
        for(int i = 0; i<N; i++){
            System.out.print("시작 시간 : ");
            time[i][0] = scanner.nextInt();
            System.out.print("끝 시간 : ");
            time[i][1] = scanner.nextInt();
        }
        //정렬
        Arrays.sort(time, (o1,o2) ->(o2[1] -o1[1]));

        System.out.println(answer);
    }
}
