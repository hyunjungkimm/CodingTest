package codingTest.practice;

class Bracket {
    boolean solution(String s) {
        boolean answer = true;
        int check = 0;

        if(s.startsWith("(") && s.endsWith(")")){
            for(int i =0; i<s.length(); i++){
                if(check < 0){
                    answer = false;
                    break;
                }else if(s.charAt(i) == '(') check++;
                else check--;
            }
            if(check == 0) answer = true;
            else answer = false;

        }else{
            answer = false;
        }


        return answer;
    }
}