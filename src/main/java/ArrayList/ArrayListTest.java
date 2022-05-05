package ArrayList;

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {

        Student studentLee = new Student(1000, "Lee");
        studentLee.addSubject("국어", 100);
        studentLee.addSubject("수학", 60);

        studentLee.showStudentInfo();
        System.out.println("------------------------------");
        Student studentKim = new Student(1001, "Kim");
        studentKim.addSubject("국어", 70);
        studentKim.addSubject("수학", 99);

        studentKim.showStudentInfo();
    }
}
