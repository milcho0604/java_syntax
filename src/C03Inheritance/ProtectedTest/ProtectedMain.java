// 루트(최상단) 패키지는 src


package C03Inheritance.ProtectedTest;

import C03Inheritance.C0304ProtectedClass;
// *을 통해 패키지내에 모든 클래스 import 가능
// *을 통해 패키지내에 패키지까지 포함해서 모든 내용 import는 불가능
// 즉, improt.java.*은 불가!

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

