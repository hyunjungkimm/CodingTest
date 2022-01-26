package codingTest.stack;

import java.util.Arrays;

public class ProgressesOther {
    public static void main(String[] args) {
        int[] progresses = {95, 90, 99, 99, 80, 99};
        int[] speeds = {1, 1, 1, 1, 1, 1};

        int[] dayOf = new int[100];
        int day = -1;
        for(int i = 0; i<progresses.length; i++){
            while(progresses[i] +(day*speeds[i])<100){
                day++;
            }
            System.out.println(day);
            dayOf[day]++;
        }
        System.out.println(Arrays.toString(dayOf));
        System.out.println(Arrays.toString(Arrays.stream(dayOf).filter(i->i!=0)
                .toArray()));

    }
}
