package C03Inheritance;

// extends 키워드를 통해 상속관계를 표현
public class C0301Inheritance extends Parents {
    int c = 30;

    public static void main(String[] args) {
    }
}

class Parents {
    int a = 10;
    private int b = 20;

    void parentMethod() {
        System.out.println("부모클래스입니다.");
    }
}
