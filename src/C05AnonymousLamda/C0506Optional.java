package C05AnonymousLamda;

import java.util.*;

public class C0506Optional {
    public static void main(String[] args) {
        ////        Optional 객체 : 특정객체에 값이 없을지도 모른다는 것을 명시적으로 표현
////        ofNullable : null이 있을수도 있는 경우에 Optional 객체를 생성하는 메서드
//        Optional<String> opt1 = Optional.ofNullable(null);
//        String st1 = null
//        System.out.println(opt1.get().compareTo(st1));

//        Optional 객체 생성 3가지 방법
//        Optional<String> opt1 = Optional.empty();
//        Optional<String> opt2 = Optional.of("hello");        // null이 못들어감
//        Optional<String> opt3 = Optional.ofNullable(null);   // null이 들어갈수 있음

////        Optional 객체 처리 방법 4가지
////        방법1. isPresent() 확인후 get()
//        if (opt3.isPresent()) {
//            System.out.println(opt3.get().length());
//        }
////        방법2. orElse() : 값이 있으면 있는값 return, 없으면 지정값 return
//        System.out.println(opt3.orElse("").length());
////        방법3. orElseGet() : 값이 있으면 있는값 return, 없으면 람다함수 실행
//        System.out.println(opt3.orElseGet(() -> new String("")).length());
////        방법4. orElseThrow() : 가장중요. 값이 있으면 있는값 return, 없으면 지정된 예외 강제 실행
////        개발에서 예외를 사용자에게 적절한 메시지 전달 목적으로 강제 발생시키는 경우도 존재.
//        System.out.println(opt3.orElseThrow(() -> new NoSuchElementException("값이 없습니다.")).length());

        List<Student> students = new ArrayList<>();
        students.add(new Student("kim", 20));
        students.add(new Student("kim1", 22));
        students.add(new Student("kim2", 25));
        students.add(new Student("kim3", 32));
//        값이 있는 경우 : 정상적인 경우
        double answer1 = students.stream().filter(a->a.getAge()>=22).mapToInt(a-> a.getAge()).average().getAsDouble();
        System.out.println(answer1);
//        방법 1 : 값이 없는 경우
        OptionalDouble answer2 = students.stream().filter(a->a.getAge()>=42).mapToInt(a-> a.getAge()).average();
        if(answer2.isPresent()){
            System.out.println(answer2.getAsDouble());
        }else {
            System.out.println("값이 없습니다.");
        }
        System.out.println(answer2);
//        방법2 : 값이 없는 경우 -> 그냥 이걸 써라~!!
        double answer3 = students.stream().filter(a->a.getAge()>=35).mapToInt(a->a.getAge()).average().orElseThrow(()->new NoSuchElementException("값이 없습니다."));

    }
}
