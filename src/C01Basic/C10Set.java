package C01Basic;

import java.util.*;

import static java.util.List.*;

public class C10Set {
    public static void main(String[] args) {
//        Set<String> mySet = new HashSet<>();
//        mySet.add("h");
//        mySet.add("h");
//        mySet.add("e");
//        mySet.add("l");
//        mySet.add("l");
//        mySet.add("o");
//        System.out.println(mySet);

        // nums에서 중복되지 않은 2개의 경우의수
//        int[] nums = {3,3,3,2,2,4]};
//        Set<Integer> mySet = new HashSet<>();
//        int count =0;
//        for (int i=0; i<nums.length; i++) {
//            mySet.add(nums[i]);
//        }
//        List<Integer> list = new ArrayList<>(mySet);
//        for(int i=0; i<list.size(); i++){
//            for (int j=i+1; j<list.size(); j++){
//                count++;
//            }
//        }
//        if(count > nums.length/2){
//            System.out.println(nums.length/2);
//        }else {
//            System.out.println(count);
//        }
//        int[] nums = {3,1,2,3};
//        Set<Integer> mySet = new HashSet<>();
//        int count =0;
//        for (int i=0; i<nums.length; i++) {
//            mySet.add(nums[i]);
//        }
//        int answer =0;
//
//        if(mySet.size()>nums.length/2){
//            answer =nums.length/2;
//        }
//        else {
//            answer = mySet.size();
//        }

//        List<String> myList = new ArrayList<>();
//        myList.add("temnis");
//        myList.add("base");
//        myList.add("ball");
//        myList.add("ball");
//
////        list를 인자값으로 받아서 초기값 세팅 가능
//        Set<String> mySet = new HashSet<>(myList);
//        System.out.println(mySet);
//
//        String[] arr = {"Base", "bb", "saq"};
//        Set<String> mySet2 = new HashSet<>(Arrays.asList(arr));
//        mySet2.remove("Base");
//        System.out.println(mySet2);

//        프로그래머스 : 전화번호 목록
//        String[] phone_book = {"12", "123", "1235", "567", "88"};
//        boolean answer = true;
//        Arrays.sort(phone_book);
//        System.out.println(Arrays.toString(phone_book));
//        for (int i = 0; i < phone_book.length - 1; i++) {
//            if (phone_book[i + 1].startsWith(phone_book[i])) {
//                answer = false;
//                break;
//            }
//        }
//        System.out.println(answer);
//        String[] phone_book = {"12", "123", "1235", "567", "88"};
//        Set<String> set = new HashSet<>(Arrays.asList(phone_book));
//        boolean answer = true;
//
//        for(String s : phone_book){
//            for(int i=0; i<s.length(); i++){
//                if(set.contains(s.substring(0,i)));
//                answer = false;
//                break;
//            }
//        }

//        집합관련함수 : 교집함(retainAll), 합집합(addAll), 차집합(removeAll)
//        Set<String> set1 = new HashSet<>(Arrays.asList("java","python", "C++"));
//        Set<String> set2 = new HashSet<>(Arrays.asList("list","hash", "C++"));
//
////        set1.retainAll(set2);
////        set1.addAll(set2);
//        set1.removeAll(set2);
//        System.out.println(set1);
//        관련문제 : 뉴스 클러스터링

//        Set<String> mySet = new TreeSet<>();
//        mySet.add("hello5");
//        mySet.add("hello5");
//        mySet.add("hello3");
//        mySet.add("hello1");
//        mySet.add("hello1");
//        System.out.println(mySet);

//        두개 뽑아서 더하기
        int[] numbers = {2,1,3,4,1};
        Set<Integer> set = new TreeSet<>();
        for(int i=0; i<numbers.length; i++){
            for(int j=i+1; j<numbers.length; j++){
                set.add(numbers[i]+numbers[j]);
            }
        }
        System.out.println(set);





    }
}
