package C02ClassBasic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C0208Combi {
    public static void main(String[] args) {


        List<Integer> myList = new ArrayList<>(Arrays.asList(1,2,3,4));
        List<List<Integer>> answer = new ArrayList<>();
        combi(answer, new ArrayList<>(), myList, 2, 0);
        System.out.println(answer);
    }
    static void combi(List<List<Integer>> answer, List<Integer> temp, List<Integer> myList, int count, int start){
        if(temp.size() == count){
            answer.add(new ArrayList<>(temp));
            return;
        }
        for(int i=start; i<myList.size(); i++){
            temp.add(myList.get(i));
            combi(answer, temp, myList, count ,i+1);
            temp.remove(temp.size()-1);
        }
    }
}
