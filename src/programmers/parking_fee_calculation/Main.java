package programmers.parking_fee_calculation;

import java.text.ParseException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws ParseException {
        Solution solution = new Solution();
        int[] fees = {1, 461, 1, 10};
        String[] records = {"00:00 1234 IN"};
        long[] answer = solution.solution(fees, records);
        System.out.println(Arrays.toString(answer));
    }
}
