package codingTest.search;

import java.util.Arrays;

public class PrimeSearch {
    public static void main(String[] args) {
        String numbers = "7834";
        int answer = 0;
        String temp = "";
        char[] arr = numbers.toCharArray();

        Arrays.sort(arr);
        for(int i = arr.length-1; i>=0; i--){
            temp+=arr[i]+"";
        }
        int num = Integer.parseInt(temp);
        for(int i = 2; i<=num; i++){
            boolean isPrime = true;
            for(int j = 2 ; j <=Math.sqrt(i); j++){
                if(i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            int ok = 0;
            if(isPrime){
                String check = String.valueOf(i);

                char[] reset = numbers.toCharArray();
                    for(int z = 0; z<check.length(); z++){
                        for(int a = 0; a<reset.length; a++){
                            if(check.charAt(z) == reset[a]){
                                ok++;
                                reset[a] = ' ';
                            };
                    }
                }
                if(ok == check.length()){
                    System.out.println(ok + ": " +check);
                    answer++;
                }
            }



        }
        System.out.println(answer);//12
    }
}
