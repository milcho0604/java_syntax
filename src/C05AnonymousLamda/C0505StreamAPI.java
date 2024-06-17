package C05AnonymousLamda;

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class C0505StreamAPI {
    public static void main(String[] args) {
//        int arr[] = {20,10,4,12};
////        전통적인 방식의 데이터 접근 방법 : 메모리 주소 접근(원본)
//        for(int i=0; i< arr.length; i++){
//            System.out.println(arr[i]);
//        }
////        함수형 프로그래밍 방식 : 데이터와 객체 중심이 아닌, 입력에 따른 출력만 존재
////        arr의 원본이 아닌 복제본을 사용하여 출력, 데이터의 안정성이 높음
////        java에서 함수형 프로그래밍을 지원하기 위한 라이브러리가 streamAPI
////        foreach : 스트림의 각 요소를 소모하면서 동작을 수행
////        Arrays.stream(arr).forEach(a-> System.out.println(a));
//
////        스트림의 생성
//        String stArr[] = {"HTML", "CSS", "JAVA", "PYTHON"};
////        stream<클래스명> : 제네릭타입으로 stream 객체가 생성
//        Stream<String> stream1 = Arrays.stream(stArr);
//
//        List<String> stList = new ArrayList<>(Arrays.asList(stArr));
//        Stream <String> stream2 = stList.stream();
//
////        기본형 자료는 별도의 stream 제공 int -> IntStream
//        int intArr[] ={10,20,30,40,50};
//        IntStream stream3 = Arrays.stream(intArr);
////        LongStream
//
//        List<Integer> myList = new ArrayList<>();
//        myList.add(10);
//        myList.add(20);
//        myList.add(30);
//
//        Stream<Integer> stream4 = myList.stream();
////        int가 아니라 Integer이기 때문에 IntStream은 사용 불가
////        IntStream stream5 = myList.stream();

////        stream 변환(중개연산) : filter, map, sort, distinct, limit
//        String stArr[] = {"HTML", "CSS", "JAVA", "PYTHON"};
////        filter : 특정기준으로 대상을 filtering하는 것. Stream<String> 반환
////        참조변수의 스트림 변환의 경우 제네릭의 타입소거 문제 발생
////        제네릭의 타입소거란 제네틱타입을 런타임시점에는 제거하는 것을 의미
////        그래서, 타입이 소거된 Stream객체에서 배열로 변환하려면 타입이 뭔지를 명시해줘야함(타입캐스팅)
//        String[] newStArr = Arrays.stream(stArr).filter(a->a.length()<=4).toArray(a->new String[a]);    // a변수에는 stream 요소의 개수
////        메소드 참조 방식(매개변수가 추론가능할때 생략하는 형식) : 클래스::메서드
//        String[] newStArr2 = Arrays.stream(stArr).filter(a->a.length()<=4).toArray(String[]::new);
//
//        Arrays.stream(stArr).forEach(System.out::println);
//
//        int intArr[] ={10,10,30,40,50};
//        int newIntArr[] = Arrays.stream(intArr).filter(a-> a<=30).toArray();
//
////        distinct : 중복제거
//        int newIntArr2[] = Arrays.stream(intArr).distinct().toArray();
//        System.out.println(Arrays.toString(newIntArr));
//        System.out.println(Arrays.toString(newIntArr2));
//        int total = Arrays.stream(intArr).sum();
//        System.out.println(total);
//
////        map : 기존의 스트림을 조작하여 새로운 스트림 반환
//        int newMapArr[] = Arrays.stream(intArr).map(a->a*10).toArray();
//        System.out.println(Arrays.toString(newMapArr));

////        홀수찾기 : 홀수만 담은 새로운 배열 생성 : filter
//        int arr[] = {1, 2, 3, 4, 5, 6};
//        int newArr1[] = Arrays.stream(arr).filter(a -> a % 2 == 1).toArray();
//        System.out.println(Arrays.toString(newArr1));
////        홀수만 담은 배열의 값을 제곱한 배열 생성 : filter, map
//        int newArr2[] = Arrays.stream(arr).filter(a -> a % 2 == 1).map(a-> a*a).toArray();
//        System.out.println(Arrays.toString(newArr2));
////        홀수만 담은 배열의 값을 제곱한 새로운 배열 오름차순 정렬 생성 : filter, map, sorted
//        int newArr3[] = Arrays.stream(arr).filter(a -> a % 2 == 1).map(a-> a*a).sorted().toArray();
//
////        mapToInt : intStream형태로 변환해주는 map
//        String stArr[] = {"HTML", "CSS", "JAVA", "PYTHON"};
////        각 문자열의 길이를 담은 새로운 int배열 생성
//        int[] newStArr1 = Arrays.stream(stArr).mapToInt(a->a.length()).toArray();
//        int[] newStArr2 = Arrays.stream(stArr).mapToInt(a->a.length()).limit(3).toArray();
//        System.out.println(Arrays.toString(newStArr1));
//        System.out.println(Arrays.toString(newStArr2));

//        -------------------------------------------------------------------------------------------위-변환 아래-소모

//        스트림의 소모 -> sum:합계, reduce:누적연산, foreach(출력)
        int intArr[] = {10, 20, 30, 40, 50};
//        Arrays.stream(intArr).forEach(a-> System.out.println(a));
//        Arrays.stream(intArr).forEach(System.out::println);
//        int intArrSum = Arrays.stream(intArr).sum();
//        optional 객체 : 값이 있을수도 있고, 없을수도 있음을 명시한 객체
        int intArrMin = Arrays.stream(intArr).min().getAsInt();
        int intArrMax = Arrays.stream(intArr).max().getAsInt();
        int intArrCount = (int) Arrays.stream(intArr).count();
//        reduce(초기값, 연산식);
        int allMultiply = Arrays.stream(intArr).reduce(1, (a, b) -> a * b);
        int allAdd = Arrays.stream(intArr).reduce(0, (a, b) -> a + b);
        System.out.println(allMultiply);
        System.out.println(allAdd);
        String stArr[] = {"hello", "java", "world"};
        String stAllAdd = Arrays.stream(stArr).reduce("", (a, b) -> a + b);
        System.out.println(stAllAdd);

        int test[] = {10,10,20,20,20,30};
        int answer = Arrays.stream(test).distinct().sum();

//        findFirst
        List<Student> students = new ArrayList<>();
        students.add(new Student("kim", 25));
        students.add(new Student("choi", 32));
        students.add(new Student("lee", 22));
        students.add(new Student("park", 37));
//        나이가 30이 넘는 학생중에 첫번째 index값을 가지는 학생 객체 생성
        Optional<Student> s1 = students.stream().filter(a-> a.age >= 30).findFirst();
        Student s2 = students.stream().filter(a-> a.age >= 30).findFirst().get();
        System.out.println(String.valueOf(s1));
        System.out.println(s2);

//        student 객체 실습
//        1)모든 객체의 평균 나이    : int에 결과를 담기
//        2)가장 나이 어린 사람 찾기  : Student에 담기
//        3)30대 이름을 String배열에 담기
//        1)
        int avg = (int) students.stream().mapToInt(a->a.getAge()).average().getAsDouble();
        System.out.println(avg);
//        2)
        Student s3 = students.stream().sorted(Comparator.comparing(Student::getAge)).findFirst().get();
        Student s4 = students.stream().sorted((a,b)->a.getAge()-b.getAge()).findFirst().get();
        System.out.println(s3);
        System.out.println(s4);
//        3)
        String stArr1[] = students.stream().filter(a->a.getAge()>=30).map(a-> a.getName()).toArray(String[]::new);
        System.out.println(Arrays.toString(stArr1));
    }
}