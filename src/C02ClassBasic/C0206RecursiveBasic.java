package C02ClassBasic;

public class C0206RecursiveBasic {
    public static void main(String[] args) {
//        for문으로 1~10까지 누적합계
//        function1();
        int total = 0;
        for (int i = 0; i <= 10; i++) {
            total += i;
        }
        System.out.println(total);
        System.out.println(addAcc(10));
//        피보나치 수열 -> 100번째
        int first = 1;
        int second = 1;
        for (int i = 2; i < 5; i++) {
            int temp = first;
            first = second;
            second = temp + first;
        }
        System.out.println(second);

        System.out.println(fibonacci(5));
    }
    static int fibonacci(int a){
        if(a<=2){
            return 1;
        }

        return fibonacci(a - 1) + fibonacci(a - 2);
    }

    //    static void function1(){
//        int total=0;
//        for(int i=0; i<=10; i++){
//            total +=i;
//        }
//        System.out.println(total);
//        System.out.println(addAcc(10));
//    }
    static int addAcc(int n) {
        if (n == 1) {
            return 1;
        }
        return n + addAcc(n - 1);
    }
}
