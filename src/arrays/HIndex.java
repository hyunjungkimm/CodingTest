package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class HIndex {
    public static void main(String[] args) {
        int answer = 0;
        //int[] citations= {0,0,0,0};//4,4,4,4
        //int[] citations= {3,0,6,1,5};//5,4,3,2,1
        //int[] citations= {0, 0, 0, 0, 1};//5,5,5,5,1
        //int[] citations= {9, 9, 9, 12};//4,4,4,1
        //int[] citations= {9, 7, 6, 2, 1};//5,4,3,2,1
        //int[] citations= {10, 8, 5, 4, 3};//5,4,3,2,1
        ////int[] citations= {25, 8, 5, 3, 3};//5,5,3,2,1
        //int[] citations= {1, 1, 5, 7, 6};
        //int[] citations= {0};
        //int[] citations= {0, 1, 2};
        int [] citations = {1,4};

        Arrays.sort(citations);
        System.out.println(Arrays.toString(citations)); //[0, 1, 3, 5, 6]
        List<Integer> list = new ArrayList<>();

        for(int i = 0; i<citations.length; i++){
            int count = 0;
            int check = 0;
            for(int j = 0; j<citations.length; j++){
                if(citations[i] <= citations[j]){
                    count++;
                }
            }
            System.out.println(count);
            if(count <= citations[i]){
                list.add(count);
            }
        }
        Collections.sort(list);
        System.out.println(list);

        for(int i : list){
            int count = 0;
            for(int j = 0; j <citations.length;j++){
                if(i <= citations[j]){
                    count++;
                }
            }
            //System.out.println(count);
            if(count == i){
                answer = i;
            }else{
                answer = i;
            }
        }
        System.out.println("정답 = "+ answer);
    }
}
