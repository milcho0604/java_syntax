package C01Basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class C06String {
    public static void main(String[] args) {


////        참조자료형 : 기본 자료형을 제외한 모든 자료형
////        WrapperClass : 기본형 타입을 Wrapping한 클래스
////        int와 Integer간의 형변환
//        int a = 10;
//        Integer b = new Integer(20);
////        오토언박싱 Integer -> int 형변환
//        int c = b;
////        오토박싱
//        Integer d = a;

////        String과 int의 형변환
//        int a = 10;
//        String st1 = Integer.toString(a);
//        String st2 = String.valueOf(a);
//
////        String -> int
//        int b = Integer.parseInt(st1);
//        int c = Integer.valueOf(st1);
//
////        참조자료형에 원시자료형을 담을때는 Wrapper 자료형을 써야한다.
//        List<Integer> list1 = new ArrayList<>();
//        list1.add(1);
//        list1.add(2);
//        list1.add(3);
//        System.out.println(list1);


////        String 변수 생성방법
//        String st1 = new String("hello");
////        리터럴방식
//        String st2 = "hello!!";
//        System.out.println("gg");


//        특정문자 제거하기 - 프로그래머스 : https://school.programmers.co.kr/learn/courses/30/lessons/120826
//        String my_string = "BCBdbe";
//        String letter = "B";
//        String answer = "";
////        자동 형변환 ver 으로 풀기
//        for (int i = 0; i < my_string.length(); i++) {
//            if(my_string.charAt(i) != letter.charAt(0)){
//                answer += my_string.charAt(i);
//            }
//        }


//        substring(a,b) ----------------------------------------------------------------------------- substring(a,b)
//        a이상 b 미만의 index의 문자를 잘라 리턴!
//        String st1 = "hello world!";
//        System.out.println(st1.substring(0,5));
//        System.out.println(st1.substring(6,st1.length() -1));


//        특정문자 제거하기 - 프로그래머스
//        https://school.programmers.co.kr/learn/courses/30/lessons/120826
//        String my_string = "BCBdbe";
//        String letter = "B";
//        String answer = "";
////        substring ver으로 풀기
//        for (int i = 0; i < my_string.length(); i++) {
//            if(!my_string.substring(i,i+1).equals(letter)){
//                answer += my_string.substring(i,i+1);
//            }
//        }
//
//        System.out.println(answer);

//        가운데 글자 가져오기 - 프로그래머스 qwer
//        https://school.programmers.co.kr/learn/courses/30/lessons/12903?language=java
//        String s = "abcde";
//        int midNum = s.length() / 2;
//        String answer = "";

//        이 방법을 사용해서 진행할 때.
//        answer = s.substring((s.length() - 1) / 2, s.length() / 2 + 1);
//        >> 짝수일 때 4
//        answer = s.substring((4 - 1) / 2, 4 / 2 + 1);
//        answer = s.substring((3) / 2, 2 + 1);
//        answer = s.substring(1.5, 3);
//        >> 홀수일 때 5
//        answer = s.substring((5 - 1) / 2, 5 / 2 + 1);
//        answer = s.substring((4) / 2, 2.5 + 1);
//        answer = s.substring(2, 3.5);


//        if(s.length() % 2 == 0){
//            answer = s.substring(midNum-1, midNum+1);
//        }else{
//            answer = s.substring(midNum, midNum+1);
//        }

//        System.out.println(answer);


//        trim, strip ----------------------------------------------------------------------------- trim, strip
//        문자열 양쪽 끝의 공백 제거

//        trim
//        String trimSt1 = " hello world! ";
////        String trimSt2 = trimSt1.trim();
////        strip : trim보다 후기모델 >> 좀 더 최적화 되었다 라고 함.
//        String trimSt2 = trimSt1.strip();
//
//        System.out.println(trimSt1);
//        System.out.println(trimSt2);


//        replace(a,b) ----------------------------------------------------------------------------- replace(a,b)
//        a문자열을 b문자열로 대체
//        String st1 = "hello world!";
//        String st2 = st1.replace("world","java");
//        System.out.println(st2);


//        replaceAll(a,b) ----------------------------------------------------------------------------- replaceAll(a,b)
////        replace와 동일, 정규표현식을 쓸 수 있음.
//        String st1 = "01abc123한글123";
//
////        for 문을 활용해서 알파벳 제거
//        String answer = "";
//        for (int i = 0; i<st1.length(); i++){
//            if(st1.charAt(i) >= 'a' && st1.charAt(i) <= 'z' ){
//                System.out.println(st1.charAt(i) + " >> 알파벳!" );
//                answer += st1.charAt(i);
//            }
//        }
//        System.out.println(answer);

//        String의 matches와 Pattern.matches();
//        String test = "hello1A";
////        boolean is_match = test.matches("[A-Za-z]");
//        System.out.println(test.matches("[A-Za-z]+"));
//
//        boolean b1 = Pattern.matches("[0-9]+","a1");
//        System.out.println(b1);

//        문자열 다루기 기본 : 프로그래머스
        // 문자열 s의 길이가 4 혹은 6이고, 숫자로만 구성돼있는지 확인해주는 함수
//        boolean answer = true;
//        String s = "1234a"; //1234
//        answer = (s.length() == 4 || s.length() == 6) && s.matches("[0-9]+");
//        System.out.println(answer);

//        ^ : 정규표현식의 시작, $ : 정규표현식의 끝, *빈값 포함

        // 전화번호 패턴 검증
//        while (true){
//            Scanner sc = new Scanner(System.in);
//            String number = sc.nextLine();
//            boolean check = false;
//            if(Pattern.matches("^\\d{3}-\\d{4}-\\d{4}$",number)){
//                System.out.println("올바른 형식의 전화번호");
//            }else {
//                System.out.println("잘못된 형식의 전화번호");
//            }
//        }

//        이메일검증
//        소문자알파벳_숫자@알파벳.com
//        Scanner sc = new Scanner(System.in);
//        String email = sc.nextLine();
//        String regex = "^[a-z0-9]+@[a-z].com$";
//        boolean b3 = Pattern.matches(regex,email);
//        while (true){
//            Scanner sc = new Scanner(System.in);
//            String number = sc.nextLine();
//            boolean check = false;
//            if(Pattern.matches("^\\d{3}-\\d{4}-\\d{4}$",number)){
//                System.out.println("올바른 형식의 전화번호");
//            }else {
//                System.out.println("잘못된 형식의 전화번호");
//            }
//        }
//        System.out.println(b3);


//        split ----------------------------------------------------------------------------- split
//        특정 문자를 기준으로 문자열을 자르는 것.
//        String a = "a:b:c:d";
//        String[] a_arr = a.split(":");
////        System.out.println(Arrays.toString(a_arr));
//        String b = "a b c  d";
//        String[] b_arr = b.split("\\s+");
//        System.out.println(Arrays.toString(b_arr));


//        isEmpty와 null(자료타입) ----------------------------------------------------------------------------- isEmpty와 null(자료타입)
//        String st1 = null;
//        String st2 = "";
//
////         null 에게 메소드 실행 진행 시, 문제 발생. > NullPointer Exception 예외 발생
////        따라서, null체크를 java에서는 계속 진행해줘야함!
//        st1.isEmpty();
//        st2.isEmpty();


//        join : string[]을 하나의 String으로 만드는 메서드
//        String[] arr = {"a","b","c","d","f"};
//        String st = String.join(" ",arr);


//        StringBuffer :
//        StringBuffer sb1 = new StringBuffer("hello");
////        문자열 가장 뒤에 다른 문자열을 더하는 것.
//        sb1.append(" java");
//        sb1.append(" world");
//        sb1.insert(5," python");
//        sb1.delete(17,sb1.length());
////        String answer = sb1.toString();
//        System.out.println(sb1);

//        StringBuilder : 이게 성능 좋아!!
//        속도비교 : String += < StringBuffer < StringBuilder
//        StringBuilder는 스레드 safe X
//        StringBuilder sb1 = new StringBuilder("hello");
//        sb1.append(" java");
//        sb1.append(" world");
//        sb1.insert(5, " python");
//        sb1.delete(17, sb1.length());
//        String answer = sb1.toString();
//        System.out.println(sb1);

//        실습 hello로 hhheeellllllooo 만들기!
//        String my_strinig = "hello";
//        int n = 3;
//        StringBuilder sb1 = new StringBuilder();
//        String answer = "";
//        for (int i = 0; i < my_strinig.length(); i++) {
//            String text = String.valueOf(my_strinig.charAt(i));
//            for (int j = 0; j < n; j++) {
//                sb1.append(text);
//            }
//        }
//        answer = sb1.toString();
//        System.out.println(answer);

//        배열 뒤집기
//        int arr[] ={1, 2};
//        int s[] = new int[arr.length];
//        for(int i=0; i< arr.length; i++){
//            s[i] = arr.length-1;
//        }
//        System.out.println(Arrays.toString(s));

//        문자열 밀기 : 프로그래머스
//        String A = "abc";
//        String B = "abcd";
//        int answer = 0;
//        String tempA = A;
//        for (int i = 0; i < A.length()+1; i++) {
//            if(!tempA.equals(B)){
//                String lastText = tempA.substring(tempA.length()-1, tempA.length());
//                StringBuilder sb1 = new StringBuilder(tempA);
//                sb1.delete(sb1.length()-1, sb1.length());
//                sb1.insert(0, lastText);
//                tempA = sb1.toString();
//                answer++;
//            }
//        }
//
//        if(answer > A.length()){
//            answer = -1;
//        }
//
//        System.out.println("answer >> "+ answer);

    }
}