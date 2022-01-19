package Stack;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Printer {
    public static void main(String[] args) {
        int[] priorities = {1,1,9,1,1,1};//5
        int location = 0;
        int answer = 0;

        int[] check = new int[priorities.length];

        int[] arr = Arrays.stream(priorities).boxed().sorted(Collections.reverseOrder()).mapToInt(Integer::intValue).toArray();

        int temp = 0;
        for(int i = 0; i<priorities.length; i++){
            for(int j = temp; j<priorities.length; j++){
                if(arr[i] == priorities[j]) {
                    check[i] = j;
                    if(temp>= arr.length -1){
                        temp = 0;
                        break;
                    }else{
                        temp = j+1;
                        break;
                    }

                }
            }
            if(priorities[location] == check[i]){
                answer = i;
            }
        }
        System.out.println(Arrays.toString(check));
        System.out.println(Arrays.toString(arr));
        System.out.println(answer);

//answer = i+1;
    }
}
