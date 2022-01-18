package Search;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.*;

public class PrimeSearch {
    public static void main(String[] args) {
        String numbers = "7834";//"7834" -> 12
        int answer = 0;
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

        List<Integer> list2=  list.stream().map(Integer::parseInt).distinct().collect(toList());
        System.out.println(list2);
        for(int i : list2) {

            System.out.println(isPrime(list2, i));
        }


    }
    public static boolean isPrime(List<Integer> primes,int candidate){
        return primes.stream()
                .noneMatch(i-> candidate % i == 0);
    }



}
