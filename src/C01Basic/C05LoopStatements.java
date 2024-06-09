package C01Basic;

import java.util.Scanner;

public class C05LoopStatements {
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

//        숫자를 반대로 출력
//        int num = 1234;
//        int result = 0;
//        while(true){
//            int temp = num % 10;
//            result = result*10 + temp;
//            num /= 10;
//            if(num == 0)
//                break;
//        }
//        System.out.println(result);

//        do whilea문 : 무조건 1번은 실행되는 반복문
//        int a = 1;
//        do{
//            a++;
//            System.out.println(a);
//        }while (a<10);

////        2~10까지 출력을 for문을 활용하여 출력
//        for(int i = 2; i<=10; i++){
//            System.out.println(i);
//        }
//        1~10중에 홀수만 출력하기
//        for(int i=1; i<=10; i++){
//            if(i%2 != 0 ){
//                System.out.println(i);
//            }
//        }
//        1~20까지의 수 중에 짝수를 모두 더한 값
//        int total = 0;
//        for(int i=1; i<=20; i++){
//            total +=i;
//        }
//        System.out.println(total);

//        최대공약수 구하기
//        int a = 24;
//        int b = 36;
//        int max = a>b ? a:b;
//        int answer = 0;
//        for(int i=0; i<=max; i++){
//            if(a%i == 0 && b%i == 0){
//                answer = i;
//            }
//        }

//        소수구하기 : 1과 자기자신을 제외한 숫자로 나누어지지 않는 수
//        1~24까지 수 중에 소수를 출력
//        1,2,3,7~

//        소수 판별
//        int in = sc.nextInt();
//        boolean trueornot = false;
//
//        for(int i=2; i<in; i++){
//            if(in%i==0){
//                trueornot = true;
//                break;
//            }
//        }
//        if(!trueornot){
//            System.out.println("소수");
//        }

//        for (int j = 1; j <= 24; j++) {
//            boolean trueornot = false;
//            for (int i = 2; i < j; i++) {
//                if (j % i == 0) {
//                    trueornot = true;
//                    break;
//                }
//            }
//            if (!trueornot) {
//                System.out.println(j + "소수");
//            }
//        }

//        홀수만 출력하기
//        for (int i = 1; i <= 10; i++) {
//            if (i % 2 == 0) {
//                continue;
//            }
//            System.out.println(i);
//        }

////        배열과 enhanced for문(향상된 for문 - for each문)
//        int[] arr = {1, 3, 5, 7, 9};
////        일반 for문
//        for(int i=0; i<arr.length; i++){
//            System.out.println(arr[i]);
//        }
////        향상된 for문 : 반복횟수는 arr에 들어가있는 데이터 개수만큼 반복
//        for(int i : arr){
//            System.out.println(i);
//        }
//        일반 for문을 통한 arr값 변경 후 출력
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] += 10;
//        }
//        System.out.println(Arrays.toString(arr)); // 메모리 주소출력이 내용출력
////        향상된 for문은 통한 arr값 변경 후 출력
////        향상된 for문으로는 실제 arr값의 변경은 불가능.
//        for (int i : arr) {
//            i += 10;
//        }
//        System.out.println(Arrays.toString(arr)); // 메모리 주소출력이 내용출력
//
////        자바 변수의 유효범위 : {}
//        int num = 10;
//        if(num>1){
//            int abc = 20;
//            num=20;
//        }
//        abc=30; if문 중괄호 밖에서는 abc변수의 존재를 모름

//        for(int i=2; i<=9; i++){
//            System.out.println(i+"단입니다.");
//            for(int j=2; j<=9; j++){
//                System.out.println(i+"*"+j+"="+i*j);
//            }
//        }


//        라벨문
//        loop:
//        for(int i=0; i<5; i++){
//            for(int j=0; j<5; j++){
//                System.out.println("hellod world");
//                if(j==2){
//                    break loop;
//                }
//            }
//        }

//        라벨문 활용해서 원하는 값찾기
//        int[][] arr={{1,2,3}, {4,5,11}, {7,8,9}, {10,11,12}};
//        loop: for(int i=0; i< 4; i++){
//            for (int j=0; j< 3; j++){
//                if(arr[i][j] == 11){
//                    System.out.println(arr[i][j]);
//                    break loop;
//                }
//            }
//        }
//        int[][] arr={{1,2,3}, {4,5,11}, {7,8,9}, {10,11,12}};
//        loop: for(int i=0; i< 4; i++){
//            for (int j=0; j< 3; j++){
//                if(arr[i][j] == 11){
//                    System.out.println(arr[i][j]);
//                    break loop;
//                }
//            }
//        }

//        라벨문을 쓰지 않고 첫 번째 11을 찾고 break
//        int[][] arr={{1,2,3}, {4,5,11}, {7,8,9}, {10,11,12}};
//         for(int i=0; i< 4; i++){
//             boolean test = false;
//            for (int j=0; j< 3; j++){
//                if(arr[i][j] == 11){
//                    System.out.println(arr[i][j]);
//                    test = true;
//                    break ;
//                }
//            }
//             if(test==true){
//                 break;
//             }
//        }



    }
}

//        int a = 24;
//        int b = 36;
//        while (b != 0) {
//            int temp = b;
//            b = a % b;
//            a = temp;
//        }
//        int max = a;
//        System.out.println(max);
//
//        int A = a;
//        int B = b;
//        while (b != 0) {
//            int temp = b;
//            b = a % b;
//            a = temp;
//        }
//
//        int min = (A * B) / max;
//
//        System.out.println(min);
