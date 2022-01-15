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
                        .sorted((o1, o2) -> -o1.concat(o2).compareTo(o2.concat(o1)) )
                        .collect(Collectors.joining());

        System.out.println(answer);//9534330
    }

}

