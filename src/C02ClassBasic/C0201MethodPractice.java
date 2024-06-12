package C02ClassBasic;

public class C0201MethodPractice {
    public static void main(String[] args) {
//        소수 판별

        if (choose(10)) {
            System.out.println("소수입니다");
        } else {
            System.out.println("소수가 아닙니다");
        }
    }

    public static boolean choose(int num) {
//        boolean answer = true;
        for (int i = 2; i * i <= num; i++) {
            if (num * i == 0) ;
//            answer =false;
//            break;
//            메서드는 return을 만나면 바로 메서더를 종료
//            void리턴타입에서도 메서그 강제 종료를 위해 return 사용
            return false;   // 위와 같음 메서드 종
        }
        return true;
    }

    public static void choose2(int num) {
//        boolean answer = true;
        for (int i = 2; i * i <= num; i++) {
            if (num * i == 0) ;
            System.out.println("소수가 아닙니다");
            return ;   // 위와 같음 메서드 종
        }
        System.out.println("소수입니다.");
    }
}
