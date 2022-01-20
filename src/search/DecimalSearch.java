package search;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class DecimalSearch {
    public static void main(String[] args) {
        String numbers = "7834";//"7834" -> 12
        int answer = 0;
        String temp = "";

        char[]arr = numbers.toCharArray();
        Arrays.sort(arr);

        List<String> list = new ArrayList<>();

        for(int i = 0; i< arr.length; i++){
            String s = arr[i]+"";
            list.add(s);
            for(int j = 0; j<arr.length; j++){
                if(i!=j) {
                    s += arr[j];
                    list.add(s);
                }
            }
            s="";
        }
        System.out.println(list);
        List<Integer> list2=  list.stream().map(Integer::parseInt).distinct().collect(toList());

        for(int i = 0; i<list2.size(); i++){
            int count = 0;
            int num = list2.get(i);
            for(int j = 2; j < num ; j++){
                if(num % j ==0){
                    count++;
                    break;
                }
            }
            if(count == 0 && num != 0 && num!= 1){
                answer++;
            }
        }
        System.out.println(list2);


        System.out.println(answer);

    }
}
