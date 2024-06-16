package C03Inheritance;

// 상속불가
// public class C0305Others extends  FinalParents

import java.util.ArrayList;
import java.util.List;

public class C0305Others{
    public static void main(String[] args) {

        AbstractDog dog = new AbstractDog();

//        추상클래스와 인터페이스는 구현없이 객체생성 불가
//        AbstractAnimal animal = new AbstractAnimal();
//        List<Integer> mylist = new List<Integer>();
//        dog의 클래스에서 dog 객체
        AbstractAnimal animal1 = new AbstractDog();
//        animal의 객체 ? -> 익명 객체
        AbstractAnimal animal2 = new AbstractAnimal() {
            @Override
            void makeSound3() {

            }
        };
    }

}



// 추상클래스
abstract class AbstractAnimal{
    void makeSound(){
        System.out.println("동물소리를 냅니다1");
    }
    final void makeSound2(){
        System.out.println("동물소리를냅니다.2");
    }

//        abstract키워드는 자식클래스롷 하여금 오버라이딩 강제
//        abstract메서드가 하나라도 있으면 반드시 클래스에도 abstract키워드가 붙어야함
//    리턴타입과 매개변수만 정의
    abstract void makeSound3();
}

class AbstractDog extends AbstractAnimal{
    @Override
    void makeSound3() {
        System.out.println("멍멍3");
    }
//        @Override
//        void makeSound() {
//            super.makeSound(){
//                System.out.println("멍멍2");
//            }
//        }
}



// final 클래스에 붙이면 상속불가한 클래스 생성
final class FinalParents{

}



