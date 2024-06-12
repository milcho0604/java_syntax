package C01Basic;

public class C11Queue {
    public static void main(String[] args) {
        // FIFO
//        Queue<Integer> myQue = new LinkedList<>();
//        myQue.add(10);
//        myQue.add(20);
//        myQue.add(30);
//        System.out.println(myQue.peek()); // 10
//        System.out.println(myQue); // 맛만 보자
//        System.out.println(myQue.poll()); // 10
//        System.out.println(myQue); // 먹어버리자

//        LinkedList와 ArrayList 비교
//        LinkedList의 Add
//        LinkedList<Integer> list1 = new LinkedList<>();
//        long startTime = System.currentTimeMillis();
//        for(int i=0; i<100000; i++){
//            list1.add(0,10);
//        }
//        long endTime = System.currentTimeMillis();
//        System.out.println("LinkedList의 중간 삽입: " + (endTime-startTime));
//
//        ArrayList<Integer> list2 = new ArrayList<>();
//        long startTime2 = System.currentTimeMillis();
//        for(int i=0; i<100000; i++){
//            list2.add(0,10);
//        }
//        long endTime2 = System.currentTimeMillis();
//        System.out.println("ArrayList의 중간 삽입: " + (endTime2-startTime2));
//
//        long startTime3 = System.currentTimeMillis();
//        for(int i=0; i<100000; i++){
//            list1.get(i);
//        }
//        long endTime3 = System.currentTimeMillis();
//        System.out.println("LinkedList의 조회: " + (endTime3-startTime3));
//
//        long startTime4 = System.currentTimeMillis();
//        for(int i=0; i<100000; i++){
//            list2.get(i);
//        }
//        long endTime4 = System.currentTimeMillis();
//        System.out.println("ArrayList의 조회: " + (endTime4-startTime4));
//
//        Queue<String> que = new LinkedList<>();
//        que.add("문서1");
//        que.add("문서2");
//        que.add("문서3");
//        while(!que.isEmpty()){
//            System.out.println(que.poll());
//        }

//        ArrayBlockingQueue : 길이제한 큐
//        Queue<Integer> que = new ArrayBlockingQueue<>(3);
////        add : 사용하면 길이제한 초과시 예외처리 발생
//        que.add(10);
//        que.add(20);
//        que.add(30);
//        que.add(40);

//        offer : 예외처리를 발생시키지 않고 처리
//        que.offer(10);
//        que.offer(20);
//        que.offer(30);
//        que.offer(40);
//        System.out.println(que);


//        우선순위 큐 : 데이터를 꺼낼때 정렬된 데이터 pop🥕, 전체정렬 x
//        Queue<Integer> pq = new PriorityQueue<>();
//        pq.add(30);
//        pq.add(20);
//        pq.add(10);
//        pq.add(50);
//        pq.add(40);
//        System.out.println(pq);
//        while (!pq.isEmpty()){
//            System.out.println(pq.poll());
//    }

//        프로그래머스 : 더 맵게
//        int[] scoville = {1, 2, 3, 9, 10, 12};
//        int K = 7;
//        int count = 0;
//        int sum = 0;
//        Queue<Integer> que = new PriorityQueue<>();
//        for (int i = 0; i < scoville.length; i++) {
//            que.add(scoville[i]);
//        }
//        while(que.peek()<K){
//          if (que.size() < 2) {
//               answer = -1;
//          }
//            int food1 = que.poll();
//            int food2 = que.poll();
//
//            sum = food1+(food2*2);
//            que.add(sum);
//            count ++;
//        }

//            for (int j = i + 1; j < scoville.length-1; j++) {
//                sum = que.poll();
//                if (sum < K) {
//                    sum = que.poll() + (scoville[j] * 2);
//                    count++;
//                }
//            }
//        System.out.println(answer);


    }
}
