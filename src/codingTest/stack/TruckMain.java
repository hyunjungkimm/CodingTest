package codingTest.stack;

public class TruckMain {
    public static void main(String[] args) {
        int[] truck_weights= {2,2,2,2,1,1,1,1,1};

        Truck truck = new Truck();
        int answer = truck.solution(5,5,truck_weights);
        System.out.println(answer);
    }
}
