package programmers.parking_fee_calculation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Solution {
    public long[] solution(int[] fees, String[] records) throws ParseException {
        Map<String, String> map = new HashMap<>();
        Map<String, Long> hourMap = new HashMap<>();
        SimpleDateFormat f = new SimpleDateFormat("HH:mm", Locale.KOREA);

        for(int i = 0; i<records.length; i++){
            String[] arr = records[i].split(" ");
            if(map.containsKey(arr[1])){
                Date d1 = f.parse(arr[0]);
                Date d2 = f.parse(map.get(arr[1]));
                long hour = (d1.getTime() - d2.getTime())/60000;
                System.out.println(hour);
                map.remove(arr[1]);

                if(hourMap.containsKey(arr[1])){
                    long sum = hourMap.get(arr[1]).intValue()+hour;
                    hourMap.put(arr[1], sum);
                }else{
                    hourMap.put(arr[1], hour);
                }
            }else{
                map.put(arr[1], arr[0]);
            }
        }

        while(map.size() != 0){
            for(String key : map.keySet()){
                Date d1 = f.parse("23:59");
                Date d2 = f.parse(map.get(key));
                long hour =  (d1.getTime() - d2.getTime())/60000;
                if(hourMap.containsKey(key)){
                    long sum = hour+hourMap.get(key);
                    hourMap.put(key, sum);
                }else{
                    hourMap.put(key, hour);
                }
              //  map.remove(key);
            }
        }

        System.out.println(hourMap);
        List<Long> list = new ArrayList<>();


       hourMap.entrySet().stream().sorted(Map.Entry.comparingByKey())
            .forEach(x -> {
                Map.Entry<String, Long> tmp = (Map.Entry<String,Long>) x;
                if(tmp.getValue() > fees[0]){
                    list.add(fees[1] + ((long)Math.ceil(((double)tmp.getValue() - fees[0])/fees[2])) * fees[3]);
                }else{
                    list.add((long)fees[1]);
                }
            });

        long[] answer = new long[list.size()];
        for(int i = 0; i< list.size(); i++){
            answer[i]= list.get(i);
        }

        return answer;
    }
}
