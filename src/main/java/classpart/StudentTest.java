package classpart;

public class StudentTest {

    public static void main(String[] args) {
        int i = 10; // 기본데이터 타입
        //student는 객체 타입

        // jvm 이 실행해줌
        Student studentJoo = new Student(100, "혜경"); //지역 변수 studentJoo,
        /*studentJoo.studentName = "주혜경";
        studentJoo.studentID = 100;
        studentJoo.address = "서울시 영등포구";
*/
        Student studentKim = new Student();
        studentKim.studentName = "김유신";
        studentKim.studentID = 101;
        studentKim.address = "서울시 강서구";

        System.out.println(studentJoo); // classpart.Student@1b6d3586 클래스 풀네임@주소
        studentKim.showStudentInfo();
    }
}
