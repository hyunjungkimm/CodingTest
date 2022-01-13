package Arrays;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Arrays.asList;
import static java.util.stream.Collectors.toList;

public class Numbers {
    public static void main(String[] args) {
        int[] numbers = {1, 10, 100, 1000};
        //int[] numbers ={3,30,34,5,9};
        String answer = "";

        List<String> list = Arrays.stream(numbers)
                .mapToObj(String::valueOf)
                .sorted((s1,s2)->-s1.concat(s2).compareTo(s2.concat(s1)))
                .collect(toList());


        for (String i : list) {
            if(answer.equals("0") && i.equals("0")) return;
            answer += i;
        }
        System.out.println(answer);
    }

}

