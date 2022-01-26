package arrays;

public class HIndex2 {
    public static void main(String[] args) {
        //다른 사람 풀이
        int answer = 0;
        int[] citations= {0,0,0,0};
        //int[] citations= {3,0,6,1,5};

        int max = 0;
        for(int i = citations.length-1; i>-1; i--){
            int min = Math.min(citations[i], citations.length-i );
            if(max < min) max=min;
        }
        System.out.println(max);
    }
}
