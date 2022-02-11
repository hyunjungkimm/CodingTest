package codingTest.greedy.backjoon;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class ClassroomAssignment {
    public static void main(String[] args) {
        int answer = 0;
        int lastTime = 0;
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
        Arrays.sort(time, Comparator.comparing(o1 -> o1[0]));

        //우선순위 큐
        PriorityQueue pq = new PriorityQueue();
        pq.add(time[0][1]);

        for(int i = 1; i<time.length; i++){
            if((int)pq.peek() <= time[i][0]) {
                pq.poll();
            }
            pq.add(time[i][1]);
        }

        answer = pq.size();

        System.out.println(answer);
    }
}
