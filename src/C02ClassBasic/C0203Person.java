package C02ClassBasic;

public class C0203Person {
    private String name;

    private String email;

    private int age;

//    getter
    public String getName() {
        return name;
    }
//    setter
    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public void eating(){
        System.out.println(this.name + "이 밥을 먹는다");
        ;
    }


}
