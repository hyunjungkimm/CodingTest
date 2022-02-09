package codingTest.greedy;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public class JoyStic {
    public int solution(String name) {
        int answer = 0;
        int len = name.length();
        //쭉 오른쪽으로 간 경우
        int move = len - 1;
        //앞에서부터 체크
        for(int i = 0; i<len; i++){
            //상하 이동
            //'O' ~ 'Z'
            if(name.charAt(i) > 'N') {
                answer += 'Z' - name.charAt(i) + 1;
            }
            //'A' ~ 'N' 의 경우
            else{
                answer += name.charAt(i) - 'A';
            }

            int conA = i+1;
            //다음 글자부터 연속된 A가 있는 경우 되돌아가는게 빠른지 확인
            while(conA < len && name.charAt(conA) == 'A'){
                conA++;
            }
            move = Math.min(move, i+len-conA+Math.min(i,len-conA));
        }
        answer += move;
        return answer;
    }
}
