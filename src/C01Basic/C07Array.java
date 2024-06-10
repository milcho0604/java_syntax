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
//        String[] st_arr = {"hello", "hi", "bye", "goodmorning"};
//        Arrays.sort(st_arr, Comparator.reverseOrder());
//        System.out.println(Arrays.toString(st_arr));
//
////        기본형 타입은, Comparator로 처리 불가.
//        int[] intArr = {10,20,30,12,8,17,40,30,6};
//        Integer[] integerArr = {10,20,30,12,8,17,40,30,6};

//        방법1. 오름차순 정렬 후 배열뒤집기

//        방법2. stream 후 lambda를 활용한 내림차순 정렬 ⭐⭐⭐
//        int[] answer = Arrays.stream(intArr) // intArr를 대상으로 Stream객체
//                .boxed()  // int요소를 integer로 형변환
//                .sorted(Comparator.reverseOrder())
//                .mapToInt(a->a) //Integer를 int로 형변환
//                .toArray(); // Array로 변환
//
//
//
//        Arrays.sort(integerArr, Comparator.reverseOrder());
//        int intType[] = Arrays.stream(integerArr).mapToInt(Integer::intValue).toArray();
//        System.out.println(Arrays.toString(intArr));
//
//        k번째수 프로그래머스
//        commands안에 array와 ijk
//        int[] array = {1, 4, 2, 6, 3, 7, 4};
//        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
//        int[] answer = new int[commands.length];
//        for (int i = 0; i < commands.length; i++) {
//            int start = commands[i][0] - 1;
//            int end = commands[i][1];
//            int value = commands[i][2] - 1;
//            int[] temp = new int[end - start];
//            int count = 0;
//            for (int j = start; j < end; j++) {
//                temp[count] = array[j];
//                count++;
//            }
//            Arrays.sort(temp);
//            answer[i] = temp[value];
//        }
//        System.out.println(Arrays.toString(answer));

//        선택정렬 알고리즘
//        int[] arr = {17,20,19,25,12};
//        for(int i=0; i< arr.length-1; i++){
//            int min = arr[i];
//            int index=i;
//            for(int j=i+1; j< arr           .length; j++){
//                if(min>arr[j]){
//                    min = arr[j];
//                    index = j;
//                }
//            }
//            int temp = arr[i];
//            arr[i] =arr[index];
//            arr[index] = temp;
//        }
//        System.out.print(Arrays.toString(arr));
//        int[] arr = {17,12,20,10,25};
//        for(int i=0; i<arr.length-1; i++){
//            int min = arr[i];
//            int index = i;
//            for(int j=i+1; j<arr.length; j++){
//                if(min > arr[j]){
//                    min = arr[j];
//                    index = j;
//                }
//            }
//            int temp = arr[i];
//            arr[i] = arr[index];
//            arr[index] = temp;
//        }
//        int[] arr = {17,12,20,10,25};
//        for(int i=0; i<arr.length-1; i++){
//            for(int j=i+1; j<arr.length; j++){
//                if(arr[i] > arr[j]){
//                    int temp = arr[i];
//                    arr[i] = arr[j];
//                    arr[j] = temp;
//                }
//            }
//        }
//        for(int i=0; i< arr.length; i++){
//            int index = i;
//            for(int j=i+1; j< arr.length; j++){
//                if(arr[index]>arr[j]){
//                    index=j;
//                }
//            }
//            int temp = arr[i];
//            arr[i]= arr[index];
//            arr[index] = temp;
//        }
//        System.out.println(Arrays.toString(arr));

//        숫자 조합의 합 : 모두 각기 다른 숫자의 배열이 있을때,
//        만들어질 수 있는 2개의 조합의 합을 출력
//        int[] arr = {10,20,30,40,50,60};
//        for(int i=0;i<arr.length; i++){
//            int[] total = new int [arr.length];
//            for(int j=i+1; j<arr.length; j++){
//                if(arr[i] != arr[j]){
//                    int temp = arr[j];
//                    total[i] = arr[i]+arr[j];
//                }
//                System.out.println(Arrays.toString(total));
//            }
//        for(int i=0; i<arr.length; i++){
//            for(int j=i+1; j<arr.length; j++){
//                System.out.println(arr[i]+arr[j]);
//            }
//        }

//        배열의 복사 :
//        copyOf(배열, length), copyOfRange(배열, start, end)
//        int[] arr = {10,20,30,40,50};
//        int[] newArr1 = Arrays.copyOf(arr,3);
//        int[] newArr2 = Arrays.copyOfRange(arr,1,4);
//        System.out.println(Arrays.toString(newArr1));
//        System.out.println(Arrays.toString(newArr2));

//        배열의 중복제거
//        int[] temp = {10, 10, 5, 7, 40, 40, 10, 10};
//        Arrays.sort(temp);
//        int[] newTemp = new int[temp.length];
//        int num=0;
//
//        for (int i = 0; i< temp.length; i++){
//            if(i==0 || temp[i] != temp[i-1]){
//                newTemp[num]=temp[i];
//                num++;
//            }
//        }
//        int[] answer = Arrays.copyOfRange(newTemp,0,num);
//        System.out.println(Arrays.toString(newTemp));
//        System.out.println(Arrays.toString(answer));

//        프로그래머스 : 두 개 뽑아서 더하기
//        int[] numbers = {2,1,3,4,1} ;
//        int count = 0;
//        Arrays.sort(numbers);
//        int[] temp =  new int[numbers.length * numbers.length];
//        for(int i=0; i<numbers.length; i++){
//           for(int j=i+1; j<numbers.length; j++){
//               temp[count] = numbers[i]+numbers[j];
//               count ++;
//            }
//        }
//        System.out.println(Arrays.toString(temp));
//        temp = Arrays.copyOf(temp,count);
//        System.out.println(Arrays.toString(temp));
//        int[] newTemp  = new int [temp.length];
//        int num=0;
//        Arrays.sort(temp);
//        for (int i=0; i<temp.length; i++){
//            if(i==0 || temp[i] != temp[i-1]){
//                newTemp[num] = temp[i];
//                num++;
//            }
//        }
//        System.out.println(Arrays.toString(newTemp));
//        int[] answer = Arrays.copyOfRange(newTemp, 0, num);
//        System.out.println(Arrays.toString(answer));

//        배열의 검색
//        int[] arr = {5,3,1,8,7};
//        int num=0;
//        for(int i=0; i<arr.length; i++){
//            if(arr[i] == 8){
//                num=i;
//                break;
//            }
//        }
//        System.out.println(num);

//        이진검색(Binary Search)
//        복잡도 O{logn)
//        int[] arr = {1, 3, 6, 8, 9, 11, 15, 17};
////        사전에 오름차순 정렬이 되어 있어야 이진검색 가능
//        System.out.println(Arrays.binarySearch(arr, 15));
//
////        배열간 비교
//        int[] arr1 = {10, 20, 30};
//        int[] arr2 = {10, 20, 30};
//        System.out.println(arr1 == arr2);
////        Arrays.equals : 값과 순서까지 동일해야 true
//        System.out.println(Arrays.equals(arr1,arr2));

//        2차원 배열 선언과 할당
//        int[][] arr = new int[2][3];
//        arr[0][0]=1;
//        arr[0][1]=2;
//        arr[0][2]=3;
//        arr[1][0]=4;
//        arr[1][1]=5;
//        arr[1][2]=6;

//        리터럴 방식으로 할당
//        int[][] arr2 =  {{1,2,3},{4,5,6}};
//        {{1,2,3},{4,5,6}}

//        2치원 배열의 출력
//        System.out.println(Arrays.deepToString(arr2));

//        2차원 가변배열 선언 후 할당
//        int[][] arr = new int[2][];
//        arr[0] = new int[3];
//        arr[1] = new int[4];
//
////        가변배열 리터럴 방식
//        int[][] arr2 = {{10,20},{10,20,30}};

//        [3][4]사이즈 배열을 선언한 뒤
//        1~12까지 숫자값 각 배열에 할당 후 출력
//        {1,2,3,4},{5,6,7,8},{9,10,11,12}
//        int[][] arr = new int[3][4];
//        int count =1;
//        for(int i=0; i<arr.length; i++){
//            for(int j=0; j<arr[i].length; j++){
//                arr[i][j] = count;
//                count++;
//            }
//        }
//        System.out.println(Arrays.deepToString(arr));

//        int[][] arr1 = {{1, 2}, {2, 3}};
//        int[][] arr2 = {{3, 4}, {5, 6}};
//        int[][] num = new int[arr1.length][arr1[0].length];
//
//        for (int i = 0; i < num.length; i++) {
//            for (int j = 0; j < num[i].length; j++) {
//                num[i][j] = arr1[i][j] + arr2[i][j];
//            }
//        }
//        System.out.println(Arrays.deepToString(num));

//        가변배열실습 : 행의 길이(전체배열의길이)5
//        int[][] arr = new int [5][];
//        for(int i=0; i< arr.length; i++){
//            arr[i] = new int[i+1];
//            for(int j=0; j<arr[i].length; j++){
//                arr[i][j] = (i+1)*10;
//            }
//        }
//        System.out.println(Arrays.deepToString(arr));
    }
}