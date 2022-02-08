package codingTest.heap;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        DiskController diskController = new DiskController();
        int[][] jobs = new int[][]{{0, 3}, {4, 3}, {8, 3}};
        int answer = diskController.solution(jobs);
        System.out.println(answer);

        /*PriortyQueue
        String[] operations = new String[]{"I -45", "I 653", "D 1", "I -642", "I 45", "I 97", "D 1", "D -1", "I 333"};
        PriortyQueue priortyQueue = new PriortyQueue();
        int[] answer = priortyQueue.solution(operations);
        System.out.println(Arrays.toString(answer));

         */
    }
}
