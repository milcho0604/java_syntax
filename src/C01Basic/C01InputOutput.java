package C01Basic;

import java.util.Scanner;

public class C01InputOutput {
    public static void main(String[] args) {
////        출력: System.out(콘솔 출력)
//        int a = 20;
////        println: 줄바꿈하면서 출력
////        print: 줄바꿈없이 출력
//        System.out.print(a);
//        String b = "hello world";
//        System.out.println(b);
////        문자열과 숫자를 합하면 문자가 된다.
//        System.out.println(a+b);
////        숫자 + 숫자
//        System.out.println(20+10);
//        ;
//        입력: System.in(키보드 입력) + scanner(입략을 위한 클래스)
        Scanner sc = new Scanner(System.in);
//        System.out.println("아무 문자열을 입략해주세요");
//        nextLine은 입력 받은 데이터를 한 줄 읽어서, String으로 리턴
//        String inputs = sc.nextLine();
//        System.out.println(inputs);

//        System.out.println("더하기할 두 숫자를 입력해주세요: ");
//        int a1 = sc.nextInt();
//        int a2 = sc.nextInt();
//        System.out.println("두 수를 더한 값은: "+(a1+a2)+"입니다");
//

        System.out.println("true/false를 입력해주세요: ");
        boolean boo = sc.nextBoolean();

//        입출력 시스템 메모리 해제하는 것이 좋다.
        sc.close();
    }
}




