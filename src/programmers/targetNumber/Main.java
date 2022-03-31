package programmers.targetNumber;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] numbers = {4, 1, 2, 1};
        int target = 4;
        int result = solution.solution(numbers, target);
        System.out.println(result);
    }
}
