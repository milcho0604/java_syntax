package C03Inheritance;


// 클래스에는 public과 default 접근제어자만 존재
public class C0304ProtectedClass {
//    변수, 메서드에는 4가지 접근제어자 존재

//    protected : 패키지를 벗어나더라도 상속관계인 경우에는 접근가
//    public : 프로젝트 전체에서 접근가능
//    default : 패키지내에서만 접근가능
//    private : 클래스내에서만 접근가능

//    private : 클래스내에서만 접근가능
    private String st1 = "hello world";
//    default : 패키지내에서만 접근가능
    String st2 = "hello java2";
//    protected : 패키지를 벗어나더라도 상속관계인 경우에는 접근가능
    protected String st3 = "hello py3";
//    public : 프로젝트 전체에서 접근가능
    public String st4 = "hello vue4";

}
