package C06EtcClass;

public class C0605EnumMain {
//    타입에 제한
    public static void main(String[] args) {
        EnumStudent s1 = new EnumStudent();
        s1.setName("홍길동");
        s1.setClassGrade(ClassGrade.c1);

        EnumStudent s2 = new EnumStudent();
        s2.setName("길동이");
//        여전히 타입이 String 타입이므로 임의 클래스변수 사용하지 않을수 있음.
        s2.setClassGrade("secondasks");
//        role의 경우 Enum설정시 위와 같은 실수를 방지할수 있음
        s2.setRole(Role.GENERAL_USER);

        System.out.println(s2.getRole());
        System.out.println(s2.getRole().getClass());
//        enum값 내부에는 저장된 순서대로 0부터 index값이 내부적으로 할당
        System.out.println(s2.getRole().ordinal());
    }
}
class ClassGrade{
    static final String c1 = "first_grade";
    static final String c2 = "second_grade";
    static final String c3 = "third_grade";
}

enum Role{
//    각 열거형 상수는 콤마로 구분하고 상수목록 끝에 세미콜론으로 마무리 짓는다
//    static final 생략이 되어있는 형식
    GENERAL_USER,  ADMIN_USER;
}

class EnumStudent{
    private String name;
    private String classGrade;
    private Role role;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassGrade() {
        return classGrade;
    }

    public void setClassGrade(String classGrade) {
        this.classGrade = classGrade;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}
