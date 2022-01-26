package codingTest.kakao;

import java.util.*;

public class Result {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];

        Map<String, HashSet<String>> reportMemberList = new HashMap<>();
        Map<String, Integer> getMailCount = new HashMap<>();

        for(String id : id_list){
            reportMemberList.put(id, new HashSet<>());
            getMailCount.put(id, 0);
        }

        for(String reports : report){
            String[] reportArr = reports.split(" ");
            reportMemberList.get(reportArr[1]).add(reportArr[0]);
        }

        for(String keySet :reportMemberList.keySet()){
            HashSet<String> reportMem = reportMemberList.get(keySet);
            if(reportMem.size() >= k){
                for(String id : reportMem) {
                    Integer getMail = getMailCount.get(id);
                    getMailCount.put(id, getMail+1);
                }
            }
        }

        for(int i = 0; i<answer.length; i++){
            answer[i] = getMailCount.get(id_list[i]);
        }

        return answer;
    }
}
