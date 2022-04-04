package staticex;

public class Student {
    //private : 외부에서 건드릴 수 없음
    private static int serialNum = 10000;
    int studentID;
    String studentName;

    public Student() {
        serialNum++;
        studentID = serialNum;
    }

    public static int getSerialNum() {
        int i = 10; //지역 변수, 메서드가 호출 될 때 생성

        i++;
        System.out.println(i);

        //studentName = "홍길동"; //멤버변수, 인스턴스 변수
        //인스턴스 변수의 경우 꼭 인스턴스가 먼저 생성되어야 하므로
        //static 메서드에서는 생성이 불확실한 인스턴스 변수를 사용할 수 없음

        return serialNum; //클래스 변수, static 변수
    }

}
