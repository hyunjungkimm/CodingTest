package codingTest.stack;

public class PrinterMain {
    public static void main(String[] args) {
        Printer printer = new Printer();

        int[] priorities = {1,1,9,1,1,1};
        int location = 0;
        int answer = printer.solution(priorities, location);
        System.out.println(answer);
    }
}
