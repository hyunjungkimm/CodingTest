package codingTest.hash;

import java.util.*;

public class BestAlbum {
    public static void main(String[] args) {
        String[] genres = {"classic", "pop", "classic", "classic", "pop"};
        int[] plays = {500, 600, 150, 800, 2500};
        int[] answer;

        Map<String, Integer> map = new HashMap<>();
        for(int i = 0; i<genres.length; i++){
            map.put(genres[i], map.getOrDefault(genres[i],0)+plays[i]);
        }
        System.out.println(map);

        //value값으로 정렬 - 내림차순
        List<String> keySet = new ArrayList<>(map.keySet());

        keySet.sort((o1,o2) -> map.get(o2) - map.get(o1));

        List<Integer> list = new ArrayList<>();

        for(String key : keySet){
            int first = 0;
            int second = 0;
            int firstIndex = 0;
            int secondIndex = 0;

            for(int i = 0; i<genres.length; i++){
                if(key.equals(genres[i])){
                    if(first == 0){
                        first = plays[i];
                        firstIndex = i;
                    }else if(first < plays[i]){
                        second = first;
                        secondIndex = firstIndex;
                        first = plays[i];
                        firstIndex = i;
                    }else if(second <plays[i]){
                        second = plays[i];
                        secondIndex = i;
                    }
                }
            }

            if(first == second) {
                if (firstIndex > secondIndex) {
                    list.add(secondIndex);
                    list.add(firstIndex);
                }
            }else{
                    list.add(firstIndex);

                    if(second!=0){
                        list.add(secondIndex);
                    }
                }
            }
        System.out.println(list);
        answer = new int[list.size()];
        for(int i = 0; i<list.size(); i++){
            answer[i] = list.get(i);
        }

        System.out.println(Arrays.toString(answer));
        }
        }
