package codingTest.kakao;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Result result = new Result();
        String[] id_list = {"muzi", "frodo", "apeach", "neo"};
        String[] report = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
       /* String[] id_list = {"con", "ryan"};
        String[] report = {"ryan con", "ryan con", "ryan con", "ryan con"};*/
        System.out.println(Arrays.toString(result.solution(id_list, report, 2)));
    }

}

