package C04Interface;

public class InterfaceMain {
    public static void main(String[] args) {
        CatImplements cat1 = new CatImplements();
        cat1.makeSound();
        DogImplements dog1 = new DogImplements();
        dog1.makeSound();


//        다형성 : 하나의 객체가 여러개의 참조변수를 가질수 있음을 의미
        AnimalInterface1 cat2 = new CatImplements();
        cat2.makeSound();
        AnimalInterface1 dog2 = new DogImplements();
        dog2.makeSound();

        CatMultiImplements cat3 = new CatMultiImplements();
        cat3.makeSound();
        System.out.println(cat3.play("코숏", "리트리버"));


        DogMultiImplements dog3 = new DogMultiImplements();
        dog3.makeSound();
        System.out.println(dog3.play("푸들", "먼치킨"));

//        DogMultiImplements가 아닌  AnimalInterface2 쓰면
//        MultIplements고 뭐고 AnimalInterface2에 있는 기능만 사용이 가능
//        CatMultiImplements이 ani1과 ani2다 구현했어도.
        AnimalInterface2 cat4 = new CatMultiImplements();
//        cat4.makeSound(); 사용 불가 AnimalInterface1 기능이라
        System.out.println(cat4.play("코숏", "리트리버"));


        AnimalInterface2 dog4 = new DogMultiImplements();
//        dog4.makeSound(); 사용 불가 AnimalInterface1 기능이라
        System.out.println(dog4.play("푸들", "먼치킨"));


//        기본적으로 추상클래스, 인터페이스는 객체 생성이 불가능하나,
//        익명내부클래스 방식으로 생성 가능
        AnimalInterface1 ani1 = new AnimalInterface1() {
            @Override
            public void makeSound() {
                System.out.println("hello");
            }
        };
        ani1.makeSound();

    }
}
