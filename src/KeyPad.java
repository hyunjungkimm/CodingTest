import java.util.*;
public class KeyPad {
    public static void main(String[] args) {
        int[] numbers = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
        String hand = "right";
        String answer = "";
        int right = -1;
        int left = -1;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 1 || numbers[i] == 4 || numbers[i] == 7 || numbers[i] == left) {
                answer += "L";
                left = numbers[i];
            }
            if (numbers[i] == 3 || numbers[i] == 6 || numbers[i] == 9 || numbers[i] == right) {
                answer += "R";
                right = numbers[i];
            }

            if (numbers[i] == 2 || numbers[i] == 5 || numbers[i] == 8 || numbers[i] == 0) {
                answer += "R";
                right = numbers[i];
            }



        }
        System.out.println(answer);
    }

}


