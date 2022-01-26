package codingTest.stack;

public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer();

        int[] priorities = {1, 2, 3};
        int location = 0;
        int answer = printer.solution(priorities, location);
        System.out.println(answer);
    }
}
