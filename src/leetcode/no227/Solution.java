package leetcode.no227;

public class Solution {
    public int calculate(String s) {
        int answer = 0;
        int temp = 0;
        s= s.replaceAll(" ", "");

        char[] arr = s.toCharArray();

        StringBuffer sb = new StringBuffer();

        for(int i = 0; i<arr.length; i++){
            if(arr[i] == '+' || arr[i] =='-'){
                sb.append(arr[i-1]);
                sb.append(arr[i]);
            }else if(s.charAt(i) =='/'){
                int num1 = arr[i-1]-48;
                int num2 = arr[i+1]-48;
                int divide = num1/num2;
                System.out.println(num1 + "/ " + num2 + "=" +divide);
                sb.append(divide);
            }else if(s.charAt(i) == '*'){
                int num1 = arr[i-1]-48;
                int num2 = arr[i+1]-48;
                int mod = num1*num2;
                sb.append(mod);
            }
        }


        for(int i = 0; i<sb.length(); i++){
            answer+=sb.charAt(i)-48;
            System.out.println(answer);
        }

        System.out.println(sb);

        return answer;
    }
}
