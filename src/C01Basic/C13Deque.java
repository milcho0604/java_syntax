package C01Basic;

import java.util.ArrayDeque;
import java.util.Deque;

public class C13Deque {
    public static void main(String[] args) {
        Deque<Integer> de = new ArrayDeque<>();
        de.addLast(10);
        de.addLast(20);
        de.addLast(30);
        de.addFirst(40);
        System.out.println(de);
        System.out.println(de.peekFirst());
        System.out.println(de.peekLast());
        System.out.println(de.pollFirst()); // poll
        System.out.println(de.pollLast()); // pop

//        프로그래머스 : 다리를 지나는 트럭
    }
}
