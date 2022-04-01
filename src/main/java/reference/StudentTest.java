package reference;

public class StudentTest {
    public static void main(String[] args) {

        Student studentJames = new Student(100, "제임스");
        studentJames.setKorea("국어", 100);
        studentJames.setMath("수학", 100);

        Student studentThomas = new Student(100, "토마스");
        studentThomas.setKorea("국어", 80);
        studentThomas.setMath("수학", 60);

        studentJames.showStudentInfo();
        studentThomas.showStudentInfo();
    }
}
