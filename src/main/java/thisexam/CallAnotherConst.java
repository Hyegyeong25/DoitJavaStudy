package thisexam;

class Person {

    String name;
    int age;

    public Person() {
        // 생성자에서 다른 생성자를 호출
        this("이름없음", 1);
    }

    public Person(String name, int age) {
        //자신의 메모리를 가리킴
        //위 코드에서 this를 제거하면 파라미터로 사용되는 name과 age를 가리킴
        this.name = name;
        this.age = age;
    }

    public Person returnSelf() {
        return this; // 자신의 주소를 반환 함
    }
}
public class CallAnotherConst {

    public static void main(String[] args) {

        Person p1 = new Person();
        System.out.println(p1.name);

        System.out.println(p1.returnSelf());
    }
}
