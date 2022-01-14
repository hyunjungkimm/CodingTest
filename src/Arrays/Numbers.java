package Arrays;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Arrays.asList;
import static java.util.stream.Collectors.toList;

public class Numbers {
    public static void main(String[] args) {
        //int[] numbers = {1, 10, 100, 1000};
        int[] numbers ={3,30,34,5,9};

        String answer = Arrays.stream(numbers)
                                    .mapToObj(String::valueOf)
                                    .sorted((a1, a2) -> -a1.concat(a2).compareTo(a2.concat(a1)))
                                    .reduce("", (a1, a2) ->(a1+a2).equals("0") ?"0" : a1+a2);

        System.out.println(answer);//9534330
    }

}

