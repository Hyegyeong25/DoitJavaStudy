package staticex;

public class StudentTest1 {
    public static void main(String[] args) {
        //static은 공유하는 값
        //클래스 인스턴스 = 뉴 생성자
        //static 변수는 클래스.get메서드() 형태로 출력

        System.out.println(Student.getSerialNum()); // 10000

        Student studentJ = new Student();
        System.out.println(Student.getSerialNum()); // 10001

        Student studentT = new Student();
        System.out.println(Student.getSerialNum()); //10002

    }
}
