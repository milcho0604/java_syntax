package C01Basic;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public class C07Array {
    public static void main(String[] args) {
//        배열 표현식 1 : 리터럴방식
//        int[] intArr1 = {1,2,3,4,5};
//
////        배열 표현식 2 : 배열 선언 후 할당 방식
//        String[] intArr2 = new String[5];
//        intArr2[0] = "0";
//        intArr2[1] = "3";
//        intArr2[2] = "4";
//        System.out.println(intArr2[4]);
//
////        배열 표현식 3
//        int[] intArr3 = new int[]{1,2,3,4};
//
////        표현식 4 : 불가 -> 배열의 길이는 사전에 지정되어야 한다.
//        int[] intArr4 = new int[];

//        String[] stArr1 = new String[5];
//        System.out.println(stArr1[2]);
//        Arrays.fill(stArr1,"java");

//        85,68,90인 int 배열 선언 후 총합, 평균을 구하시오
//        int[] nums = {85,68,90};
//        int sum = 0;
//        int ave = 0;
//        for (int i = 0; i < nums.length; i++) {
//            sum += nums[i];
//        }
//        ave = sum / nums.length;
//        System.out.println(sum +" "+ave);


//        최대값과 최소값 구하기!
//        int[] arr = {10,20,30,12,8,17,40,30,6};
//        int max = arr[0];
//        int min = arr[0];
//        for (int i = 0; i < arr.length; i++) {
//            max = (arr[i] > max) ? arr[i] : max;
//            min = (arr[i] < min) ? arr[i] : min;
//        }
//        System.out.println(max+" "+min);

//        배열의 자리 바꾸기
//        int[] arr = {10,20};
//        int temp = arr[0];
//        arr[0] = arr[1];
//        arr[1] = temp;

//        int[] arr2 = {10, 20, 30, 40, 50};
//        int temp = arr2[0];
//        for (int i = 0; i < arr2.length; i++) {
//            arr2[i] = (i != arr2.length - 1) ? arr2[i + 1] : temp;
//        }
//        System.out.println(Arrays.toString(arr2));

//        배열뒤집기
//        int[] arr = {1,2,3,4,5};
//        int[] arr2 = new int[arr.length];
//        for (int i=0;i<arr.length;i++){
//            arr2[i] = arr[arr.length-(i+1)];
//        }
//        System.out.println(Arrays.toString(arr2));


////        숫자뒤집기
//        int num = 1234;
//        String[] str = String.valueOf(num).split("");
//        String[] str2 = new String[str.length];
//        for (int i = 0; i < str.length; i++) {
//            str2[i] = str[str.length-(i+1)];
//        }
//        System.out.println(String.join("",str2));


//        문자정렬
//        아스키코드 기준으로,
//        String[] fruits = {"banana", "apple", "cherry", "Apple"};
//        Arrays.sort(fruits);
//        System.out.println(Arrays.toString(fruits));
//
////        문자열의 index순서로 비교
//        String[] fruits2 = {"apple11", "apple1", "apple2", "apple02"};
//        Arrays.sort(fruits2);
//        System.out.println(Arrays.toString(fruits2));


//        내림차순
        String[] st_arr = {"hello", "hi", "bye", "goodmorning"};
        Arrays.sort(st_arr, Comparator.reverseOrder());
        System.out.println(Arrays.toString(st_arr));

//        기본형 타입은, Comparator로 처리 불가.
        int[] intArr = {10,20,30,12,8,17,40,30,6};
        Integer[] integerArr = {10,20,30,12,8,17,40,30,6};

//        방법1. 오름차순 정렬 후 배열뒤집기

//        방법2. stream 후 lambda를 활용한 내림차순 정렬 ⭐⭐⭐
        int[] answer = Arrays.stream(intArr) // intArr를 대상으로 Stream객체
                .boxed()  // int요소를 integer로 형변환
                .sorted(Comparator.reverseOrder())
                .mapToInt(a->a) //Integer를 int로 형변환
                .toArray(); // Array로 변환



        Arrays.sort(integerArr, Comparator.reverseOrder());
        int intType[] = Arrays.stream(integerArr).mapToInt(Integer::intValue).toArray();
        System.out.println(Arrays.toString(intArr));



    }
}