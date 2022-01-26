package codingTest;

import java.util.ArrayList;
import java.util.List;

public class Numbers {
    public static void main(String[] args) {
        int n = 6;
        String answer = "";

        String[] arr = {"4","1","2"};

        List<Integer> list = new ArrayList();

        while(n > 0){
            int i = n%3;
            n = n/3;
            if(i == 0){
                n-=1;
                list.add(i);
            }else
            list.add(i);


        }
        System.out.println(list);
        for(int i = list.size() - 1; i>=0 ; i--){
            answer += arr[list.get(i)];
        }
        System.out.println(answer);
    }
}
