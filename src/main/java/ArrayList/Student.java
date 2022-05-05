package ArrayList;

import java.util.ArrayList;

public class Student {

    //학생의 요소에 있는 것은 학생 아이디, 이름
    private int studentID;
    private String studentName;
    // 그리고 과목에 관한 배열
    private ArrayList<Subject> subjectList;

    //생성자
    public Student(int studentID, String studentName) {
        this.studentID = studentID;
        this.studentName = studentName;

        subjectList = new ArrayList<Subject>();
    }

    //subjectList에 값 넣어주기
    public void addSubject(String name, int score) {
        Subject subject = new Subject();
        subject.setName(name);
        subject.setScorePoint(score);

        subjectList.add(subject);
    }

    public void showStudentInfo() {

        int total = 0;
        for(Subject subject : subjectList){
            total += subject.getScorePoint();
            System.out.println("학생 "+studentName+"님의 "+subject.getName()+
                    "과목의 성적은 "+subject.getScorePoint()+"입니다.");
        }
        System.out.println("학생 "+studentName+"님의 총점은 "+total+"점 입니다.");
    }
}
