package C06EtcClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C0603GenericMain {
    public static void main(String[] args) {
        String[] stArr = {"java", "python", "c++"};
        stChange(stArr, 0, 1);
        System.out.println(Arrays.toString(stArr));

        Integer intArr[] ={10,20,30};
        intChange(intArr, 0, 1);
        System.out.println(Arrays.toString(intArr));

        genericChange(stArr, 1, 2);
        System.out.println(Arrays.toString(stArr));

        Person p1 = new Person();
        p1.setValue("milcho");

        GenericPerson<Integer> p2 = new GenericPerson();
        p2.setValue(10);

//        제네릭 사용
        List<String> myList = new ArrayList<>();
        myList.add("hello");
        myList.add("java");
////        컴파일후 제네릭 소거
//        List myList = new ArrayList<>();
//        myList.add("hello");
//        myList.add("java");
    }
//    제네릭메서드 생성 : 반환타입 왼쪽에 <T> 선언
//    유의점 : 제네릭은 객체 타입이 들어와야함 ex) Integer, int[]
    static <T>void genericChange(T[] Arr, int a, int b){
        T temp = Arr[a];
        Arr[a] = Arr[b];
        Arr[b] = temp;
    }

    static void stChange(String st[], int a, int b) {
        String temp = "";
        temp = st[b];
        st[b] = st[a];
        st[a] = temp;
    }

    static void intChange(Integer intArr[], int a, int b) {
        int temp = 0;
        temp = intArr[b];
        intArr[b] = intArr[a];
        intArr[a] = temp;
    }
}
// 제네릭 클래스는 클래스명 옆에 <T> 선언
class GenericPerson<T> {
    T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}

class Person{
    String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
