package classpart;

public class Student {

    int studentID;
    String studentName;
    int grade;
    String address;

    //method, 객체 생성
    public Student() {}
    public Student(int id, String name) {
        studentID = id;
        studentName = name;
    }
    //동일한 이름을 가진 생성자가 여러개일때 생성자 오버로딩이라 함

    public void showStudentInfo(){
        System.out.println(studentName+", "+address);
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String name) {
        studentName = name;
    }

}
