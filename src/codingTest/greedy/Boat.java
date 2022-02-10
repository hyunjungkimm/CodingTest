package codingTest.greedy;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class Boat {
    public int solution(int[] people, int limit) {
        int answer = 0;
        Arrays.sort(people);

        int min = 0;

        for(int max = people.length-1; max>=min; max--) {
            if(people[min] + people[max] <= limit) min++;
            answer++;
        }

        return answer;

    }

    public static void main(String[] args) {
        Boat boat = new Boat();
        int[] people = {70,50,80,50};
        int answer = boat.solution(people, 110);
        System.out.println(answer);
    }
}
