package C01Basic;

//
public class C1201StackFunction1 {
    public static void main(String[] args) {
        System.out.println("main함수 시작");
        function1();
        System.out.println("main함수 끝");
    }
    static void function1(){
        System.out.println("function1() 시작");
        function2();
        System.out.println("function1() 끝");
    }
    static void function2(){
        System.out.println("function2() 시작");
        System.out.println("function2() 끝");
    }
}
