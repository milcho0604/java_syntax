package C01Basic;

import java.util.*;

public class C09Map {
    public static void main(String[] args) {
        // key & value
//        Map<String, String> myMap = new HashMap<>();
//        myMap.put("basketball", "농구");
//        myMap.put("baseball", "야구");
//        myMap.put("soccer", "축구");
//        System.out.println(myMap);
//        System.out.println(myMap.get("soccer"));
//        myMap.put("baseball", "크리켓");
////        baseball을 map에서 검색하는 복잡도 O(1)
//        System.out.println(myMap.get("baseball"));
//        myMap.remove("baseball");
//        System.out.println(myMap);

////        putIfAbsent : 비어있으면 put
//        myMap.putIfAbsent("basketball", "배구");

////        geOrDefault " key가 없으면 default값 return
//        System.out.println(myMap.get("baseball"));
//        System.out.println(myMap.getOrDefault("baseball", "비어있음"));
//        System.out.println(myMap.containsKey("baseball"));

//        String[] arr = {"농구", "농구", "배구", "야구", "배구"};
//        Map<String, Integer> myMap = new HashMap<>();
//        for(String a :arr){
////            if(myMap.containsKey(a)){
////                myMap.put(a, myMap.get(a)+1);
////            }
////            else {
////                myMap.put(a, 1);
////            }
////            myMap.put(a, myMap.getOrDefault(a,0)+1);
//        }
//        System.out.println(myMap);

//        for(int i=0; i<arr.length; i++){
//            if(!myMap.containsKey(arr[i])){
//                myMap.put(arr[i], i);
//            }
//            myMap.put(arr[i], myMap.getOrDefault(arr[i],0)+1);
//        }
//        System.out.println(myMap);

//        keySet() : 키목록을 Set형태로 반환
//        values() : value목록을 반환

//        enhanced for문을 통해 key값을 하나씩 출력🥕
//        for(String a : myMap.keySet()){     // key값
//            System.out.println(a);
//            System.out.println(myMap.get(a));
//        }
//        for(int a : myMap.values()){        // value값
//            System.out.println(a);
//        }

//        iterator를 통해 key값 하나식 출력
//        Iterator<String> myItr = myMap.keySet().iterator();
//        next()메서드는 데이터를 하나씩 소모시키면서 return
//        System.out.println(myItr.next());
//        System.out.println(myItr);

//        hasNext() : iterator 안에 값이 있는지 없는지 boolean return
//        while(myItr.hasNext()){
//            System.out.println(myItr.next());
//        }

//        프로그래머스 : 완주하지 못한 선수
//        String[] participant = {"leo", "kiki", "eden"};
//        String[] completion = {"eden", "kiki"};
//        Map<String, Integer> ks = new HashMap<>();
//        String answer = "";
//        for (String a : participant) {
//            ks.put(a, ks.getOrDefault(a, 0) + 1);
//        }
//        for (String a : completion) {
//            if (ks.containsKey(a)) {
//                if (ks.get(a) == 1) {
//                    ks.remove(a);
//                } else {
//                    ks.put(a, ks.get(a) - 1);
//                }
//            }
//        }
//        for (String a : ks.keySet()) {
//            answer = a;
//        }
//        System.out.println(ks.keySet());

//        의상 프로그래머스
//        String[][] clothes = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"},
//                {"green_turban", "headgear"}};
//        Map<String, String> cloMap = new HashMap<>();
//        int answer = 0;


//        LiknedHashMap : 데이터 삽입순서 유지
//        Map<String,Integer> linkedMap = new LinkedHashMap<>();
//        linkedMap.put("hello5",1);
//        linkedMap.put("hello4",1);
//        linkedMap.put("hello3",1);
//        linkedMap.put("hello2",1);
//        linkedMap.put("hello1",1);
//        System.out.println(linkedMap);
//
////        TreeMap : 데이터 오름차순 삽입
//        Map<String,Integer> treMap = new TreeMap<>();
//        treMap.put("heelo5", 1);
//        treMap.put("heelo4", 1);
//        treMap.put("heelo3", 1);
//        treMap.put("heelo2", 1);
//        treMap.put("heelo1", 1);
//        System.out.println(treMap);
//        String[] strings = {"usun", "ebed", "acar"};
//        int n=1;
//        Map<String,String> map = new TreeMap<>();
//        for(String a : strings){
//            map.put(a.charAt(n)+a,a);
//        }
//        String[] answer = new String[strings.length];
//        int count =0;
//        for(String a : map.values()){
//            answer[count] = a;
//            count ++;
//        }
//        System.out.println(map);

    }
}
