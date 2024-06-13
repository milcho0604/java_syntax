package C02ClassBasic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C0209Permutation {
    public static void main(String[] args) {

//        순열

        List<Integer> myList = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        List<List<Integer>> answer = new ArrayList<>();
        permu(answer, new ArrayList<>(), myList, 2, 0, new boolean[myList.size()]);
        System.out.println(answer);
    }

    static void permu(List<List<Integer>> answer, List<Integer> temp, List<Integer> myList, int count, int start, boolean visited[]) {
        if (temp.size() == count) {
            answer.add(new ArrayList<>(temp));
            return;
        }
        for (int i = start; i < myList.size(); i++) {
            if(visited[i]==false){
                visited[i] =true;
                temp.add(myList.get(i));
                permu(answer, temp, myList, count, i + 1, visited);
                temp.remove(temp.size() - 1);
                visited[i] = false;
            }
        }
    }
}
