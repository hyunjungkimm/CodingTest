package programmers;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] enroll = {"john", "mary", "edward", "sam", "emily", "jaimie", "tod", "young"};
        String[] referral = {"-", "-", "mary", "edward", "mary", "mary", "jaimie", "edward"};
        String[] seller = {"sam", "emily", "jaimie", "edward"};
        int[] amount = {2, 3, 5, 4};

        Solution s = new Solution();
        int[] result = s.solution(enroll, referral, seller, amount);
        System.out.println(Arrays.toString(result));
    }
}
