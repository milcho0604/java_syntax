package C01Basic;

import java.util.Scanner;

public class C00LoopStatements {
    public static void main(String[] args) {
//        int a = 0;
//        while(a<10){
//            System.out.println("hello world");
//            a++;
//            2부터 10까지 출력하는 while문 예제
//        int a = 2;
//        while(a<=10){
//            System.out.println(a);
//            a++;
//        }

//        구구단 원하는 수 입력
        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = 1;
//        while(b<10){
//            System.out.println(a+" * "+b+" = "+ a*b);
//            b++;
//        }
//
//        System.out.println("원하시는 값을 입력해주세요");
//        int a = sc.nextInt();
//        int b = 1;
//        while(true){
//            System.out.println(a+" * "+b+" = "+ a*b);
//            b++;
//        }

//        1. 도어락키 예제
//        2. int를 string으로 변경
//        3. 비밀번호를 맞추면 종료. break;
//        4. 비밀번호 5회 아상 틀리면 종료
//        도어락키 if문
//        String as = "1234";
//        int b = 0;
//        int count = 0;
//        while (b<5) {
//            String in = sc.nextLine();
//            if(as.equals(in)){
//                System.out.println("문이 열렸습니다.");
//                break;
//            }
//            else {
//                System.out.println("비밀번호가 틀렸습니다.");
//            }
//            b++;
//            count++;
//        }
//        if(count == 5){
//            System.out.println("입력횟수초과");
//        }

        int num = 1234;
        int result = 0;

//        resul에 숫자 num을 반대로 뒤집은 숫자값을 넣아주세
        System.out.println(result);

    }
}
