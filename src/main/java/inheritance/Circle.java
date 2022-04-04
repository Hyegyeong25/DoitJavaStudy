package inheritance;

public class Circle {
    //상속은 아님, 포함관계
    Point point; // x, y
    private int radius;

    public Circle(){
        point = new Point();
    }
}
