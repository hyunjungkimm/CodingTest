import java.util.Arrays;

public class MinNumber {
    public static void main(String[] args) {
        int[] A = {1,4,2};
        int[] B = {5,4,4};

        int answer = 0;

        Arrays.sort(A);
        Arrays.sort(B);

        for(int i = 0; i<A.length; i++){
            int index = B.length-1-i;
            answer+=(A[i]*B[index]);

        }

        System.out.println(answer);


    }
}
