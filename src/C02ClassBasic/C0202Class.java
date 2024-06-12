package C02ClassBasic;

public class C0202Class {
    public static void main(String[] args) {
        System.out.println(MyCalculator.sum(10, 20));

//        클래스 메서드 호출 방식 : 클래스명.메서드명(
//        A부서의 매출
//        20원 발생
        MyCalculator.sumAcc(20);
        System.out.println(MyCalculator.total);
//        30원 발생
        MyCalculator.sumAcc(30);
        System.out.println(MyCalculator.total);
//        40원 발생
        MyCalculator.sumAcc(40);
        System.out.println(MyCalculator.total);


//        B부서의 매출
        MyCalculator.sumAcc(10);
        MyCalculator.sumAcc(20);
        MyCalculator.sumAcc(30);
        System.out.println(MyCalculator.total);

//        객체를 사용한 회계프로그램 : 객체 고유의 메모리 공간 할당
//        객체 메서드 호출 방식 : 객체명.메서드명();
//        A회사의 매출
        MyCalculatorInstance m1 = new MyCalculatorInstance();
        m1.sumAcc(10);
        m1.sumAcc(20);
        m1.sumAcc(30);

        System.out.println(m1.total);
//        B회사의 매출
        MyCalculatorInstance m2 = new MyCalculatorInstance();
        m2.sumAcc(100);
        m2.sumAcc(200);
        m2.sumAcc(300);
        System.out.println(m2.total);

//        변수값에 직정 접근하여 값을 할당하는 방식 -> 크게 좋은 방법이 아님
        C0203Person person1 = new C0203Person();
//        person1.name = "홍길동";
//        person1.email = "hong@naver.com";
//        person1.age = 15;
//        person1.eating();
//        System.out.println(person1.name + person1.email + person1.age); // 값을 꺼냄

//        일반적인 패턴은 변수값에 직접 접근하지 않는다.
//        의도를 명확히한 메서드를 통해 변수값을 할당하고 가져옴.

        person1.setName("홍길동");
        person1.eating();
        System.out.println();

    }

}


// 기능 클래스
//
class MyCalculator {
    static int total = 0;

    //    일반 더하기
    static int sum(int a, int b) {
        return a + b;
    }

    //    누적합
    static void sumAcc(int a) {
        total += a;
    }

}

class MyCalculatorInstance {
    //    static이 붙어있는 변수는 클래스 변수, static이 붙어있지 않으면 객체변수
    int total = 0;

    //    일반 더하기
    int sum(int a, int b) {
        return a + b;
    }

    //    누적합
    void sumAcc(int a) {
//        this는 객체 그 자신을 의미.(관행)
//        매개변수와 객체의 이름이 같을 경우 혼동할수 있어서 매개변수가 아닌 객체라고 알려줌.
        this.total += a;
    }

}