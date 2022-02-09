package deque;


import java.util.ArrayDeque;

public class Deque {
    public static void main(String[] args) {

        System.out.println("Stack!!!");
        //Deque<String> stack = new ArrayDeque<>();
        //-- 저는 왜 그런지 모르겠지만 이렇게 선언시 오류 나서 둘 다 ArrayDeque로 했습니다.
        ArrayDeque<String> stack = new ArrayDeque<>();
        stack.addFirst("Element1");
        stack.addFirst("Element2");
        stack.addFirst("Element3");
        System.out.println(stack.removeFirst());
        System.out.println(stack.removeFirst());
        System.out.println(stack.removeFirst());

        System.out.println("Queue!!!");
        ArrayDeque<String> queue = new ArrayDeque<>();
        stack.addFirst("Element1");
        stack.addFirst("Element2");
        stack.addFirst("Element3");
        System.out.println(stack.removeLast());
        System.out.println(stack.removeLast());
        System.out.println(stack.removeLast());

    }
}
