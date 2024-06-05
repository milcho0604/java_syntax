package C01Basic;

import java.util.Scanner;

public class C04IfStatements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
////        도어락키 if문
//        int pass = 1234;
//        int input = sc.nextInt();
//        if (input == pass) {
//            System.out.println("문이 열렸습니다");
//        } else {
//            System.out.println("비밀번호가 일치하지 않습니다.");
//        }

//        대문자, 소문자, 그외 판별 프로그램
//        char ch1 = sc.nextLine().charAt(0);
//        if (ch1 >= 'a' && ch1 <= 'z'){
//            System.out.println("소문자입니다.");
//        } else if (ch1 >= 'A'&& ch1 <='Z') {
//            System.out.println("대문자입니다.");
//        }
//        else{
//            System.out.println("그외입니다.");
//        }

//        택시요금 : 10000, 버스요금 : 3000, 킥보드 : 2000
//        사용자에게 얼마가 있는지 물어보고 구간별로 교통수단 추천
//        int m = sc.nextInt();
//        if(m>=10000){
//            System.out.println("택시타요");
//        }
//        else if(m>=3000){
//            System.out.println("버스타요");
//        } else if (m>=2000) {
//            System.out.println("킥보드타요");
//        }
//        else {
//            System.out.println("걸아가요");
//        }
//
////        if문 독립적으로 존재할 경우에는 정확한 범위지정을 하지 않으면,
////        모둔 if문이 중복되어 실행될 가능성이 존재
//        if(m>=10000){
//            System.out.println("택시타요");
//        }
//         if(m>=3000){
//            System.out.println("버스타요");
//        }
//         if (m>=2000) {
//            System.out.println("킥보드타요");
//        }
//        else {
//            System.out.println("걸아가요");
//        }

//        삼항연산자
//        int answer = 1234;
//        System.out.println("비밀번호를 입력하세요");
//        int input = sc.nextInt();
//        String result = (answer == input) ? "문이열렸습니다" : "비밀번호가 틀렸습니디";
//
//        System.out.println(result);
//        System.out.println("문이 열렸습니다.");
//        System.out.println("비밀번호가 틀렸습니다.");

//        switch문 : if else if 등의 조건문을 가독성있게 표현 구문
        System.out.println("원하시는 서비스 번호를 입력하시오.: ");
        int input = sc.nextInt();
//        1을 누르면 "대출어부" 2: "예금업무" 3:"적금업무" 0: "상담사 연결"
        switch (input){
            case 1 :
                System.out.println("대출업무");
                break;
            case 2 :
                System.out.println("예금업무");
                break;
            case 3 :
                System.out.println("적금업무");
                break;
            case 0 :
                System.out.println("상담사 연결");
            default:
                System.out.println("잘못입력");
        }
    }
}
