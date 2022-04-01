package thisexam;

class BirthDay{
    int day;
    int month;
    int year;

    public void setYear(int year) {
        this.year = year;
    }

    public void printThis() {
        System.out.println(this); //현재 자신의 메모리(주소)값을 가리킴
    }
}
public class ThisExample {
    public static void main(String[] args) {
        BirthDay b1 = new BirthDay();
        BirthDay b2 = new BirthDay();
        System.out.println(b1);
        System.out.println(b2);
        b1.printThis();
        b2.printThis();
    }
}
