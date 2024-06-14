package C03Inheritance.ProtectedTest;

import C03Inheritance.C0304ProtectedClass;

public class ProtectedMain extends C0304ProtectedClass {
    public static void main(String[] args) {
//        객체를 만듥자
//        public : 접근 가능
//        default, protected, private : 접근 불가
        C0304ProtectedClass c1 = new C0304ProtectedClass();
        System.out.println(c1.st4);

        ProtectedMain p1 = new ProtectedMain();
//        default 접근 불가
//        System.out.println(p1.s2);
//        상속한 객체에서 protected 접근 가능
        System.out.println(p1.st3);
    }
}

