package stack;

import java.util.Arrays;

public class Truck {
    public static void main(String[] args) {
        int answer = 0;
        int bridge_length = 2;
        int weight = 10;
        int[] truck_weights = {7,4,5,6};
        //다리를 건너는 트럭
        int[] truck_ing = new int[bridge_length];
        //경과 시간
        int count = 0 ;
        //다리를 건너는 트럭 합계
        int truck_ing_sum = Arrays.stream(truck_ing).sum();

        for(int i = 0 ; i< truck_weights.length; i++){
            if(truck_ing[0]== 0) {
                truck_ing[0] = truck_weights[i];
                truck_weights[i] = -1;
                count++;
            }else if(truck_ing_sum >= weight) {

                truck_ing[1] = truck_weights[i];
                truck_weights[i] = -1;
                count++;
                i--;

            }else if(truck_ing[1] != 0){
                truck_ing[1] = -1;
                count++;
                i--;
            }else{
                truck_ing[1] = truck_ing[0];
                truck_ing[0] = 0;
                count++;
            }
            System.out.println(count);
            System.out.println(Arrays.toString(truck_ing));
            System.out.println(Arrays.toString(truck_weights));


        }
    }
}
