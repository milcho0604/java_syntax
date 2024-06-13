package C02ClassBasic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C0207RecurCombrPermu {

    static List<List<Integer>> answer = new ArrayList<>();
    static List<Integer> list;
    static int count;
    public static void main(String[] args) {
//        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        // List로 만들 수 있는 2개짜리 숫자 조합을 이중 리스트에 담기
        // [[1, 2], [1, 3], [1, 4], [2, 3], [2, 4], [3, 4]]
//        List<List<Integer>> newList = new ArrayList<>();
//        for (int i = 0; i < list.size() - 1; i++) {
//            for (int j = i + 1; j < list.size(); j++) {
//                List<Integer> temp = new ArrayList<>();  // temp 리스트를 이곳에서 새로 생성
//                temp.add(list.get(i));
//                temp.add(list.get(j));
//                newList.add(temp);
//            }
//        }

//        List<List<Integer>> combination = new ArrayList<>();
//        for (int i = 0; i < list.size() - 1; i++) {
//            for (int j = i + 1; j < list.size(); j++) {
//                List<Integer> temp = new ArrayList<>();  // temp 리스트를 이곳에서 새로 생성
//                temp.add(list.get(i));
//                temp.add(list.get(j));
//                combination.add(temp);
//            }
//        }
//        System.out.println(combination);


        List<Integer> myList = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
//        myList로 만들수 있는 2개짜리 숫자조합을 이중리스트에 담기
//        [[1,2], [1,3] [1,4], ...]
        List<List<Integer>> combinations = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        for (int i = 0; i < myList.size() - 1; i++) {
            temp.add(myList.get(i));
            for (int j = i + 1; j < myList.size(); j++) {
                temp.add(myList.get(j));
                combinations.add(temp);               // j에 대해 combinations에 추가하고 다시 반복을 하니까 앞에 내용을 지워야 한다
                temp.remove(myList.size() - 1); // 그래서 temp를 초기화(즉, 지운다)
            }
            temp.remove(myList.size() - 1);     // 위와 마찬가지로 ! i가 0인 경우에 추가 했으니 i가 1인 경우를 추가히기 위해서
            // i=0인 것에 대한 내용을 초기화(즉, 삭제)
        }
    }
    static void combi(){

    }

//        answer = new ArrayList<>();
//        list = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
//        count=2;
//        combinations (new ArrayList<>(),0);
//        System.out.println(answer);
//
//
//    }
//    static void combinations( List<Integer> temp,  int start) {
//        if (temp.size() == count) {
////            temp값을 그대로 add할 경우 temp 메모리 값이 add되므로, 모든 answer리스트에 같은 temp리스트 add
//            answer.add(new ArrayList<>(temp));  // 값과 함께 메모리가 들어감
////            answer.add(temp);                 // 값이 아닌 메모리 주소만 들어감
//            return;
//
//        }
//        for (int i = start; i < list.size(); i++) {
//            temp.add(list.get(i));
//            combinations( temp, i + 1);
//            temp.remove(temp.size() - 1);
//        }
//    }
}
