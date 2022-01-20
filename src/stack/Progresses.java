package stack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Progresses {
    public static void main(String[] args) {
        int[] progresses = {93, 30, 55};
        int[] speeds = {1, 30, 5};

        List<Integer> list = new ArrayList<>();

        int count = 0;
        for (int i = 0; i < progresses.length; i++) {
            i = count;
            int tempI = (int) Math.ceil((double) (100 - progresses[i]) / speeds[i]);
            int num = 1;

            for (int j = i + 1; j < progresses.length; j++) {
                int tempJ = (int) Math.ceil((double) (100 - progresses[j]) / speeds[j]);
                if (tempI >= tempJ) {
                    num++;
                } else {
                    break;
                }
            }
            list.add(num);
            count += num;
            if (count == progresses.length) {
                break;
            }
        }
        System.out.println(Arrays.toString(list.stream().mapToInt(Integer::intValue).toArray()));
    }
}
