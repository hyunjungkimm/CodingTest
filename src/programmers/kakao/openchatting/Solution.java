package programmers.kakao.openchatting;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution {
    public String[] solution(String[] record) {
        String[] answer = {};
        Map<String, String> map = new HashMap<>();
        int count = 0;

        for(int i = 0; i<record.length; i++){
            String[] arr = record[i].split(" ");

            if(arr[0].equals("Enter") || arr[0].equals("Change") ){
                map.put(arr[1], arr[2]);
            }

            if(!arr[0].equals("Change")) count++;
        }

        answer = new String[count];
        count = 0;
        for(int i = 0; i<record.length; i++){
            String[] arr = record[i].split(" ");
            if(arr[0].equals("Enter")){
                answer[count] = ""+map.get(arr[1])+"님이 들어왔습니다."+"";
            }else if(arr[0].equals("Leave")){
                answer[count] = ""+map.get(arr[1])+"님이 나갔습니다."+"";
            }else{
                continue;
            }
            count++;

        }
        return answer;
    }
}

class Main{
    public static void main(String[] args) {
        String[] record = {"Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"};
        Solution solution = new Solution();
        String[] answer = solution.solution(record);
        System.out.println(Arrays.toString(answer));
    }
}
