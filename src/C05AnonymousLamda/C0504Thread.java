package C05AnonymousLamda;

public class C0504Thread {
    public static void main(String[] args) {
//        쓰레드 구현 방법 : 쓰레드 상속, Runnable 주입
//        Runnable 인터페이스 : 쓰레드 구현
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("새로 생선한 쓰레드1 입니다.");
                System.out.println("새로 생선한 쓰레드2 입니다.");
                System.out.println("새로 생선한 쓰레드3 입니다.");
                System.out.println("새로 생선한 쓰레드4 입니다.");
            }
        });
        t1.start();

        Thread t2 = new Thread(()->{
            System.out.println("새로 생성한 쓰레드2 입니다.");
        });
        t2.start();

        new Thread(() ->System.out.println("새로 생성한 쓰레드 3입니다.")).start();
        System.out.println("main 쓰레드 입니다.");
    }
}
