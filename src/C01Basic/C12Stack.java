package C01Basic;

import java.util.Stack;

public class C12Stack {
    public static void main(String[] args) {

//        LIFO

//        Stack<Integer> st1 = new Stack<>();
//        st1.push(10);
//        st1.push(20);
//        st1.push(30);
//
//        System.out.println(st1.pop());
//        System.out.println(st1.peek());
//        System.out.println(st1.size());
//        System.out.println(st1.isEmpty());
//        Stack<String> st = new Stack<>();
//        st.push("a");
//        st.push("b");
//        st.push("b");
//        st.push("d");
//        st.push("e");
//
//        while (!st.isEmpty()){
//            System.out.println(st.pop());
//        }

//        프로그래머스 : 같은 숫자는 싫어
//        int[] arr = {1, 1, 3, 3, 0, 1, 1};
//        Stack<Integer> stack = new Stack<>();
//
//        for (int a : arr) {
//            if (stack.isEmpty()) {
//                stack.push(a);
//            } else {
//                if (stack.peek() != a) {
//                    stack.push(a);
//                }
//            }
//        }
//        System.out.println(stack);

//        프로그래머스 : 올바른 괄호
//        boolean answer = true;
//        String s = "(()(";
//        Stack<Character> st = new Stack<>();
//        String[] p = new String[s.length()];
//        for(int i=0; i< s.length(); i++){
//            if(s.charAt(i) == '('){
//                st.push(s.charAt(i));
//            } else if (s.charAt(i) == ')') {
//                if(!st.isEmpty()){
//                    answer = false;
//                }
//                st.push(s.charAt(i));
//            }
//        }
//        System.out.println(answer);
    }
}
